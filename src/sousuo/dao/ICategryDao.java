package sousuo.dao;

import java.util.List;

import sousuo.entity.Tcategory;

 
public interface ICategryDao {

	void saveCate(Tcategory cate); 
	public List<Tcategory> queryAllCateGry();
}
