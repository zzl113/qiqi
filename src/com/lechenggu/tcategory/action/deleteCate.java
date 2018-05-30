package com.lechenggu.tcategory.action;

<<<<<<< HEAD
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.lechenggu.tcategory.biz.IcategoryBiz;
import com.lechenggu.tcategory.biz.impl.CateBizImpl;
import com.opensymphony.xwork2.ActionSupport;
@Scope("prototype")//不表明默认的是单例
@Controller("TdeleCate")//bean的id
=======
import com.lechenggu.tcategory.biz.IcategoryBiz;
import com.lechenggu.tcategory.biz.impl.CateBizImpl;
import com.opensymphony.xwork2.ActionSupport;

>>>>>>> f287f93b8f1d0f9e14a942804a73323837f6ccac
public class deleteCate extends ActionSupport {
private int id;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}
<<<<<<< HEAD


@Autowired
private IcategoryBiz cat;
 
=======
private IcategoryBiz cat;
public void setCat(IcategoryBiz cat) {
	this.cat = cat;
}
>>>>>>> f287f93b8f1d0f9e14a942804a73323837f6ccac

@Override
	public String execute() throws Exception {
		 cat.deleteDaCate(id);
		return super.execute();
	}
}
