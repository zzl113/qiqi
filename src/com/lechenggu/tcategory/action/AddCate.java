package com.lechenggu.tcategory.action;

<<<<<<< HEAD
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

=======
>>>>>>> f287f93b8f1d0f9e14a942804a73323837f6ccac
import com.lechenggu.tcategory.biz.IcategoryBiz;
import com.lechenggu.tcategory.biz.impl.CateBizImpl;
import com.lechenggu.tcategory.entity.Tcategory;
import com.opensymphony.xwork2.ActionSupport;
<<<<<<< HEAD
@Scope("prototype")//不表明默认的是单例
@Controller("TAddCate")//bean的id
=======

>>>>>>> f287f93b8f1d0f9e14a942804a73323837f6ccac
public class AddCate extends ActionSupport {
	private Tcategory cate;

	public Tcategory getCate() {
		return cate;
	}

	public void setCate(Tcategory cate) {
		this.cate = cate;
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

public String addCate(){
	int at=cat.addCate(cate);
	if(at>0){
		return "success";
	}else {
		return "file";
	}
	
	 
}
}
