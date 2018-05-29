package com.lechenggu.tuser.dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Util.JdbcUtil;

import com.lechenggu.tuser.dao.IUserDao;
import com.lechenggu.tuser.entitys.Tuser;

public class UserDaoImpl implements IUserDao {

	@Override
	public Tuser doLogin(String name, String pwd) {
		// 打开连接
		Connection conn = JdbcUtil.openConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		Statement st = null;
		try {
			// 创建执行sql语句的statment/PreparedStatement 对象
			ps = conn
					.prepareStatement("select * from tuser where loginname=? and password=?");
			// 绑定参数
			ps.setString(1, name);
			ps.setString(2, pwd);
			// 得到结果集，变成实体类对象
			rs = ps.executeQuery();
			if (rs.next()) {
				Tuser user = new Tuser();
				user.setAddress(rs.getString("address"));
				user.setBirthday(rs.getDate("birthday"));
				user.setId(rs.getInt("id"));
				user.setLoginname(rs.getString("loginname"));
				user.setPassword(rs.getString("password"));
				user.setSex(rs.getInt("sex"));
				user.setIsuse(rs.getInt("isuse"));
				user.setCardid(rs.getString("cardid"));
				user.setTel(rs.getString("tel"));
				user.setRealname(rs.getString("realname"));
				user.setModifytime(rs.getDate("modifytime"));
				user.setCreatuser(rs.getInt("creatuser"));
				user.setCreattime(rs.getDate("creattime"));
				user.setEmail(rs.getString("email"));
				user.setModifyuser(rs.getInt("modifyuser"));
				return user;
			} else {
				return null;
			}
		} catch (Exception e) {
			return null;
		} finally {

			JdbcUtil.closeAll(conn, st, rs);

		}
	}

	@Override
	public int addUser(Tuser user) {
		// 打开连接
		Connection conn = JdbcUtil.openConnection();
		PreparedStatement ps = null;
		int rus = -1;
		String sql = "insert into tuser(loginname,realname,password,email,sex,birthday,cardid,tel,address,id,creattime,modifytime)"
				+ "values(?,?,?,?,?,?,?,?,?,null,sysdate,sysdate)";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, user.getLoginname());
			ps.setString(2, user.getRealname());
			ps.setString(3, user.getPassword());
			ps.setString(4, user.getEmail());
			ps.setInt(5, user.getSex());
			ps.setDate(6, (Date) user.getBirthday());
			ps.setString(7, user.getCardid());
			ps.setString(8, user.getTel());
			ps.setString(9, user.getAddress());

			rus = ps.executeUpdate();
			// ps.close();
			// conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.CloseAll(conn, ps, null);
		}

		return rus;
	}

	@Override
	public int queryToRows() {
		// 打开连接
		Connection con = JdbcUtil.openConnection();
		PreparedStatement pss = null;
		ResultSet rss = null;

		try {
			pss = con.prepareStatement("select count(*) cu from tuser");
			rss = pss.executeQuery();
			rss.next();
			return rss.getInt("cu");
		} catch (SQLException e) {

			e.printStackTrace();
			return 0;
		} finally {

			JdbcUtil.CloseAll(con, pss, rss);

		}

	}

	@Override
	public List<Tuser> querUser(int pgNo, int pgSe) {

		// 打开连接
		Connection con = JdbcUtil.openConnection();
		PreparedStatement pss = null;
		ResultSet rss = null;

		List<Tuser> users = new ArrayList<Tuser>();
		try {
			// 创建执行sql语句的statment/PreparedStatement 对象
			pss = con.prepareStatement("select * from(select t.*,rownum rn from(select * from tuser order by id desc) t where rownum<=?) where rn>?");

			pss.setInt(1, pgNo * pgSe);
			pss.setInt(2, (pgNo - 1) * pgSe);
			// 得到结果集，变成实体类对象
			rss = pss.executeQuery();
			while (rss.next()) {
				Tuser user = new Tuser();
				user.setAddress(rss.getString("address"));
				user.setBirthday(rss.getDate("birthday"));
				user.setId(rss.getInt("id"));
				user.setLoginname(rss.getString("loginname"));
				user.setPassword(rss.getString("password"));
				user.setSex(rss.getInt("sex"));
				user.setIsuse(rss.getInt("isuse"));
				user.setCardid(rss.getString("cardid"));
				user.setTel(rss.getString("tel"));
				user.setRealname(rss.getString("realname"));
				user.setModifytime(rss.getDate("modifytime"));
				user.setCreatuser(rss.getInt("creatuser"));
				user.setCreattime(rss.getDate("creattime"));
				user.setEmail(rss.getString("email"));
				user.setModifyuser(rss.getInt("modifyuser"));
				users.add(user);

			}
			return users;
		} catch (Exception e) {

			return null;
		} finally {

			JdbcUtil.CloseAll(con, pss, rss);

		}
	}

	@Override
	public Tuser updateUsers(int id) {
	
		Connection conn = JdbcUtil.openConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			  
			ps = conn.prepareStatement("SELECT  * FROM tuser where id=? ");

			ps.setInt(1,id);
			rs = ps.executeQuery();

			while (rs.next()) {

				Tuser p = new Tuser();
				p.setAddress(rs.getString("address"));
				p.setBirthday(rs.getDate("birthday"));
				p.setCardid(rs.getString("cardid"));
				p.setId(rs.getInt("id"));
				p.setEmail(rs.getString("email"));
				p.setLoginname(rs.getString("loginname"));
				p.setRealname(rs.getString("realname"));
				p.setPassword(rs.getString("password"));
				p.setTel(rs.getString("tel"));
				p.setSex(rs.getInt("sex"));
				return p;

			}

		} catch (SQLException e) {

			e.printStackTrace();

		} finally {

			JdbcUtil.CloseAll(conn, ps, rs);
		}
		return null;

	}

	@Override
	public int updateUes(Tuser user) {
		int t = -1;
		Connection con = JdbcUtil.openConnection();
		PreparedStatement ps = null;
		String sql = "update tuser set loginname=?,realname=?,password=?,email=?,sex=?,birthday=?,cardid=?,tel=?,address=?,creattime=sysdate where id=?";

		try {

			ps = con.prepareStatement(sql);

			ps.setString(1, user.getLoginname());
			ps.setString(2, user.getRealname());
			ps.setString(3, user.getPassword());
			ps.setString(4, user.getEmail());
			ps.setInt(5, user.getSex());
			ps.setDate(6, (Date) user.getBirthday());
			ps.setString(7, user.getCardid());
			ps.setString(8, user.getTel());
			ps.setString(9, user.getAddress());
			
			ps.setInt(10, user.getId());

			t = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return t;
	}

	@Override
	public int deleterUse(int id) {
		Connection con = JdbcUtil.openConnection();
		PreparedStatement ps = null;
		int t = 0;
		try {
			ps = con.prepareStatement("delete from tuser where id=?");
			ps.setInt(1,id);
			t = ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			JdbcUtil.closeAll(con, null, null);
		}

		return t;
	}
}
