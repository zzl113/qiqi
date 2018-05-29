package com.lechenggu.tcategory.action;

import com.lechenggu.tcategory.biz.IcategoryBiz;
import com.lechenggu.tcategory.biz.impl.CateBizImpl;
import com.lechenggu.tcategory.entity.Tcategory;
import com.opensymphony.xwork2.ActionSupport;

public class AddCate extends ActionSupport {
	private Tcategory cate;

	public Tcategory getCate() {
		return cate;
	}

	public void setCate(Tcategory cate) {
		this.cate = cate;
	}
	
	private IcategoryBiz cat;
public void setCat(IcategoryBiz cat) {
		this.cat = cat;
	}

public String addCate(){
	int at=cat.addCate(cate);
	if(at>0){
		return "success";
	}else {
		return "file";
	}
	
	 
}
}
