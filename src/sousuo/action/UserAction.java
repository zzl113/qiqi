package sousuo.action;

import sousuo.dao.User;
import sousuo.dao.impl.IUser;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
	private int id;
	
	
	
	
	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}



private User da=new IUser();
	@Override
	public String execute() throws Exception {
		int i= da.deleuser(id);
		if(i<=0){
		 return "keyi";}
		else{
		return super.execute();}
	}

}
