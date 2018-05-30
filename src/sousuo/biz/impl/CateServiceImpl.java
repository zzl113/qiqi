package sousuo.biz.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
 




 


import sousuo.biz.ICateService;
import sousuo.dao.ICategryDao;
import sousuo.dao.ISecondCate;
import sousuo.dao.impl.CategryDaoImpl;
import sousuo.dao.impl.SecondeCateDaoImpl;
import sousuo.entity.Tcategory;
import sousuo.entity.Tcategorysecond;
 
 
 
 

public class CateServiceImpl implements ICateService {
   
	@Override
	public List<Tcategory> queryAllCatergrys() {
	    //调用dao
		ICategryDao cdao = new CategryDaoImpl();
		ISecondCate sdao = new SecondeCateDaoImpl();
		List<Tcategory> ret =cdao.queryAllCateGry();
		for(Tcategory cat:ret) {//让每个大分类对象持有自己的小分类的集合
			cat.setSmalls(sdao.querySmallCateByBigId(cat.getId())); 
		}
		return ret;
	}
	@Override
	public List<Tcategory> queryAllCatergrys2() {
	    //调用dao
		ICategryDao cdao = new CategryDaoImpl();
		ISecondCate sdao = new SecondeCateDaoImpl();
		List<Tcategory> ret =cdao.queryAllCateGry();
		 
		return ret;
	}

	@Override
	public List<Tcategorysecond> querySmallByBig(int bigId) {
		ISecondCate sdao = new SecondeCateDaoImpl();
		
		return sdao.querySmallCateByBigId(bigId);
	}

	@Override
	public void deleteSmallCate(int id) {
		//1.获得connection对象 并且设置自动提交是false
	 
		//为了保证两个dao的方法在同一个事物中，业务逻辑层此处破坏了分层 业务逻辑层出现了数据库概念
		//业务逻辑层获得connection对象禁用自动事物 传给两个执行sql语句的dao的方法  来实现两个方法的sql在一个事物控制当中
	}

	@Override
	public List<Tcategorysecond> querySmallByCat(int smallId) {
		ISecondCate sdao = new SecondeCateDaoImpl();
		return sdao.querySmallByCat(smallId);
	}



}
