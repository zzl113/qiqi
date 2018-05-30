package com.lechenggu.tcategorysecond.biz;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

 



import com.lechenggu.tcategory.entity.Tcategory;
import com.lechenggu.tcategorysecond.entity.Tcategorysecond;
import com.lechenggu.tuser.entitys.Tuser;

public interface IcateSecondBiz {
public int 	QueryCateSecond();
public List<Tcategorysecond> querCateSecond(int pgNo, int pgSe);
public int addSmalCate(Tcategorysecond cate);
public Tcategorysecond updateScate(int id);
public Tcategorysecond querById(int id);
public List<Tcategory> queryAllCa();
public void updateTcategorysecond(Tcategorysecond cate);
 
//删除小分类
public void deleteSenCate(int id);
}
