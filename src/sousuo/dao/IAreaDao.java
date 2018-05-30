package sousuo.dao;

import java.util.List;

import sousuo.entity.Area;

 

public interface IAreaDao {
	//以 传入的area对象 的非空属性当作条件
   public List<Area> queryAreasByEntity(Area area);
}
