package com.lechenggu.tgoods.biz.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

<<<<<<< HEAD
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

=======
>>>>>>> f287f93b8f1d0f9e14a942804a73323837f6ccac
import com.lechenggu.tcategory.entity.Tcategory;
import com.lechenggu.tcategorysecond.entity.Tcategorysecond;
import com.lechenggu.tgoods.biz.IgoodsBiz;
 
import com.lechenggu.tgoods.dao.IgoodsDao;
import com.lechenggu.tgoods.dao.impl.IgoodsDaoImpl;
import com.lechenggu.tgoods.entity.Tgoods;
<<<<<<< HEAD
@Service
public class IgoodsBizImpl implements IgoodsBiz {
@Autowired
private IgoodsDao gdao;
	 
 
 

	@Override
	public int QueryGoods() {
		 
		return gdao.QueryGoods();
=======

public class IgoodsBizImpl implements IgoodsBiz {
private IgoodsDao gd=new IgoodsDaoImpl();
	@Override
	public int QueryGoods() {
		 
		return gd.QueryGoods();
>>>>>>> f287f93b8f1d0f9e14a942804a73323837f6ccac
	}

	@Override
	public List<Tgoods> querGoods(int pgNo, int pgSe) {
		 
<<<<<<< HEAD
		return  gdao.querGoods(pgNo, pgSe);
=======
		return  gd.querGoods(pgNo, pgSe);
>>>>>>> f287f93b8f1d0f9e14a942804a73323837f6ccac
	}

	@Override
	public int addTgoods(Tgoods good) {
		// TODO Auto-generated method stub
<<<<<<< HEAD
		return gdao.addTgoods(good);
=======
		return gd.addTgoods(good);
>>>>>>> f287f93b8f1d0f9e14a942804a73323837f6ccac
	}

	@Override
	public List<Tcategorysecond> querySmallBig(int BigId) {
		 
<<<<<<< HEAD
		return gdao.querySmallBig(BigId);
=======
		return gd.querySmallBig(BigId);
>>>>>>> f287f93b8f1d0f9e14a942804a73323837f6ccac
	}

	@Override
	public Tgoods queryGoods(int id) {
		// TODO Auto-generated method stub
<<<<<<< HEAD
		return gdao.queryGoods(id);
=======
		return gd.queryGoods(id);
>>>>>>> f287f93b8f1d0f9e14a942804a73323837f6ccac
	}

	@Override
	public List<Tcategory> queryAllcategory() {
		// TODO Auto-generated method stub
<<<<<<< HEAD
		return gdao.queryAllcategory();
=======
		return gd.queryAllcategory();
>>>>>>> f287f93b8f1d0f9e14a942804a73323837f6ccac
	}

	@Override
	public List<Tcategorysecond> chaxunSmallBig(int csid) {
		// TODO Auto-generated method stub
<<<<<<< HEAD
		return gdao.chaxunSmallBig(csid);
=======
		return gd.chaxunSmallBig(csid);
>>>>>>> f287f93b8f1d0f9e14a942804a73323837f6ccac
	}

	@Override
	public void updateTgoods(Tgoods tg) {
	 
<<<<<<< HEAD
		gdao.updateTgoods(tg);
=======
		gd.updateTgoods(tg);
>>>>>>> f287f93b8f1d0f9e14a942804a73323837f6ccac
	}

	@Override
	public void deleteTgoods(int id) {
<<<<<<< HEAD
		gdao.deleteTgoods(id);
=======
		gd.deleteTgoods(id);
>>>>>>> f287f93b8f1d0f9e14a942804a73323837f6ccac
		
	}

	 

}
