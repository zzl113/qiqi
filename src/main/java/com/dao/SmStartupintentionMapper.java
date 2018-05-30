package com.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.entity.Area;
import com.entity.OaNotify;
import com.entity.OaNotifyRecord;
import com.entity.SmCustomer;
import com.entity.SmStartupintention;

@Repository
public interface SmStartupintentionMapper {
    int deleteByPrimaryKey(String id);

    int insert(SmStartupintention record);

    int insertSelective(SmStartupintention record);

    SmStartupintention selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SmStartupintention record);

    int updateByPrimaryKey(SmStartupintention record);

	Area nameSelect(@Param("areaId") String areaId);

	Area nameSelectCity(@Param("areaId") String areaId, @Param("cityId") String cityId);

	Integer selectPhone(@Param("phone") String phone);

	SmCustomer selectCustomerPhone( @Param("phone") String phone);

	SmCustomer selectCustomerWechat(@Param("wechat") String wechat);

	void insertCustomer(SmCustomer smCustomer);

	String selectAge(@Param("age") String age);

	Integer seleSource( @Param("source") String source);

	Integer selectNewNum( @Param("name") String name);

	void updateNewNum(@Param("tableName")String tableName,@Param("newNum") int newNum);

	Integer selectProject(@Param("id") String id,@Param("project") String project);

	String getSourceName(@Param("source") String source);

	String getProjectName(@Param("project") String project);

	void insertSelectiveOaNotify(OaNotify oaNotify);

	void insertSelectiveNotifyRecord(OaNotifyRecord oaNotifyRecord);
}