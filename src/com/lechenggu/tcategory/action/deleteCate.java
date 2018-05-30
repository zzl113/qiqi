package com.lechenggu.tcategory.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.lechenggu.tcategory.biz.IcategoryBiz;
import com.lechenggu.tcategory.biz.impl.CateBizImpl;
import com.opensymphony.xwork2.ActionSupport;
@Scope("prototype")//不表明默认的是单例
@Controller("TdeleCate")//bean的id
public class deleteCate extends ActionSupport {
private int id;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}


@Autowired
private IcategoryBiz cat;
 

@Override
	public String execute() throws Exception {
		 cat.deleteDaCate(id);
		return super.execute();
	}
}
