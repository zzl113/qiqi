package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

 
 


import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

 
public class JdbcUtil {
public static Connection openConnection(){
//	try {
//		//加载驱动
//		Class.forName("oracle.jdbc.driver.OracleDriver");
//		//得到获取连接
//		 
//			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521/zzldb","qiqi","619");
//			return conn;
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	  catch (ClassNotFoundException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	
//	return null;
	try {
//		实例化context对象
		Context ctx=new InitialContext();
//		获得数据源对象
		DataSource ds=(DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
//		建立连接
		Connection conn=ds.getConnection();
			
		
		 return conn;
	} catch (Exception e) {
		e.printStackTrace();
	}
	return null;
	
}
public static void closeAll(Connection conn,Statement st,ResultSet rs){
	
	try {
		if(rs!=null){
			rs.close();
		}
		if(conn!=null){
			conn.close();
		}
		if(st!=null){
			st.close();
		}
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	
	
	
}
public static void CloseAll(Connection conn,PreparedStatement ps,ResultSet rs){
	
	try {
		if(rs!=null){
			rs.close();
		}
		if(conn!=null){
			conn.close();
		}
		if(ps!=null){
			ps.close();
		}
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	
	
	
}

}
