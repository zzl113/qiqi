package com.lechenggu.tuser.dao;

import java.util.List;

<<<<<<< HEAD
import pojo.Tuser;

 
=======
import com.lechenggu.tuser.entitys.Tuser;
>>>>>>> f287f93b8f1d0f9e14a942804a73323837f6ccac

 

public interface IUserDao {
<<<<<<< HEAD
//	public Tuser doLogin(String name, String pwd);
	public Tuser doLogin(Tuser user);
//	public int addUser(Tuser user);
////	用户分页
//	public int queryToRows();
//	public List<Tuser> querUser(int pgNo, int pgSe);
//	public Tuser updateUsers(int id);
//	public int updateUes(Tuser user);
//	public int deleterUse(int id);
 }
=======
	public Tuser doLogin(String name, String pwd);
	public int addUser(Tuser user);
//	用户分页
	public int queryToRows();
	public List<Tuser> querUser(int pgNo, int pgSe);
	public Tuser updateUsers(int id);
	public int updateUes(Tuser user);
	public int deleterUse(int id);
}
>>>>>>> f287f93b8f1d0f9e14a942804a73323837f6ccac
