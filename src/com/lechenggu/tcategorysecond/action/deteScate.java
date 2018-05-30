package com.lechenggu.tcategorysecond.action;

import org.springframework.beans.factory.annotation.Autowired;
 
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.lechenggu.tcategorysecond.biz.IcateSecondBiz;
import com.lechenggu.tcategorysecond.biz.impl.IcateSecondBizImpl;
import com.opensymphony.xwork2.ActionSupport;
@Scope("prototype")//不表明默认的是单例
@Controller("Sdelecate")//bean的id
public class deteScate extends ActionSupport {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	@Autowired
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
