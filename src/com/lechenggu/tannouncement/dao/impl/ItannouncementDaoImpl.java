package com.lechenggu.tannouncement.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Util.JdbcUtil;

import com.lechenggu.tannouncement.dao.ItannouncementDao;
import com.lechenggu.tannouncement.entity.Tannouncement;
 

 
 

public class ItannouncementDaoImpl implements ItannouncementDao {

	@Override
	public List<Tannouncement> QuerAnnouncement() {
//		打开连接
		Connection conn = JdbcUtil.openConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Tannouncement> b = new ArrayList<Tannouncement>();

		try {
			ps = conn.prepareStatement("select * from tannouncement");
			 
			rs = ps.executeQuery();

			while (rs.next()) {
				Tannouncement p = new Tannouncement();
				p.setAnncontext(rs.getString("anncontext"));
				p.setCreattime(rs.getDate("creattime"));
				p.setCreatuser(rs.getInt("creatuser"));
				p.setAnntitle(rs.getString("anntitle"));

				p.setId(rs.getInt("id"));
				p.setModifytime(rs.getDate("modifytime"));
				p.setModifyuser(rs.getInt("modifyuser"));
				b.add(p);

			}
			return b;

		} catch (SQLException e) {

			e.printStackTrace();
			return null;
		} finally {

			JdbcUtil.CloseAll(conn, ps, rs);

		}
	}

}
