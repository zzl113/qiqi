package com.lechenggu.tuser.entitys;

import java.sql.Date;

// default package
// Generated 2017-7-24 17:05:53 by Hibernate Tools 3.2.2.GA

 

/**
 * Tuser generated by hbm2java
 */
public class Tuser implements java.io.Serializable {

	private Integer id;
	private Integer age;
	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	private String loginname;
	private String realname;
	private String password;
	private Integer sex;
	private Date birthday;
	private String cardid;
	private String email;
	private String tel;
	private String address;
	private Integer isuse;
	private Integer creatuser;
	private Date creattime;
	private Integer modifyuser;
	private Date modifytime;

	public Tuser() {
	}

	public Tuser(String loginname, String realname, String password,
			Integer sex, Date birthday, String cardid, String email,
			String tel, String address, Integer isuse, Integer creatuser,
			Date creattime, Integer modifyuser, Date modifytime,Integer age) {
		this.loginname = loginname;
		this.realname = realname;
		this.password = password;
		this.sex = sex;
		this.birthday = birthday;
		this.cardid = cardid;
		this.email = email;
		this.tel = tel;
		this.address = address;
		this.isuse = isuse;
		this.creatuser = creatuser;
		this.creattime = creattime;
		this.modifyuser = modifyuser;
		this.modifytime = modifytime;
		this.age=age;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getSex() {
		return this.sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public Date getBirthday() {
		return this.birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getCardid() {
		return this.cardid;
	}

	public void setCardid(String cardid) {
		this.cardid = cardid;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getIsuse() {
		return this.isuse;
	}

	public void setIsuse(Integer isuse) {
		this.isuse = isuse;
	}

	public Integer getCreatuser() {
		return this.creatuser;
	}

	public void setCreatuser(Integer creatuser) {
		this.creatuser = creatuser;
	}

	public Date getCreattime() {
		return this.creattime;
	}

	public void setCreattime(Date creattime) {
		this.creattime = creattime;
	}

	public Integer getModifyuser() {
		return this.modifyuser;
	}

	public void setModifyuser(Integer modifyuser) {
		this.modifyuser = modifyuser;
	}

	public Date getModifytime() {
		return this.modifytime;
	}

	public void setModifytime(Date modifytime) {
		this.modifytime = modifytime;
	}

}
