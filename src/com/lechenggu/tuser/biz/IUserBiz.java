package com.lechenggu.tuser.biz;

import java.util.List;

<<<<<<< HEAD
import pojo.Tuser;

 

public interface IUserBiz {
//	用户登录
//public Tuser doLogin(String loginname,String password);
	public Tuser doLogin(Tuser user);
////添加用户
//public int addUser(Tuser user); 
////用户分页
//public List<Tuser> querUser(int pgNo, int pgSe);
//public int queryToRows();
//public Tuser updateUsers(int id);
//public int updateUe(Tuser user);
//public int deleterUser(int id);
=======
import com.lechenggu.tuser.entitys.Tuser;

public interface IUserBiz {
//	用户登录
public Tuser doLogin(String loginname,String password);
//添加用户
public int addUser(Tuser user); 
//用户分页
public List<Tuser> querUser(int pgNo, int pgSe);
public int queryToRows();
public Tuser updateUsers(int id);
public int updateUe(Tuser user);
public int deleterUser(int id);
>>>>>>> f287f93b8f1d0f9e14a942804a73323837f6ccac
}
