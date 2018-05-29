package com.lechenggu.tcategorysecond.action;

import java.util.List;
import java.util.Map;

import com.lechenggu.tcategory.biz.IcategoryBiz;
import com.lechenggu.tcategory.biz.impl.CateBizImpl;
import com.lechenggu.tcategory.entity.Tcategory;
import com.lechenggu.tcategorysecond.biz.IcateSecondBiz;
import com.lechenggu.tcategorysecond.biz.impl.IcateSecondBizImpl;
import com.lechenggu.tcategorysecond.entity.Tcategorysecond;
import com.lechenggu.tuser.entitys.Tuser;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class AddCateSecond extends ActionSupport {
	private Tcategorysecond scate;

public Tcategorysecond getScate() {
		return scate;
	}
	public void setScate(Tcategorysecond scate) {
		this.scate = scate;
	}
private List<Tcategory> cat;

public List<Tcategory> getCat() {
	return cat;
}
public void setCat(List<Tcategory> cat) {
	this.cat = cat;
}
private IcategoryBiz ct;
public void setCt(IcategoryBiz ct) {
	this.ct = ct;
}
@Override
	public String execute() throws Exception {
		 cat=ct.queryAllCa();
		return "keyi";
	}

private IcateSecondBiz catd;

public void setCatd(IcateSecondBiz catd) {
	this.catd = catd;
}
public String addSmallCate(){
	Map<String, Object> session = ActionContext.getContext().getSession();
	Tuser user1 = (Tuser) session.get("user");
	scate.setCreatuser(user1.getId());
	scate.setModifyuser(user1.getId());
	int at=catd.addSmalCate(scate);
	System.out.println(scate.getCatename()+"=========");
	if(at>0){
		return "success";
	}else {
		return "file";
	}
	
	 
}
}
