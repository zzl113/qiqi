package sousuo.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import sousuo.entity.GoodCondition;
import sousuo.entity.Tgoods;

 

public interface IGoodDao { 
   List<Tgoods> queryGoods(GoodCondition goodCon,int pageNo,int pageSize); 
   public  int queryGoodsPages(GoodCondition goodCon,int pageSize);
}
