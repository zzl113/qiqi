package Util;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class BaseDaoImpl extends JdbcDaoSupport{
	@Autowired
	 private DataSource ds;
	 public DataSource getDs() {
		return ds;
	}
	public void setDs(DataSource ds) {
		this.ds = ds;
	}
	@PostConstruct
	 public void initialize(){
		 setDataSource(ds);
	 }
	

}
