package sousuo.biz;

import java.util.List;

import sousuo.entity.Area;

 

public interface IDistService {

	public List<Area> queryDistrict();
	public List<Area> queryStreet(int pid);
}
