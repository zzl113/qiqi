package com.lechenggu.tgoods.biz.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lechenggu.tcategory.entity.Tcategory;
import com.lechenggu.tcategorysecond.entity.Tcategorysecond;
import com.lechenggu.tgoods.biz.IgoodsBiz;
 
import com.lechenggu.tgoods.dao.IgoodsDao;
import com.lechenggu.tgoods.dao.impl.IgoodsDaoImpl;
import com.lechenggu.tgoods.entity.Tgoods;
@Service
public class IgoodsBizImpl implements IgoodsBiz {
@Autowired
private IgoodsDao gdao;
	 
 
 

	@Override
	public int QueryGoods() {
		 
		return gdao.QueryGoods();
	}

	@Override
	public List<Tgoods> querGoods(int pgNo, int pgSe) {
		 
		return  gdao.querGoods(pgNo, pgSe);
	}

	@Override
	public int addTgoods(Tgoods good) {
		// TODO Auto-generated method stub
		return gdao.addTgoods(good);
	}

	@Override
	public List<Tcategorysecond> querySmallBig(int BigId) {
		 
		return gdao.querySmallBig(BigId);
	}

	@Override
	public Tgoods queryGoods(int id) {
		// TODO Auto-generated method stub
		return gdao.queryGoods(id);
	}

	@Override
	public List<Tcategory> queryAllcategory() {
		// TODO Auto-generated method stub
		return gdao.queryAllcategory();
	}

	@Override
	public List<Tcategorysecond> chaxunSmallBig(int csid) {
		// TODO Auto-generated method stub
		return gdao.chaxunSmallBig(csid);
	}

	@Override
	public void updateTgoods(Tgoods tg) {
	 
		gdao.updateTgoods(tg);
	}

	@Override
	public void deleteTgoods(int id) {
		gdao.deleteTgoods(id);
		
	}

	 

}
