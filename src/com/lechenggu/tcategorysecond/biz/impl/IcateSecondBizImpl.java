package com.lechenggu.tcategorysecond.biz.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

 



 




import Util.JdbcUtil;

import com.lechenggu.tcategory.entity.Tcategory;
import com.lechenggu.tcategorysecond.biz.IcateSecondBiz;
import com.lechenggu.tcategorysecond.dao.IcateSecondDao;
import com.lechenggu.tcategorysecond.dao.impl.IcateSecondDaoImpl;
import com.lechenggu.tcategorysecond.entity.Tcategorysecond;
import com.lechenggu.tgoods.biz.IgoodsBiz;
import com.lechenggu.tgoods.biz.impl.IgoodsBizImpl;

  

public class IcateSecondBizImpl implements IcateSecondBiz {
private IcateSecondDao sd;
	public void setSd(IcateSecondDao sd) {
	this.sd = sd;
}
	@Override
	public int QueryCateSecond() {
		 
		return sd.QueryCateSecond();
	}
	@Override
	public List<Tcategorysecond> querCateSecond(int pgNo, int pgSe) {
		 
		return sd.querCateSecond(pgNo, pgSe);
	}
	@Override
	public int addSmalCate(Tcategorysecond cate) {
		 
		return sd.addSmallCate(cate);
	}
	@Override
	public Tcategorysecond updateScate(int id) {
		 
		return sd.updateScate(id);
	}
	@Override
	public Tcategorysecond querById(int id) {
		// TODO Auto-generated method stub
		return sd.querById(id);
	}
	@Override
	public List<Tcategory> queryAllCa() {
	
		return sd.queryAllCa(); 
	}
	@Override
	public void updateTcategorysecond(Tcategorysecond cate) {
     sd.updateTcategorysecond(cate);
		
	}
	 
	@Override
	public void deleteSenCate(int id) {
		 sd.deletSecongCate(id);
	}

}
