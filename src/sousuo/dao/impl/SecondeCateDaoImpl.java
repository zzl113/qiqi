package sousuo.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import sousuo.dao.ISecondCate;
import sousuo.dao.JdbcUtil;
import sousuo.entity.Tcategorysecond;

 
 

public class SecondeCateDaoImpl implements ISecondCate {
    private int x;
	@Override
	public void saveSeconde(Tcategorysecond cate) {
		 Connection conn = JdbcUtil.openConnection();
		 PreparedStatement pst = null;
		 try {
			pst = conn.prepareStatement("INSERT INTO tcategorysecond "
					+ "(catesname, pid, creatuser,"
					+ " creattime, modifyuser, modifytime) "
					+ " VALUES (?, ?, ?, ?, ?, ?) ");
			 pst.setString(1, cate.getCatesname());
			 pst.setInt(2, cate.getPid());
			 pst.setInt(3, cate.getCreatuser());
			 pst.setDate(4, cate.getCreattime());
			 pst.setInt(5, cate.getModifyuser());
			 pst.setDate(6, cate.getModifytime());
			 pst.executeUpdate();
		} catch (Exception e) {
			 e.printStackTrace();
		}finally {
			JdbcUtil.closeAll(conn, pst, null);
		}
	}

	 

	@Override
	public int queryAllCateNums() {
		 Connection conn = JdbcUtil.openConnection();
		 PreparedStatement pst = null;
		 ResultSet rs = null;
		 try {
			 String sql = "SELECT count(*) FROM tcategorysecond a";
			 pst = conn.prepareStatement(sql);
			 rs = pst.executeQuery();
			 rs.next();
			 return rs.getInt(1); //取第一列的值
		} catch (Exception e) { 
			e.printStackTrace(); 
		}finally { 
			JdbcUtil.closeAll(conn, pst, rs); 
		} 
		return 0;
	}

	@Override
	public Tcategorysecond queryById(int id) {
		 Connection conn = JdbcUtil.openConnection();
		 PreparedStatement pst = null;
		 ResultSet rs = null; 
		 try {
			 String sql = "SELECT a.* FROM tcategorysecond a  where a.id=?";
			 pst = conn.prepareStatement(sql);
             pst.setLong(1, id);
			 rs = pst.executeQuery();
			 if(rs.next()) {
				 Tcategorysecond sc = new Tcategorysecond();
				 sc.setPid(rs.getInt("pid"));
				 sc.setCatesname(rs.getString("Catesname")); 
				 sc.setCreattime(rs.getDate("Creattime"));
				 sc.setCreatuser(rs.getInt("Creatuser"));
				 sc.setId(rs.getInt("id"));
				 sc.setModifytime(rs.getDate("Modifytime"));
				 sc.setModifyuser(rs.getInt("Modifyuser"));
				 return sc;
			 }  
		} catch (Exception e) { 
			e.printStackTrace(); 
		}finally {
			JdbcUtil.closeAll(conn, pst, rs); 
		} 
		return null;
	}

	@Override
	public void updateSeconde(Tcategorysecond cate) {
		 Connection conn = JdbcUtil.openConnection();
		 PreparedStatement pst = null;
		 ResultSet rs = null;
		 try {
			 String sql = "update tcategorysecond a set a.catesname=?,a.pid=?,a.modifytime=now(),a.modifyuser=? where a.id=?";
			 pst = conn.prepareStatement(sql);
			 pst.setString(1, cate.getCatesname());
			 pst.setInt(2, cate.getPid()); 
			 pst.setInt(4, cate.getId());
			 pst.setInt(3, cate.getModifyuser());
			 pst.executeUpdate();
		} catch (Exception e) { 
			e.printStackTrace(); 
		}finally { 
			JdbcUtil.closeAll(conn, pst, rs); 
		} 
		 
		
	}

	@Override
	public void deleteSeconde(int id,Connection conn) throws SQLException { 
		 PreparedStatement pst = null; 
		 try { 
			 pst = conn.prepareStatement("delete from tcategorysecond where id=?");
			 pst.setLong(1, id);
			 pst.executeUpdate();
		}  finally { 
			JdbcUtil.closeAll(null, pst,null); 
		}  
	}

	@Override
	public List<Tcategorysecond> querySmallCateByBigId(int bid) {
		 Connection conn = JdbcUtil.openConnection();
		 PreparedStatement pst = null;
		 ResultSet rs = null;
		 List<Tcategorysecond> result = new ArrayList<>();
		 try {
			 String sql = "SELECT a.*  FROM tcategorysecond a where pid=? order by a.id";
			 pst = conn.prepareStatement(sql);
             pst.setLong(1, bid);
			 rs = pst.executeQuery();
			 while(rs.next()) {
				 Tcategorysecond sc = new Tcategorysecond();
				 sc.setPid(rs.getInt("pid"));
				 sc.setCatesname(rs.getString("Catesname")); 
				 sc.setCreattime(rs.getDate("Creattime"));
				 sc.setCreatuser(rs.getInt("Creatuser"));
				 sc.setId(rs.getInt("id"));
				 sc.setModifytime(rs.getDate("Modifytime"));
				 sc.setModifyuser(rs.getInt("Modifyuser"));
				 result.add(sc);
			 } 
			 return result;
		} catch (Exception e) { 
			e.printStackTrace(); 
		}finally {
			JdbcUtil.closeAll(conn, pst, rs); 
		} 
		return null;
	}
	/*
	 * SELECT *  FROM  tcategorysecond where cateId in (select cateid from tcategorysecond where id=6)  
select a.*  FROM tcategorysecond a inner join tcategorysecond b on a.cateId=b.cateId where b.id=6
	 * */
	@Override
	public List<Tcategorysecond> querySmallByCat(int smallId) {
		Connection conn = JdbcUtil.openConnection();
		 PreparedStatement pst = null;
		 ResultSet rs = null;
		 List<Tcategorysecond> result = new ArrayList<>();
		 try {
			 String sql = "SELECT *  FROM  tcategorysecond where pid in (select cateid from tcategorysecond where id=?) order by id";
			 pst = conn.prepareStatement(sql);
            pst.setLong(1, smallId);
			 rs = pst.executeQuery();
			 while(rs.next()) {
				 Tcategorysecond sc = new Tcategorysecond();
				 sc.setPid(rs.getInt("pid"));
				 sc.setCatesname(rs.getString("Catesname")); 
				 sc.setCreattime(rs.getDate("Creattime"));
				 sc.setCreatuser(rs.getInt("Creatuser"));
				 sc.setId(rs.getInt("id"));
				 sc.setModifytime(rs.getDate("Modifytime"));
				 sc.setModifyuser(rs.getInt("Modifyuser"));
				 result.add(sc);
			 } 
			 return result;
		} catch (Exception e) { 
			e.printStackTrace(); 
		}finally {
			JdbcUtil.closeAll(conn, pst, rs); 
		} 
		return null;
	}
	
 
}
