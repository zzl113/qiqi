package com.lechenggu.tgoods.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.lechenggu.tgoods.biz.IgoodsBiz;
import com.lechenggu.tgoods.biz.impl.IgoodsBizImpl;
import com.opensymphony.xwork2.ActionSupport;
@Scope("prototype")
@Controller("delAction")
public class deteleTgoods extends ActionSupport {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	} 
	@Autowired
	private IgoodsBiz gb ;
	public IgoodsBiz getGb() {
		return gb;
	}

	public void setGb(IgoodsBiz gb) {
		this.gb = gb;
	}

	@Override
	public String execute() throws Exception {
		 gb.deleteTgoods(id);
		return super.execute();
	}

}
