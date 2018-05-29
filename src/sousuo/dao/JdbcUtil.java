package sousuo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.naming.InitialContext;
import javax.sql.DataSource;

public class JdbcUtil {
 
	 
	
	public static Connection openConnection() { 
	 try {//1.加载驱动
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//2.得到获取链接
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521/lcitdb", "c##guimei", "123456");
			//3.返回数据库链接
			return conn; 
		} catch (Exception e) { 
			e.printStackTrace();
		} 
		return null; 
	}
	
	public static void closeAll(Connection conn,Statement st,ResultSet rs) {
		try {
			if(rs != null)
				rs.close();
		} catch (Exception e) { 
		}
		try {
			if(st != null)
				st.close();
		} catch (Exception e) { 
		}
		try {
			if(conn != null)
				conn.close();
		} catch (Exception e) { 
		}
	}
	
}
