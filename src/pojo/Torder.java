package pojo;

// Generated 2017-9-20 13:42:34 by Hibernate Tools 3.2.2.GA

import java.math.BigDecimal;
import java.util.Date;

/**
 * Torder generated by hbm2java
 */
public class Torder implements java.io.Serializable {

	private BigDecimal id;
	private Tcustomer tcustomer;
	private Date ordertime;
	private BigDecimal sumcost;
	private String receiver;
	private String tel;
	private String address;
	private BigDecimal state;

	public Torder() {
	}

	public Torder(BigDecimal id) {
		this.id = id;
	}

	public Torder(BigDecimal id, Tcustomer tcustomer, Date ordertime,
			BigDecimal sumcost, String receiver, String tel, String address,
			BigDecimal state) {
		this.id = id;
		this.tcustomer = tcustomer;
		this.ordertime = ordertime;
		this.sumcost = sumcost;
		this.receiver = receiver;
		this.tel = tel;
		this.address = address;
		this.state = state;
	}

	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public Tcustomer getTcustomer() {
		return this.tcustomer;
	}

	public void setTcustomer(Tcustomer tcustomer) {
		this.tcustomer = tcustomer;
	}

	public Date getOrdertime() {
		return this.ordertime;
	}

	public void setOrdertime(Date ordertime) {
		this.ordertime = ordertime;
	}

	public BigDecimal getSumcost() {
		return this.sumcost;
	}

	public void setSumcost(BigDecimal sumcost) {
		this.sumcost = sumcost;
	}

	public String getReceiver() {
		return this.receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
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

	public BigDecimal getState() {
		return this.state;
	}

	public void setState(BigDecimal state) {
		this.state = state;
	}

}
