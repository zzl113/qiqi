package com.lechenggu.tuser.action.logintuser;

import com.lechenggu.tuser.biz.IUserBiz;
import com.lechenggu.tuser.biz.impl.UserBizImpl;
import com.opensymphony.xwork2.ActionSupport;

public class DeleteUser extends ActionSupport{
 public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

private int tid;
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
