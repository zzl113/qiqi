package com.lechenggu.tcategorysecond.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

 


import com.lechenggu.tcategory.entity.Tcategory;
import com.lechenggu.tcategorysecond.entity.Tcategorysecond;

 
 

public interface IcateSecondDao {
public int QueryCateSecond();
public List<Tcategorysecond> querCateSecond(int pgNo, int pgSe);
public int addSmallCate(Tcategorysecond cate);
public Tcategorysecond updateScate(int id);
public Tcategorysecond querById(int id);
public List<Tcategory> queryAllCa();
public void updateTcategorysecond(Tcategorysecond cate);
 
//根据ID删除小分类
public void deletSecongCate(int id) ;
}
