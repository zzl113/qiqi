package com.lechenggu.tgoods.biz;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

 





import com.lechenggu.tcategory.entity.Tcategory;
import com.lechenggu.tcategorysecond.entity.Tcategorysecond;
import com.lechenggu.tgoods.entity.Tgoods;

public interface IgoodsBiz {
	public int 	QueryGoods();
	public List<Tgoods> querGoods(int pgNo, int pgSe);
	public int addTgoods(Tgoods good);
	public List<Tcategorysecond> querySmallBig(int BigId);
	
	public Tgoods queryGoods(int id);
	 public List<Tcategory> queryAllcategory();
	 List<Tcategorysecond>chaxunSmallBig(int csid);
	 public void updateTgoods(Tgoods tg);
	 public void deleteTgoods(int id);
 

}
