package com.lechenggu.tannouncement.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

<<<<<<< HEAD
import org.springframework.stereotype.Repository;

import Util.BaseDaoImpl;
 
=======
import Util.JdbcUtil;
>>>>>>> f287f93b8f1d0f9e14a942804a73323837f6ccac

import com.lechenggu.tannouncement.dao.ItannouncementDao;
import com.lechenggu.tannouncement.entity.Tannouncement;
 

 
 
<<<<<<< HEAD
@Repository
public class ItannouncementDaoImpl extends BaseDaoImpl implements ItannouncementDao {
=======

public class ItannouncementDaoImpl implements ItannouncementDao {
>>>>>>> f287f93b8f1d0f9e14a942804a73323837f6ccac

	@Override
	public List<Tannouncement> QuerAnnouncement() {
//		打开连接
<<<<<<< HEAD
		Connection conn = getConnection();
=======
		Connection conn = JdbcUtil.openConnection();
>>>>>>> f287f93b8f1d0f9e14a942804a73323837f6ccac
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

<<<<<<< HEAD
//			JdbcUtil.CloseAll(conn, ps, rs);
=======
			JdbcUtil.CloseAll(conn, ps, rs);
>>>>>>> f287f93b8f1d0f9e14a942804a73323837f6ccac

		}
	}

}
