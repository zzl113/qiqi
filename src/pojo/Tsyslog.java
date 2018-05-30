package pojo;

// Generated 2017-9-20 13:42:34 by Hibernate Tools 3.2.2.GA

import java.lang.Long;
import java.util.Date;

/**
 * Tsyslog generated by hbm2java
 */
public class Tsyslog implements java.io.Serializable {

	private java.lang.Long id;
	private Tuser tuser;
	private String loginname;
	private String realname;
	private String optype;
	private String opdesc;
	private Date optime;

	public Tsyslog() {
	}

	public Tsyslog(java.lang.Long id) {
		this.id = id;
	}

	public Tsyslog(java.lang.Long id, Tuser tuser, String loginname,
			String realname, String optype, String opdesc, Date optime) {
		this.id = id;
		this.tuser = tuser;
		this.loginname = loginname;
		this.realname = realname;
		this.optype = optype;
		this.opdesc = opdesc;
		this.optime = optime;
	}

	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public Tuser getTuser() {
		return this.tuser;
	}

	public void setTuser(Tuser tuser) {
		this.tuser = tuser;
	}

	public String getLoginname() {
		return this.loginname;
	}

	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}

	public String getRealname() {
		return this.realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public String getOptype() {
		return this.optype;
	}

	public void setOptype(String optype) {
		this.optype = optype;
	}

	public String getOpdesc() {
		return this.opdesc;
	}

	public void setOpdesc(String opdesc) {
		this.opdesc = opdesc;
	}

	public Date getOptime() {
		return this.optime;
	}

	public void setOptime(Date optime) {
		this.optime = optime;
	}

}