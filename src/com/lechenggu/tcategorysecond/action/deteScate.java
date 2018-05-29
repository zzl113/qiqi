package com.lechenggu.tcategorysecond.action;

import com.lechenggu.tcategorysecond.biz.IcateSecondBiz;
import com.lechenggu.tcategorysecond.biz.impl.IcateSecondBizImpl;
import com.opensymphony.xwork2.ActionSupport;

public class deteScate extends ActionSupport {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	private IcateSecondBiz catd;
	public void setCatd(IcateSecondBiz catd) {
		this.catd = catd;
	}

	@Override
	public String execute() throws Exception {
		catd.deleteSenCate(id);
		return super.execute();
	}

}
