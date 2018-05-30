package com.lechenggu.tuser.action.logintuser;

<<<<<<< HEAD
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

=======
>>>>>>> f287f93b8f1d0f9e14a942804a73323837f6ccac
import com.lechenggu.tuser.biz.IUserBiz;
import com.lechenggu.tuser.biz.impl.UserBizImpl;
import com.lechenggu.tuser.entitys.Tuser;
import com.opensymphony.xwork2.ActionSupport;
<<<<<<< HEAD
@Scope("prototype")
@Controller("UpuserAction")
=======

>>>>>>> f287f93b8f1d0f9e14a942804a73323837f6ccac
public class UpdataTuser extends ActionSupport {
	private int tid;
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public Tuser getUser() {
		return user;
	}
	public void setUser(Tuser user) {
		this.user = user;
	}
	private Tuser user;
<<<<<<< HEAD
	@Autowired
=======
>>>>>>> f287f93b8f1d0f9e14a942804a73323837f6ccac
	private IUserBiz userBiz;
public void setUserBiz(IUserBiz userBiz) {
		this.userBiz = userBiz;
	}
public String updateUser(){
	 user=userBiz.updateUsers(tid);
	return SUCCESS;
	
	
}
 
public String updateUe(){
	Tuser ue=new Tuser();
	ue.setRealname(user.getRealname());
	ue.setLoginname(user.getLoginname());
	ue.setPassword(user.getPassword());
	ue.setAddress(user.getAddress());
	ue.setTel(user.getTel());
	ue.setSex(user.getSex());
	ue.setCardid(user.getCardid());
	ue.setEmail(user.getEmail());
	ue.setBirthday(user.getBirthday());
	ue.setId(user.getId());
	int i=userBiz.updateUe(ue);
	
	if(i>0){
		
		
		return "good";
		}else{
			
	return "shibai";}
	 
	
	
	
	
}



}
