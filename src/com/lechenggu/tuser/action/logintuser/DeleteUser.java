package com.lechenggu.tuser.action.logintuser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.lechenggu.tuser.biz.IUserBiz;
import com.lechenggu.tuser.biz.impl.UserBizImpl;
import com.opensymphony.xwork2.ActionSupport;
@Scope("prototype")
@Controller("deuserAction")
public class DeleteUser extends ActionSupport{
 public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

private int tid;
@Autowired
private IUserBiz userBiz;
public void setUserBiz(IUserBiz userBiz) {
	this.userBiz = userBiz;
}

public String deleterUser(){
	
	int t=userBiz.deleterUser(tid);
	if(t>0){
		
	
	return SUCCESS;}else{
	return "shibai";
	
	}
	
}
 

}
