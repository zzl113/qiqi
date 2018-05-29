package com.lechenggu.tcategory.action;

import com.lechenggu.tcategory.biz.IcategoryBiz;
import com.lechenggu.tcategory.biz.impl.CateBizImpl;
import com.opensymphony.xwork2.ActionSupport;

public class deleteCate extends ActionSupport {
private int id;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}
private IcategoryBiz cat;
public void setCat(IcategoryBiz cat) {
	this.cat = cat;
}

@Override
	public String execute() throws Exception {
		 cat.deleteDaCate(id);
		return super.execute();
	}
}
