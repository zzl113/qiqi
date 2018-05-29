package sousuo.biz.impl;

import java.util.List;

 


import sousuo.biz.IGoodService;
import sousuo.dao.IGoodDao;
import sousuo.dao.impl.GoodDaoImpl;
import sousuo.entity.GoodCondition;
import sousuo.entity.Tgoods;

 

public class GoodServiceImpl implements IGoodService {
	private IGoodDao dao = new GoodDaoImpl();
	 
	@Override
	public List<Tgoods> queryGoods(GoodCondition goodCon,int pageNo,int pageSize) {
		//调用dao查询商品列表 
		return dao.queryGoods(goodCon,pageNo,pageSize);
	}
	public  int queryGoodsPages(GoodCondition goodCon,int pageSize) {
		return dao.queryGoodsPages(goodCon, pageSize);
	}
 
}
