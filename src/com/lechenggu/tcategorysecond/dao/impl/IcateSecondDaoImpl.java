package com.lechenggu.tcategorysecond.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

<<<<<<< HEAD
import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
 
import org.springframework.stereotype.Repository;

import Util.BaseDaoImpl;
import Util.JdbcUtil;
  
import com.lechenggu.tcategory.entity.Tcategory;
import com.lechenggu.tcategorysecond.dao.IcateSecondDao;
import com.lechenggu.tcategorysecond.entity.Tcategorysecond;
@Repository
public class IcateSecondDaoImpl extends BaseDaoImpl implements IcateSecondDao {
  
	@Override
	public int QueryCateSecond() {
		 
		 Connection con=getConnection();
=======
import Util.JdbcUtil;
 


 

import com.lechenggu.tcategory.entity.Tcategory;
import com.lechenggu.tcategorysecond.dao.IcateSecondDao;
import com.lechenggu.tcategorysecond.entity.Tcategorysecond;

public class IcateSecondDaoImpl implements IcateSecondDao {

	@Override
	public int QueryCateSecond() {
		 
		 Connection con=JdbcUtil.openConnection();
>>>>>>> f287f93b8f1d0f9e14a942804a73323837f6ccac
		 PreparedStatement ps=null;
		 ResultSet rs=null;
		 try {
			 ps=con.prepareStatement("select count(*) cu from tcategorysecond");
			 rs=ps.executeQuery();
			 rs.next();
			return rs.getInt("cu");
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}finally{
<<<<<<< HEAD
//			JdbcUtil.CloseAll(con, ps, rs);
=======
			JdbcUtil.CloseAll(con, ps, rs);
>>>>>>> f287f93b8f1d0f9e14a942804a73323837f6ccac
		}
	}

	@Override
	public List<Tcategorysecond> querCateSecond(int pgNo, int pgSe) {
		// 打开连接
<<<<<<< HEAD
		Connection con = getConnection();
=======
		Connection con = JdbcUtil.openConnection();
>>>>>>> f287f93b8f1d0f9e14a942804a73323837f6ccac
		PreparedStatement pss = null;
		ResultSet rs= null;

		List<Tcategorysecond> a = new ArrayList<Tcategorysecond>();
		 try {
			// 创建执行sql语句的statment/PreparedStatement 对象
				pss = con.prepareStatement("select * from tcategorysecond a inner join tcategory b on a.pid=b.id inner join (select * from(select t.*,rownum rn from(select * from tcategorysecond order by id desc) t where rownum<=?) where rn>?)d on a.id=d.id order by a.id desc");
				 

				pss.setInt(1, pgNo * pgSe);
				pss.setInt(2, (pgNo - 1) * pgSe);
				// 得到结果集，变成实体类对象
				rs= pss.executeQuery();
				while (rs.next()) {

					Tcategorysecond p = new Tcategorysecond();
					p.setCatesname(rs.getString("catesname"));
					p.setCreattime(rs.getDate("creattime"));
					p.setCreatuser(rs.getInt("creatuser"));
					p.setId(rs.getInt("id"));
					p.setPid(rs.getInt("pid"));
					p.setModifytime(rs.getDate("modifytime"));
					p.setModifyuser(rs.getInt("modifyuser"));
					p.setCatename(rs.getString("catename"));

					a.add(p);
				}

				return a;

			
		 

			} catch (SQLException e) {

				e.printStackTrace();
				return null;
			} finally {

<<<<<<< HEAD
//				JdbcUtil.CloseAll(con, pss, rs);
=======
				JdbcUtil.CloseAll(con, pss, rs);
>>>>>>> f287f93b8f1d0f9e14a942804a73323837f6ccac

			}
	}

	@Override
	public int addSmallCate(Tcategorysecond cate) {
		int i = -1;
<<<<<<< HEAD
		Connection conn = getConnection();
=======
		Connection conn = JdbcUtil.openConnection();
>>>>>>> f287f93b8f1d0f9e14a942804a73323837f6ccac
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement("insert into tcategorysecond (id,catesname,pid,creatuser,creattime,modifyuser,modifytime) values (null,?,?,?,sysdate,?,sysdate)");
			ps.setString(1,cate.getCatesname());
			ps.setInt(2, cate.getPid());
			ps.setInt(3, cate.getCreatuser());
			 
			ps.setInt(4, cate.getModifyuser());
			 
			i = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			
		}finally{
<<<<<<< HEAD
//			JdbcUtil.CloseAll(conn, ps, null);	
=======
			JdbcUtil.CloseAll(conn, ps, null);	
>>>>>>> f287f93b8f1d0f9e14a942804a73323837f6ccac
			
		}
		return i;

	}

	@Override
	public Tcategorysecond updateScate(int id) {
<<<<<<< HEAD
		Connection conn = getConnection();
=======
		Connection conn = JdbcUtil.openConnection();
>>>>>>> f287f93b8f1d0f9e14a942804a73323837f6ccac
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			  
			ps = conn.prepareStatement("SELECT * FROM tcategorysecond where pid=?");

			ps.setInt(1,id);
			rs = ps.executeQuery();
			while (rs.next()) {
				Tcategorysecond tc=new Tcategorysecond();
				tc.setCatesname(rs.getString("catesname"));
				tc.setCreattime(rs.getDate("creattime"));
				tc.setCreatuser(rs.getInt("creatuser"));
				tc.setId(rs.getInt("id"));
				tc.setModifytime(rs.getDate("modifytime"));
				tc.setModifyuser(rs.getInt("modifyuser"));
				tc.setPid(rs.getInt("pid"));
				return tc;
			}
	}catch (SQLException e) {

		e.printStackTrace();

	} finally {

<<<<<<< HEAD
//		JdbcUtil.CloseAll(conn, ps, rs);
=======
		JdbcUtil.CloseAll(conn, ps, rs);
>>>>>>> f287f93b8f1d0f9e14a942804a73323837f6ccac
	}
	return null;
	}

