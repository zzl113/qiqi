package com.lechenggu.tcategory.action;

import com.lechenggu.tcategory.biz.IcategoryBiz;
import com.lechenggu.tcategory.biz.impl.CateBizImpl;
import com.lechenggu.tcategory.entity.Tcategory;
import com.lechenggu.tuser.entitys.Tuser;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

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
	private IcategoryBiz cat;
	public void setCat(IcategoryBiz cat) {
		this.cat = cat;
	}
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
