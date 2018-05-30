package com.lechenggu.tcategory.biz;

import java.util.List;

import com.lechenggu.tcategory.entity.Tcategory;
import com.lechenggu.tuser.entitys.Tuser;

public interface IcategoryBiz {
public int QueryCate();
public List<Tcategory> querCate(int pgNo, int pgSe);
public int addCate(Tcategory cate);
public List<Tcategory> queryAllCa();
public Tcategory querById(int id);
public void updateTcategory(Tcategory cate);
public void deleteDaCate(int id);

}
