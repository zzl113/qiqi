package sousuo.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import sousuo.dao.IAreaDao;
import sousuo.dao.JdbcUtil;
import sousuo.entity.Area;

 

public class AreaDaoImpl implements IAreaDao {

	@Override
	public List<Area> queryAreasByEntity(Area area) {
		Connection conn = JdbcUtil.openConnection();
		PreparedStatement pst = null;
		ResultSet rs = null;
		List<Area> areas = new ArrayList<>();
		try {
			String sql = "select * from tarea where 1=1 ";//拼接sql语句，它不安全
			if(area.getId()!=0)
				sql += " and id="+area.getId();
			if(area.getPid()!=0)
				sql += " and pid="+area.getPid();
			if(area.getName()!=null)
				sql += " and name='"+area.getName()+ "'";
			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();
			while(rs.next()) {
				Area are = new Area();
				are.setId(rs.getInt("id"));
				are.setName(rs.getString("name"));
				are.setPid(rs.getInt("pid"));
				areas.add(are);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			JdbcUtil.closeAll(conn, pst, rs); 
		} 
		return areas;
	}

}
