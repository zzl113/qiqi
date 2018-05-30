package com.lechenggu.tcategory.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.lechenggu.tcategory.biz.IcategoryBiz;
import com.lechenggu.tcategory.biz.impl.CateBizImpl;
import com.lechenggu.tcategory.entity.Tcategory;
import com.lechenggu.tuser.entitys.Tuser;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
@Scope("prototype")//不表明默认的是单例
@Controller("TupCate")//bean的id
public class UpdateCate extends ActionSupport {
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Tcategory getCate() {
		return cate;
	}
	public void setCate(Tcategory cate) {
		this.cate = cate;
	}
	private Tcategory cate;
	
	@Autowired
	private IcategoryBiz cat;
	 
	@Override
	public String execute() throws Exception {
		 cate=cat.querById(id);
		return super.execute();
	}
	public String updateTcate(){
		Tuser user=(Tuser) ActionContext.getContext().getSession().get("user");
		cate.setCreatuser(user.getId());
		cate.setModifyuser(user.getId());
		cat.updateTcategory(cate);
		return "ky";
		
		
	}
	

}
