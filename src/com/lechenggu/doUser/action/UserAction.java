package com.lechenggu.doUser.action;
  
import javax.annotation.Resource;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
 


import pojo.Tuser;

import com.lechenggu.tuser.biz.IUserBiz;
 
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
 
@Scope("prototype")
@Controller("douserAction")
public class UserAction extends ActionSupport{
	 
	private Tuser user;

	public Tuser getUser() {
		return user;
	}

	public void setUser(Tuser user) {
		this.user = user;
	}
@Autowired 
private IUserBiz userBiz;
    
    
/*@Action(value="dengLu",results= {
		 @Result(name="success",location="/index.jsp"),
		 @Result(name="input",location="/login.jsp")
		  })*/
 	
	public String dologin() {
		Tuser us=userBiz.doLogin(user);
//		 Tuser us=userBiz.doLogin(user.getLoginname(),user.getPassword());
		if (us!=null) {
			ActionContext.getContext().getSession().put("user", us);
			return SUCCESS;//视图
		} else {
			return INPUT;
		}

	}
	
	public void validateDologin(){
		 	
		if(null==user.getLoginname()||"".equals(user.getLoginname())){
			super.addActionError("用户名不能为空!");
		}
		if(null==user.getPassword()||"".equals(user.getPassword())){
			super.addActionError("密码不能为空!");
		}
		
	}

}
