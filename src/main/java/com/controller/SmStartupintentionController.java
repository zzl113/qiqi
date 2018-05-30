package com.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.entity.Area;
import com.entity.SmCustomer;
import com.entity.SmStartupintention;
import com.service.SmStartupintentionService;

@Controller
@RequestMapping(value = "/sm/smStartupintention")
public class SmStartupintentionController {

	@Autowired
	private SmStartupintentionService smStartupintentionService;
	@Autowired
	private HttpServletRequest request;

	@RequestMapping("/backHomepage")
	public ModelAndView backHomepage(String source, HttpServletRequest request, HttpServletResponse response) {
		String newSource = request.getParameter("source");
		ModelAndView mode = new ModelAndView();
		mode.addObject("source", newSource);
		mode.setViewName("/smStartupintention.jsp");
		return mode;

	}

	/**
	 * 创业意向保存 1018-1-31 王道讯
	 * 
	 */

	@RequestMapping("/PublicNumber")
	public ModelAndView save(SmStartupintention startUp) {
        //根据手机号和微信号查询客户实体类
		SmCustomer customer=null;
		//写入创建更新者和日期
		startUp.setUpdateBy("1");
		startUp.setUpdateByName("系统管理员");
		startUp.setUpdateDate(new Date());
		startUp.setCreateBy("1");
		startUp.setCreateByName("系统管理员");
		startUp.setCreateDate(new Date());
		startUp.setDelFlag("0");
        //来源参数为空写入其它来源
		if (StringUtils.isEmpty(startUp.getSource())) {
			startUp.setSource("69");
			startUp.setSourceName("其他");
		}
		
		// 根据手机号查询客户
		 customer = smStartupintentionService.selectCustomerPhone(startUp.getPhone());
		 if(customer==null){//如果不能根据手机号查找到对应客户,根据微信号查询客户
		  customer = smStartupintentionService.selectCustomerWechat(startUp.getWechat());
		 }
		Area area = null;
		// 自治区保存
		if ((startUp.getProvinceId() != null && !"".equals(startUp.getProvinceId()))
				&& (startUp.getCityId() != null && !"".equals(startUp.getCityId()))
				&& (startUp.getAreaId() == null || "".equals(startUp.getAreaId()))) {
			// 根据省name查询区域ID
			Area newArea = smStartupintentionService.nameSelect("%" + startUp.getProvinceId() + "%");
			// 根据市name查询区域ID
			Area CityArea = smStartupintentionService.nameSelectCity("%" + startUp.getProvinceId() + "市辖%",
					newArea.getId());

			// 根据区name查询区域ID
			area = smStartupintentionService.nameSelectCity("%" + startUp.getCityId() + "%", CityArea.getId());
			startUp.setAreaId(area.getId());
			startUp.setProvinceId(newArea.getId());
			startUp.setCityId(CityArea.getId());
			startUp.setAreaName(area.getName());
			startUp.setProvinceName(newArea.getName());
			startUp.setCityName(CityArea.getName());
			if (!StringUtils.isEmpty(customer)) {
				Integer projectNum = smStartupintentionService.selectProject(customer.getId(),
						startUp.getProject());
				if (projectNum <= 0) {
					startUp.setCustomerId(customer.getId());
					startUp.setCustomerName(customer.getCustomername());
					smStartupintentionService.insertSelective(startUp);

				} else if (projectNum >= 1) {

				}

			} /*else if (!StringUtils.isEmpty(wechatCustomer)) {
				Integer projectNum = smStartupintentionService.selectProject(wechatCustomer.getId(),
						startUp.getProject());
				if (projectNum <= 0) {
					startUp.setCustomerId(wechatCustomer.getId());
					smStartupintentionService.insertSelective(startUp);
				} else if (projectNum >= 1) {

				}

			}*/
			// 如果都为空创建客户填写相关客户
			if (StringUtils.isEmpty(customer)) {
				smStartupintentionService.insertCustomer(startUp);
				// 根据手机号查询用户
				SmCustomer newPhoneCustomer = smStartupintentionService.selectCustomerPhone(startUp.getPhone());
				startUp.setCustomerId(newPhoneCustomer.getId());
				startUp.setCustomerName(newPhoneCustomer.getCustomername());
				smStartupintentionService.insertSelective(startUp);
			}
			ModelAndView mode = new ModelAndView();
			mode.addObject("source", startUp.getSource());
			mode.setViewName("/smSubmitSuccess.jsp");
			return mode;
		}

		if (startUp.getProvinceId() != null && !"".equals(startUp.getProvinceId())
				&& (startUp.getAreaId() != null && !"".equals(startUp.getAreaId()))) {
			// 根据省name查询区域ID
			area = smStartupintentionService.nameSelect("%" + startUp.getProvinceId() + "%");
			startUp.setProvinceId(area.getId());
			startUp.setProvinceName(area.getName());
		}
		if ((startUp.getCityId() != null && !"".equals(startUp.getCityId()))
				&& (area.getId() != null && !"".equals(area.getId()))
				&& (startUp.getAreaId() != null && !"".equals(startUp.getAreaId()))) {
			// 根据市name查询区域ID
			area = smStartupintentionService.nameSelectCity("%" + startUp.getCityId() + "%", area.getId());
			startUp.setCityId(area.getId());
			startUp.setCityName(area.getName());
		}
		if ((startUp.getAreaId() != null && !"".equals(startUp.getAreaId()))
				&& (area.getId() != null && !"".equals(area.getId()))) {
			// 根据区name查询区域ID
			area = smStartupintentionService.nameSelectCity("%" + startUp.getAreaId() + "%", area.getId());
			startUp.setAreaId(area.getId());
			startUp.setAreaName(area.getName());
		}
		if (!StringUtils.isEmpty(customer)) {
			Integer projectNum = smStartupintentionService.selectProject(customer.getId(), startUp.getProject());
			if (projectNum <= 0) {
				startUp.setCustomerId(customer.getId());
				startUp.setCustomerName(customer.getCustomername());
				smStartupintentionService.insertSelective(startUp);

			} else if (projectNum >= 1) {

			}

		} /*else if (!StringUtils.isEmpty(wechatCustomer)) {
			Integer projectNum = smStartupintentionService.selectProject(wechatCustomer.getId(), startUp.getProject());
			if (projectNum <= 0) {
				startUp.setCustomerId(wechatCustomer.getId());
				smStartupintentionService.insertSelective(startUp);
			} else if (projectNum >= 1) {

			}

		}*/

		// 如果都为空创建客户填写相关客户
		if (StringUtils.isEmpty(customer) ) {
			smStartupintentionService.insertCustomer(startUp);
			// 根据手机号查询用户
			SmCustomer newPhoneCustomer = smStartupintentionService.selectCustomerPhone(startUp.getPhone());
			startUp.setCustomerId(newPhoneCustomer.getId());
			startUp.setCustomerName(newPhoneCustomer.getCustomername());
			smStartupintentionService.insertSelective(startUp);
		}
		ModelAndView mode = new ModelAndView();
		mode.addObject("source", startUp.getSource());
		mode.setViewName("/smSubmitSuccess.jsp");
		return mode;
	}

	/**
	 * 校验手机号 1018-2-1 王道讯
	 * 
	 */
	@RequestMapping(value = "selectPhone", method = RequestMethod.POST, produces = "text/html;charset=UTF-8")
	@ResponseBody
	public String selectPhone(SmStartupintention startUp, HttpServletRequest request, HttpServletResponse response) {

		String phone = request.getParameter("phone");
		if (!StringUtils.isEmpty(phone)) {
			Integer phoneNum = smStartupintentionService.selectPhone(phone);
			if (phoneNum >= 1) {
				return "0";
			} else if (phoneNum <= 0) {
				return "1";
			}

		}

		return "1";

	}
}
