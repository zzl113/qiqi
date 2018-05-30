 package com.lechenggu.tuser.biz.impl;

 

import java.lang.reflect.Proxy;
import java.util.List;

<<<<<<< HEAD
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pojo.Tuser;

=======
>>>>>>> f287f93b8f1d0f9e14a942804a73323837f6ccac
import com.lechenggu.handler.MyHandler;
import com.lechenggu.tuser.biz.IUserBiz;
import com.lechenggu.tuser.dao.IUserDao;
import com.lechenggu.tuser.dao.impl.UserDaoImpl;
<<<<<<< HEAD
 

@Service
public class UserBizImpl implements IUserBiz {
//private IUserDao userda = new UserDaoImpl();
	@Autowired
	private IUserDao userdao;
//   IUserDao  userdao=(IUserDao) Proxy.newProxyInstance
//		   (userda.getClass().getClassLoader(),
//				   UserDaoImpl.class.getInterfaces(),
//				   new MyHandler(userda));

 
=======
import com.lechenggu.tuser.entitys.Tuser;


public class UserBizImpl implements IUserBiz {
private IUserDao userda = new UserDaoImpl();

   IUserDao  userdao=(IUserDao) Proxy.newProxyInstance
		   (userda.getClass().getClassLoader(),
				   UserDaoImpl.class.getInterfaces(),
				   new MyHandler(userda));


>>>>>>> f287f93b8f1d0f9e14a942804a73323837f6ccac
	public void setUserdao(IUserDao userdao) {
	this.userdao = userdao;
}
	@Override
<<<<<<< HEAD
//	public Tuser doLogin(String loginname, String password) 
	public Tuser doLogin(Tuser user){
		  
		return userdao.doLogin(user);
	}
//	@Override
//	public int addUser(Tuser user) {
//		 
//		return userdao.addUser(user);
//	}
//	@Override
//	public List<Tuser> querUser(int pgNo, int pgSe) {
//		// TODO Auto-generated method stub
//		return userdao.querUser(pgNo, pgSe);
//	}
//	@Override
//	public int queryToRows() {
//		 
//		return userdao.queryToRows() ;
//	}
//	@Override
//	public Tuser updateUsers(int id) {
//		 
//		return userdao.updateUsers(id);
//	}
//	@Override
//	public int updateUe(Tuser user) {
//		 
//		return userdao.updateUes(user);
//	}
//	@Override
//	public int deleterUser(int id) {
//		// TODO Auto-generated method stub
//		return userdao.deleterUse(id);
//	}
=======
	public Tuser doLogin(String loginname, String password) {
		  
		return userdao.doLogin(loginname, password);
	}
	@Override
	public int addUser(Tuser user) {
		 
		return userdao.addUser(user);
	}
	@Override
	public List<Tuser> querUser(int pgNo, int pgSe) {
		// TODO Auto-generated method stub
		return userdao.querUser(pgNo, pgSe);
	}
	@Override
	public int queryToRows() {
		 
		return userdao.queryToRows() ;
	}
	@Override
	public Tuser updateUsers(int id) {
		 
		return userdao.updateUsers(id);
	}
	@Override
	public int updateUe(Tuser user) {
		 
		return userdao.updateUes(user);
	}
	@Override
	public int deleterUser(int id) {
		// TODO Auto-generated method stub
		return userdao.deleterUse(id);
	}
>>>>>>> f287f93b8f1d0f9e14a942804a73323837f6ccac

}
