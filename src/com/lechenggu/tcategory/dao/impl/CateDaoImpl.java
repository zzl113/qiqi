package com.lechenggu.tcategory.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import Util.BaseDaoImpl;
import Util.JdbcUtil;

import com.lechenggu.tcategory.dao.Icategory;
import com.lechenggu.tcategory.entity.Tcategory;
import com.lechenggu.tuser.entitys.Tuser;
@Repository
public class CateDaoImpl extends BaseDaoImpl implements Icategory{

	@Override
	public int QueryCate() {
		 Connection con=getConnection();
		 PreparedStatement ps=null;
		 ResultSet rs=null;
		 try {
			 ps=con.prepareStatement("select count(*) cu from tcategory");
			 rs=ps.executeQuery();
			 rs.next();
			return rs.getInt("cu");
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}finally{
//			JdbcUtil.CloseAll(con, ps, rs);
		}
		
	}

	@Override
	public List<Tcategory> querCate(int pgNo, int pgSe) {
		 
		// 打开连接
				Connection con = getConnection();
				PreparedStatement pss = null;
				ResultSet rs= null;

				List<Tcategory> a = new ArrayList<Tcategory>();
				 try {
					// 创建执行sql语句的statment/PreparedStatement 对象
						pss = con.prepareStatement("select * from(select t.*,rownum rn from(select * from tcategory order by id desc) t where rownum<=?) where rn>?");

						pss.setInt(1, pgNo * pgSe);
						pss.setInt(2, (pgNo - 1) * pgSe);
						// 得到结果集，变成实体类对象
						rs= pss.executeQuery();
						while(rs.next()){
							Tcategory p = new Tcategory();
							p.setCatename(rs.getString("catename"));
							 
							p.setCreatuser(rs.getInt("creatuser"));
							p.setId(rs.getInt("id"));
							p.setModifytime(rs.getDate("modifytime"));
							p.setModifyuser(rs.getInt("modifyuser"));
							a.add(p);
	 
					
				} 
						return a;

					} catch (SQLException e) {

						e.printStackTrace();
						return null;
					} finally {

//						JdbcUtil.CloseAll(con, pss, rs);

					}
				}

	@Override
	public int addCatey(Tcategory cate) {
		// 打开连接
				Connection conn =getConnection();
				PreparedStatement ps = null;
		try {
			int rt = -1;
			String sql = "insert into tcategory(id,catename,createtime,modifytime)"
					+ "values(null,?,sysdate,sysdate)";
			ps=conn.prepareStatement(sql);
			ps.setString(1,cate.getCatename());
			return rt=ps.executeUpdate();
		} catch (Exception e) {
			 e.printStackTrace();
		}finally {
//			JdbcUtil.CloseAll(conn, ps, null);
		}	 
				
				
				
				
				
				
				
		return 0;
	}

	@Override
	public List<Tcategory> queryAllCa() {
		// 打开连接
				Connection conn = getConnection();
				PreparedStatement ps = null;
				ResultSet rs = null;
				List<Tcategory> c = new ArrayList<Tcategory>();

				 
				try {
					ps = conn.prepareStatement("select * from tcategory");
					rs = ps.executeQuery();
					while (rs.next()) {
						Tcategory t = new Tcategory();
						t.setCatename(rs.getString("catename"));
						 
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

//					JdbcUtil.CloseAll(conn, ps, rs);

				}

	}

	@Override
	public Tcategory querById(int id) {
		// 打开连接
				Connection conn = getConnection();
				PreparedStatement ps = null;
				ResultSet rs = null;

				try {
					ps = conn.prepareStatement("SELECT * FROM tcategory where id=?");

					ps.setInt(1, id);
					
					rs = ps.executeQuery();

					while (rs.next()) {

						Tcategory p = new Tcategory();
						p.setCatename(rs.getString("catename"));
						p.setCreatetime(rs.getDate("createtime"));
						p.setCreatuser(rs.getInt("creatuser"));
						p.setId(rs.getInt("id"));

						p.setModifytime(rs.getDate("modifytime"));
						p.setModifyuser(rs.getInt("modifyuser"));

						return p;

					}

				} catch (SQLException e) {

					e.printStackTrace();

				} finally {

//					JdbcUtil.CloseAll(conn, ps, rs);
				}

				return null;
	}

	@Override
	public void updateTcategory(Tcategory cate) {
		// 打开连接
		Connection con = getConnection();
		PreparedStatement pss = null;
		ResultSet rss = null;
		try {
			pss = con
					.prepareStatement("update Tcategory t "
							+ "set t.catename=?,t.modifytime=sysdate,t.modifyuser=? where t.id=?");
			pss.setString(1, cate.getCatename());

			pss.setInt(2, cate.getModifyuser());
			pss.setInt(3, cate.getId());

			pss.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();

		} finally {

//			JdbcUtil.CloseAll(con, pss, rss);

		}

	}

	@Override
	public void deleteDaCate(int id) {
		PreparedStatement pss = null;
		// 打开连接
				Connection con =getConnection();

		try {

			pss = con.prepareStatement("delete from tcategory where id=?");
			pss.setInt(1, id);
			 pss.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			
//			JdbcUtil.CloseAll(null, pss, null);
		}
		
	}

	  
 

}
