package com.lechenggu.qiantai.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.lechenggu.qiantai.service.ICustomerBiz;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import pojo.Tcustomer;
@Scope("prototype")
@Controller("doTcus")
public class TcustomeAction extends ActionSupport {
	
	private Tcustomer tcus;

	public Tcustomer getTcus() {
		return tcus;
	}

	public void setTcus(Tcustomer tcus) {
		this.tcus = tcus;
	}
	@Autowired
	private ICustomerBiz cusbiz;
	@Override
	public String execute() throws Exception {
		
		
		Tcustomer cuss=cusbiz.doLogin(tcus);
		if (cuss!=null) {
			ActionContext.getContext().getSession().put("cus",tcus);
			
			return SUCCESS;
		}
		 
		return INPUT;
	}
	
	
	

}
