package com.lechenggu.tcategory.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.lechenggu.tcategory.biz.IcategoryBiz;
import com.lechenggu.tcategory.biz.impl.CateBizImpl;
import com.lechenggu.tcategory.entity.Tcategory;
import com.opensymphony.xwork2.ActionSupport;
@Scope("prototype")//不表明默认的是单例
@Controller("TAddCate")//bean的id
public class AddCate extends ActionSupport {
	private Tcategory cate;

	public Tcategory getCate() {
		return cate;
	}

	public void setCate(Tcategory cate) {
		this.cate = cate;
	}
	@Autowired
	private IcategoryBiz cat;
 

public String addCate(){
	int at=cat.addCate(cate);
	if(at>0){
		return "success";
	}else {
		return "file";
	}
	
	 
}
}
