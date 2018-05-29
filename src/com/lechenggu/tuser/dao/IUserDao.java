package com.lechenggu.tuser.dao;

import java.util.List;

import com.lechenggu.tuser.entitys.Tuser;

 

public interface IUserDao {
	public Tuser doLogin(String name, String pwd);
	public int addUser(Tuser user);
//	用户分页
	public int queryToRows();
	public List<Tuser> querUser(int pgNo, int pgSe);
	public Tuser updateUsers(int id);
	public int updateUes(Tuser user);
	public int deleterUse(int id);
}
