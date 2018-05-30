package sousuo.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import sousuo.dao.JdbcUtil;
import sousuo.dao.User;

public class IUser implements User {

	@Override
	public int deleuser(int id) {
		Connection conn = JdbcUtil.openConnection();
		 PreparedStatement pst = null;
		 
		 int t=0;
				 String sql="delete from tuser where id=?";
		 try {
			pst=conn.prepareStatement(sql);
			 pst.setInt(1,id);
			 t=pst.executeUpdate();
			 return t;
		} catch (SQLException e) {
			  
			
			 e.printStackTrace();
			
		}finally{
			
			
			 
			JdbcUtil.closeAll(conn, pst, null);
			 
			
		}
		return 0;
		 
	}

}
