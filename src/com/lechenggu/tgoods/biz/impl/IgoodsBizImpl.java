package com.lechenggu.tgoods.biz.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.lechenggu.tcategory.entity.Tcategory;
import com.lechenggu.tcategorysecond.entity.Tcategorysecond;
import com.lechenggu.tgoods.biz.IgoodsBiz;
 
import com.lechenggu.tgoods.dao.IgoodsDao;
import com.lechenggu.tgoods.dao.impl.IgoodsDaoImpl;
import com.lechenggu.tgoods.entity.Tgoods;

public class IgoodsBizImpl implements IgoodsBiz {
private IgoodsDao gd=new IgoodsDaoImpl();
	@Override
	public int QueryGoods() {
		 
		return gd.QueryGoods();
	}

	@Override
	public List<Tgoods> querGoods(int pgNo, int pgSe) {
		 
		return  gd.querGoods(pgNo, pgSe);
	}

	@Override
	public int addTgoods(Tgoods good) {
		// TODO Auto-generated method stub
		return gd.addTgoods(good);
	}

	@Override
	public List<Tcategorysecond> querySmallBig(int BigId) {
		 
		return gd.querySmallBig(BigId);
	}

	@Override
	public Tgoods queryGoods(int id) {
		// TODO Auto-generated method stub
		return gd.queryGoods(id);
	}

	@Override
	public List<Tcategory> queryAllcategory() {
		// TODO Auto-generated method stub
		return gd.queryAllcategory();
	}

	@Override
	public List<Tcategorysecond> chaxunSmallBig(int csid) {
		// TODO Auto-generated method stub
		return gd.chaxunSmallBig(csid);
	}

	@Override
	public void updateTgoods(Tgoods tg) {
	 
		gd.updateTgoods(tg);
	}

	@Override
	public void deleteTgoods(int id) {
		gd.deleteTgoods(id);
		
	}

	 

}
