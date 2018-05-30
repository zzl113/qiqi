package sousuo.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import sousuo.dao.ICategryDao;
import sousuo.dao.JdbcUtil;
import sousuo.entity.Tcategory;

 
 

public class CategryDaoImpl implements ICategryDao {

	@Override
	public void saveCate(Tcategory cate) {
		 Connection conn = JdbcUtil.openConnection();
		 PreparedStatement pst = null;
		 try {
			pst = conn.prepareStatement("INSERT INTO tcategory (catename, creatuser,"
					+ " createtime, modifyuser, modifytime) "
					+ " VALUES (?, ?,?, ?, ?)");
			pst.setString(1, cate.getCatename());
			pst.setLong(2, cate.getCreatuser());
			pst.setDate(3, cate.getCreatetime());
			pst.setLong(4, cate.getModifyuser());
			pst.setDate(5, cate.getModifytime());
			pst.executeUpdate();
		} catch (Exception e) {
			 e.printStackTrace();
		}finally {
			JdbcUtil.closeAll(conn, pst, null); 
		} 
	}

	@Override
	public List<Tcategory> queryAllCateGry() {
		Connection conn = JdbcUtil.openConnection();
		List<Tcategory> cates = new ArrayList<>();
		 PreparedStatement pst = null;
		 ResultSet rs = null;
		 try {
			pst = conn.prepareStatement("SELECT id, catename, creatuser,"
					+ " createtime, modifyuser,"
					+ " modifytime FROM tcategory"); 
			rs = pst.executeQuery(); 
			while(rs.next()) {
				Tcategory cate = new Tcategory();
				cate.setCatename(rs.getString("catename"));
				cate.setCreatetime(rs.getDate("Createtime"));
				cate.setCreatuser(rs.getInt("creatuser"));
				cate.setId(rs.getInt("id"));
				cate.setModifytime(rs.getDate("Modifytime"));
				cate.setModifyuser(rs.getInt("Modifyuser"));
				cates.add(cate); 
			}
			return cates;
			 
		} catch (Exception e) {
			 e.printStackTrace();
			 return null;
		}finally {
			JdbcUtil.closeAll(conn, pst, rs); 
		} 
	}

}
