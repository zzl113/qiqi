package pojo;

// Generated 2017-9-20 13:42:34 by Hibernate Tools 3.2.2.GA

import  java.lang.Long;
import java.util.Date;

/**
 * Tcart generated by hbm2java
 */
public class Tcart implements java.io.Serializable {

	private java.lang.Long id;
	private Tcustomer tcustomer;
	private java.lang.Long goodsid;
	private java.lang.Long counts;
	private Date createtime;
	private Date modifytime;

	public Tcart() {
	}

	public Tcart(java.lang.Long id) {
		this.id = id;
	}

	public Tcart(java.lang.Long id, Tcustomer tcustomer, java.lang.Long goodsid,
			java.lang.Long counts, Date createtime, Date modifytime) {
		this.id = id;
		this.tcustomer = tcustomer;
		this.goodsid = goodsid;
		this.counts = counts;
		this.createtime = createtime;
		this.modifytime = modifytime;
	}

	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public Tcustomer getTcustomer() {
		return this.tcustomer;
	}

	public void setTcustomer(Tcustomer tcustomer) {
		this.tcustomer = tcustomer;
	}

	public java.lang.Long getGoodsid() {
		return this.goodsid;
	}

	public void setGoodsid(java.lang.Long goodsid) {
		this.goodsid = goodsid;
	}

	public java.lang.Long getCounts() {
		return this.counts;
	}

	public void setCounts(java.lang.Long counts) {
		this.counts = counts;
	}

	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public Date getModifytime() {
		return this.modifytime;
	}

	public void setModifytime(Date modifytime) {
		this.modifytime = modifytime;
	}

}
