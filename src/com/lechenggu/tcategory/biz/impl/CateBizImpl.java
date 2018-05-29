package com.lechenggu.tcategory.biz.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

 


import Util.JdbcUtil;

import com.lechenggu.tcategory.biz.IcategoryBiz;
import com.lechenggu.tcategory.dao.Icategory;
import com.lechenggu.tcategory.dao.impl.CateDaoImpl;
import com.lechenggu.tcategory.entity.Tcategory;
import com.lechenggu.tcategorysecond.biz.IcateSecondBiz;
import com.lechenggu.tcategorysecond.biz.impl.IcateSecondBizImpl;
import com.lechenggu.tgoods.biz.IgoodsBiz;
import com.lechenggu.tgoods.biz.impl.IgoodsBizImpl;

 
public class CateBizImpl implements IcategoryBiz {

	private Icategory catedao;
	public void setCatedao(Icategory catedao) {
		this.catedao = catedao;
	}
	@Override
	public int QueryCate() {
		 
		return catedao.QueryCate();
	}
	@Override
	public List<Tcategory> querCate(int pgNo, int pgSe) {
	 
		return catedao.querCate(pgNo,pgSe);
	}
	@Override
	public int addCate(Tcategory cate) {
		 
		return catedao.addCatey(cate);
	}
	@Override
	public List<Tcategory> queryAllCa() {
		 
		return catedao.queryAllCa();
	}
	@Override
	public Tcategory querById(int id) {
		 
		return catedao.querById(id);
	}
	@Override
	public void updateTcategory(Tcategory cate) {
		 
		catedao.updateTcategory(cate);
	}
	@Override
	public void deleteDaCate(int id) {
		 
			 
			catedao.deleteDaCate(id);
			 
		
	}
}