	@Override
	public Tcategorysecond querById(int id) {
		// 打开连接
<<<<<<< HEAD
				Connection conn = getConnection();
=======
				Connection conn = JdbcUtil.openConnection();
>>>>>>> f287f93b8f1d0f9e14a942804a73323837f6ccac
				PreparedStatement ps = null;
				ResultSet rs = null;

				try {
					 
					ps = conn
							.prepareStatement("SELECT  * FROM tcategorysecond where id=?");

					ps.setInt(1, id);
					rs = ps.executeQuery();

					while (rs.next()) {

						Tcategorysecond p = new Tcategorysecond();
						p.setCatesname(rs.getString("catesname"));
						p.setCreattime(rs.getDate("creattime"));
						p.setCreatuser(rs.getInt("creatuser"));
						p.setId(rs.getInt("id"));
						p.setPid(rs.getInt("pid"));
						p.setModifytime(rs.getDate("modifytime"));
						p.setModifyuser(rs.getInt("modifyuser"));

						return p;

					}

				} catch (SQLException e) {

					e.printStackTrace();

				} finally {

<<<<<<< HEAD
//					JdbcUtil.CloseAll(conn, ps, rs);
=======
					JdbcUtil.CloseAll(conn, ps, rs);
>>>>>>> f287f93b8f1d0f9e14a942804a73323837f6ccac
				}

				return null;
	}

	@Override
	public List<Tcategory> queryAllCa() {

		// 打开连接
<<<<<<< HEAD
		Connection conn = getConnection();
=======
		Connection conn = JdbcUtil.openConnection();
>>>>>>> f287f93b8f1d0f9e14a942804a73323837f6ccac
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Tcategory> c = new ArrayList<Tcategory>();

<<<<<<< HEAD
		 
=======
		conn = JdbcUtil.openConnection();
>>>>>>> f287f93b8f1d0f9e14a942804a73323837f6ccac
		try {
			ps = conn.prepareStatement("select * from tcategory");
			rs = ps.executeQuery();
			while (rs.next()) {
				Tcategory t = new Tcategory();
				t.setCatename(rs.getString("catename"));
				t.setCreatetime(rs.getDate("createtime"));
				t.setCreatuser(rs.getInt("creatuser"));
				t.setId(rs.getInt("id"));
				t.setModifytime(rs.getDate("modifytime"));
				t.setModifyuser(rs.getInt("modifyuser"));
				c.add(t);

			}
			return c;

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

	@Override
	public void updateTcategorysecond(Tcategorysecond cate) {
		// 打开连接
<<<<<<< HEAD
				Connection con = getConnection();
=======
				Connection con = JdbcUtil.openConnection();
>>>>>>> f287f93b8f1d0f9e14a942804a73323837f6ccac
				PreparedStatement pss = null;
				ResultSet rss = null;
				try {
					pss = con
							.prepareStatement("update Tcategorysecond t set t.catesname=?,t.pid=?,t.modifytime=sysdate,t.modifyuser=? where t.id=?");
					pss.setString(1, cate.getCatesname());
					pss.setInt(2, cate.getPid());
					pss.setInt(3, cate.getModifyuser());
					pss.setInt(4, cate.getId());
					pss.executeUpdate();

				} catch (SQLException e) {

					e.printStackTrace();

				} finally {

<<<<<<< HEAD
//					JdbcUtil.CloseAll(con, pss, rss);
=======
					JdbcUtil.CloseAll(con, pss, rss);
>>>>>>> f287f93b8f1d0f9e14a942804a73323837f6ccac

				}

	}

	 

	@Override
	public void deletSecongCate(int id) {
<<<<<<< HEAD
		Connection con = getConnection();
=======
		Connection con = JdbcUtil.openConnection();
>>>>>>> f287f93b8f1d0f9e14a942804a73323837f6ccac
		PreparedStatement pss = null;

		try {

			 
				pss = con.prepareStatement("delete from Tcategorysecond where id=?");
				pss.setInt(1, id);
				pss.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		finally {

<<<<<<< HEAD
//			JdbcUtil.CloseAll(null, pss, null);
=======
			JdbcUtil.CloseAll(null, pss, null);
>>>>>>> f287f93b8f1d0f9e14a942804a73323837f6ccac

		}
		
	}

}
