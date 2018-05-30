package com.service.Impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.SmStartupintentionMapper;
import com.entity.Area;
import com.entity.OaNotify;
import com.entity.OaNotifyRecord;
import com.entity.SmCustomer;
import com.entity.SmStartupintention;
import com.service.SmStartupintentionService;

@Service
public class SmStartupintentionImpl implements SmStartupintentionService {

	@Autowired
	private SmStartupintentionMapper smStartupintentionMapper;

	public void insertSelective(SmStartupintention startUp) {
		String newName = newName("CYYX");
		startUp.setName(newName);
		if("37".equals(startUp.getSource())){
			startUp.setSourceName("必普餐饮公众号");
		}
		smStartupintentionMapper.insertSelective(startUp);
	}

	public Area nameSelect(String areaId) {
		Area area = smStartupintentionMapper.nameSelect(areaId);
		return area;
	}

	public Area nameSelectCity(String areaId, String cityId) {
		Area area = smStartupintentionMapper.nameSelectCity(areaId, cityId);
		return area;
	}

	public Integer selectPhone(String phone) {
		Integer phoneNum = smStartupintentionMapper.selectPhone(phone);
		return phoneNum;
	}

	public SmCustomer selectCustomerPhone(String phone) {
		SmCustomer PhoneCustomer = smStartupintentionMapper.selectCustomerPhone(phone);
		return PhoneCustomer;
	}

	public SmCustomer selectCustomerWechat(String wechat) {
		SmCustomer wechatCustomer = smStartupintentionMapper.selectCustomerWechat(wechat);
		return wechatCustomer;
	}

	public String newName(String tableName) {
		String name = "";
		int oldnum = smStartupintentionMapper.selectNewNum(tableName);
		String num = (oldnum + 1) + "";
		smStartupintentionMapper.updateNewNum(tableName, (oldnum + 1));
		while (num.length() < 6) {
			num = "0" + num;
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String date = sdf.format(new Date());
		name = tableName + date + num;
		return name;
	}

	public void insertCustomer(SmStartupintention startUp) {
		String newName = newName("KH");

		SmCustomer smCustomer = new SmCustomer();
		smCustomer.setCustomername(startUp.getCustomername());
		smCustomer.setCustomersource(startUp.getSource());
		String sourceName = smStartupintentionMapper.getSourceName(startUp.getSource());
		smCustomer.setCustomersourceName(sourceName);
		//修改了项目，要根据健值去查询来源项目名
		smCustomer.setSourceproject(smStartupintentionMapper.getProjectName(startUp.getProject()));
		smCustomer.setAreaId(startUp.getAreaId());
		smCustomer.setProvinceId(startUp.getProvinceId());
		smCustomer.setCityId(startUp.getCityId());
		smCustomer.setUpdateBy("1");
		smCustomer.setUpdateDate(new Date());
		smCustomer.setCreateBy("1");
		smCustomer.setCreateDate(new Date());
		smCustomer.setPhone(startUp.getPhone());
		smCustomer.setWechat(startUp.getWechat());
		smCustomer.setDelFlag("0");
		smCustomer.setInDate(new Date());
		smCustomer.setCustomertype("50");
		smCustomer.setYutime(startUp.getInvestigatedate());
		smCustomer.setStatus("celestialLeague");
		smCustomer.setName(newName);
		smCustomer.setSex(startUp.getGender());
		smCustomer.setCreateName("系统管理员");
		smCustomer.setUpdateName("系统管理员");
		smCustomer.setIsfullpayment("0");
		smCustomer.setCustomersource2("BEPPublicNumber");
		smCustomer.setCustomerSource2Name("必普餐饮公众号");
		smCustomer.setCustomersource("37");
        smCustomer.setCustomersourceName("必普餐饮公众号");
		/*
		 * String Age=smStartupintentionMapper.selectAge(startUp.getAge());
		 * Integer newAge=null; if(Age!=null){ newAge=Integer.valueOf(Age); }
		 * smCustomer.setAge(newAge);
		 */
		smStartupintentionMapper.insertCustomer(smCustomer);
		try {
			//发送给杜璇项目内通知
			OaNotify oaNotify=new OaNotify();
			//标题
			oaNotify.setTitle("普通通知");
			//类型
			oaNotify.setType("4");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			//内容
			oaNotify.setContent("比普餐饮公众号创建新客户编号："+smCustomer.getName()+",创建时间："+sdf.format(new Date()));
			//状态
			oaNotify.setStatus("1");
			oaNotify.setCreateBy("1");
			oaNotify.setCreateDate(new Date());
			oaNotify.setUpdateBy("1");
			oaNotify.setUpdateDate(new Date());
			oaNotify.setDelFlag("0");
			smStartupintentionMapper.insertSelectiveOaNotify(oaNotify);
			//创建通知子表
			OaNotifyRecord oaNotifyRecord =new OaNotifyRecord();
			oaNotifyRecord.setOaNotifyId(oaNotify.getId());
			oaNotifyRecord.setUserId("843030d1be94473198d5246aa0df6c06");
			oaNotifyRecord.setReadFlag("0");
			smStartupintentionMapper.insertSelectiveNotifyRecord(oaNotifyRecord);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	public Integer seleSource(String source) {
		Integer sourceNum = smStartupintentionMapper.seleSource(source);
		return sourceNum;
	}

	public Integer selectProject(String id, String project) {
		Integer projectNum = smStartupintentionMapper.selectProject(id, project);
		return projectNum;
	}

}
