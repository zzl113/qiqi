package com.lechenggu.tgoods.action;

import com.lechenggu.tgoods.biz.IgoodsBiz;
import com.lechenggu.tgoods.biz.impl.IgoodsBizImpl;
import com.opensymphony.xwork2.ActionSupport;

public class deteleTgoods extends ActionSupport {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	} 
	private IgoodsBiz gb = new IgoodsBizImpl();
	@Override
	public String execute() throws Exception {
		 gb.deleteTgoods(id);
		return super.execute();
	}

}
