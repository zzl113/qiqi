package com.lechenggu.tcategorysecond.action;

<<<<<<< HEAD
import org.springframework.beans.factory.annotation.Autowired;
 
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.lechenggu.tcategorysecond.biz.IcateSecondBiz;
import com.lechenggu.tcategorysecond.biz.impl.IcateSecondBizImpl;
import com.opensymphony.xwork2.ActionSupport;
@Scope("prototype")//不表明默认的是单例
@Controller("Sdelecate")//bean的id
=======
import com.lechenggu.tcategorysecond.biz.IcateSecondBiz;
import com.lechenggu.tcategorysecond.biz.impl.IcateSecondBizImpl;
import com.opensymphony.xwork2.ActionSupport;

>>>>>>> f287f93b8f1d0f9e14a942804a73323837f6ccac
public class deteScate extends ActionSupport {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
<<<<<<< HEAD
	@Autowired
=======
>>>>>>> f287f93b8f1d0f9e14a942804a73323837f6ccac
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
