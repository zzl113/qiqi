package sousuo.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import sousuo.entity.Tcategorysecond;

 
 

public interface ISecondCate {
   public void saveSeconde(Tcategorysecond cate); 
   public int queryAllCateNums();
   public Tcategorysecond queryById(int id);
   public void updateSeconde(Tcategorysecond cate);
   public void deleteSeconde(int id,Connection conn) throws SQLException;
   public List<Tcategorysecond> querySmallCateByBigId(int bid);
   public List<Tcategorysecond> querySmallByCat(int smallId);
   
}
