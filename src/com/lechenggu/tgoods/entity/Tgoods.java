package com.lechenggu.tgoods.entity;

// default package
// Generated 2017-7-24 17:05:53 by Hibernate Tools 3.2.2.GA

import java.math.BigDecimal;
import java.util.Date;

/**
 * Tgoods generated by hbm2java
 */
public class Tgoods implements java.io.Serializable {
private Integer Bigid;
	public Integer getBigid() {
	return Bigid;
}

public void setBigid(Integer bigid) {
	Bigid = bigid;
}

	private Integer id;
	private String goodsname;
	private Integer price;
	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	private Integer catesecid;
	public Integer getCatesecid() {
		return catesecid;
	}

	public void setCatesecid(Integer catesecid) {
		this.catesecid = catesecid;
	}

	private Integer sucount;
	private String spic;
 private Integer sumsalecount;
	public Integer getSumsalecount() {
	return sumsalecount;
}

public void setSumsalecount(Integer sumsalecount) {
	this.sumsalecount = sumsalecount;
}

	private String gdescribe;
	private Integer istop;
	private Integer creatuser;
	private Date creattime;
	private Integer modifyuser;
	private Date modifytime;
	private String catesname;
	private String catename;

	public String getCatename() {
		return catename;
	}

	public void setCatename(String catename) {
		this.catename = catename;
	}

	public String getCatesname() {
		return catesname;
	}

	public void setCatesname(String catesname) {
		this.catesname = catesname;
	}

	public Tgoods() {
	}

	public Tgoods(String goodsname, Integer price, Integer catesecid,Integer Bigid,
			Integer sucount, String spic,String gdescribe,
			Integer istop, Integer creatuser, Date creattime,
			Integer modifyuser, Date modifytime, String catesname,Integer sumsalecount,
			String catename) {
		this.goodsname = goodsname;
		this.price = price;
		this.catesecid = catesecid;
		this.sucount = sucount;
		this.spic = spic;
		this.sumsalecount=sumsalecount;
		this.gdescribe = gdescribe;
		this.istop = istop;
		this.creatuser = creatuser;
		this.creattime = creattime;
		this.modifyuser = modifyuser;
		this.modifytime = modifytime;
		this.catesname = catesname;
		 this.Bigid=Bigid;
		this.catename = catename;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getGoodsname() {
		return this.goodsname;
	}

	public void setGoodsname(String goodsname) {
		this.goodsname = goodsname;
	}

	 

	 

	public Integer getSucount() {
		return this.sucount;
	}

	public void setSucount(Integer sucount) {
		this.sucount = sucount;
	}

	public String getSpic() {
		return this.spic;
	}

	public void setSpic(String spic) {
		this.spic = spic;
	}

	public String getGdescribe() {
		return this.gdescribe;
	}

	public void setGdescribe(String gdescribe) {
		this.gdescribe = gdescribe;
	}

	public Integer getIstop() {
		return this.istop;
	}

	public void setIstop(Integer istop) {
		this.istop = istop;
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
