package com.service;

import org.apache.ibatis.annotations.Param;

import com.entity.Area;
import com.entity.SmCustomer;
import com.entity.SmStartupintention;

public interface SmStartupintentionService {

	void insertSelective(SmStartupintention startUp);

	Area nameSelect( @Param("areaId") String areaId);

	Area nameSelectCity(String string, String id);

	Integer selectPhone(String phone);

	SmCustomer selectCustomerPhone(String phone);

	SmCustomer selectCustomerWechat(String wechat);

	void insertCustomer(SmStartupintention startUp);

	Integer seleSource(String source);

	Integer selectProject(String id, String project);

}
