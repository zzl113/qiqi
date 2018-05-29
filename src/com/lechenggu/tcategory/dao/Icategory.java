package com.lechenggu.tcategory.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.lechenggu.tcategory.entity.Tcategory;

public interface Icategory {
	public int QueryCate();
	public List<Tcategory> querCate(int pgNo, int pgSe);
	public int addCatey(Tcategory cate);
	public List<Tcategory> queryAllCa();
	public Tcategory querById(int id);
	public void updateTcategory(Tcategory cate);
	public void deleteDaCate(int id);
	 
}