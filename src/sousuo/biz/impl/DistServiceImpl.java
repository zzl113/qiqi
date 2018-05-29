package sousuo.biz.impl;

import java.util.List;

import sousuo.biz.IDistService;
import sousuo.dao.IAreaDao;
import sousuo.dao.impl.AreaDaoImpl;
import sousuo.entity.Area;

 
public class DistServiceImpl implements IDistService {
    private IAreaDao adao = new AreaDaoImpl(); 
	@Override
	public List<Area> queryDistrict() {
		 Area are = new Area(); 
		 are.setPid(0);
		return adao.queryAreasByEntity(are);
	}
	@Override
	public List<Area> queryStreet(int pid) {
		 Area are = new Area(); 
		 are.setPid(pid);
		return adao.queryAreasByEntity(are);
	}

}
