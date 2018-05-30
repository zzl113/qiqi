package com.lechenggu.tuser.action.logintuser;

<<<<<<< HEAD
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.lechenggu.tuser.biz.IUserBiz;
import com.lechenggu.tuser.biz.impl.UserBizImpl;
import com.opensymphony.xwork2.ActionSupport;
@Scope("prototype")
@Controller("deuserAction")
=======
import com.lechenggu.tuser.biz.IUserBiz;
import com.lechenggu.tuser.biz.impl.UserBizImpl;
import com.opensymphony.xwork2.ActionSupport;

>>>>>>> f287f93b8f1d0f9e14a942804a73323837f6ccac
public class DeleteUser extends ActionSupport{
 public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

private int tid;
<<<<<<< HEAD
@Autowired
=======
>>>>>>> f287f93b8f1d0f9e14a942804a73323837f6ccac
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
