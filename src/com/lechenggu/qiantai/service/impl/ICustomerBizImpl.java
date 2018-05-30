package com.lechenggu.qiantai.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lechenggu.qiantai.dao.ICustomerDao;
import com.lechenggu.qiantai.service.ICustomerBiz;

import pojo.Tcustomer;
@Service
public class ICustomerBizImpl implements ICustomerBiz {
@Autowired
private ICustomerDao cusdao;
	public void setCusdao(ICustomerDao cusdao) {
	this.cusdao = cusdao;
}
	@Override
	public Tcustomer doLogin(Tcustomer tcus) {
		 
		return cusdao.doLogin(tcus);
	}

}
