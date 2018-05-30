package com.lechenggu.tgoods.action;

<<<<<<< HEAD
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.lechenggu.tgoods.biz.IgoodsBiz;
import com.lechenggu.tgoods.biz.impl.IgoodsBizImpl;
import com.opensymphony.xwork2.ActionSupport;
@Scope("prototype")
@Controller("delAction")
=======
import com.lechenggu.tgoods.biz.IgoodsBiz;
import com.lechenggu.tgoods.biz.impl.IgoodsBizImpl;
import com.opensymphony.xwork2.ActionSupport;

>>>>>>> f287f93b8f1d0f9e14a942804a73323837f6ccac
public class deteleTgoods extends ActionSupport {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	} 
<<<<<<< HEAD
	@Autowired
	private IgoodsBiz gb ;
	public IgoodsBiz getGb() {
		return gb;
	}

	public void setGb(IgoodsBiz gb) {
		this.gb = gb;
	}

=======
	private IgoodsBiz gb = new IgoodsBizImpl();
>>>>>>> f287f93b8f1d0f9e14a942804a73323837f6ccac
	@Override
	public String execute() throws Exception {
		 gb.deleteTgoods(id);
		return super.execute();
	}

}
