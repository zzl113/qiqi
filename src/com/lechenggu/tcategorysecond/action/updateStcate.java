package com.lechenggu.tcategorysecond.action;

 
import java.util.List;

<<<<<<< HEAD
import org.springframework.beans.factory.annotation.Autowired;
 
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

=======
>>>>>>> f287f93b8f1d0f9e14a942804a73323837f6ccac
import com.lechenggu.tcategory.biz.IcategoryBiz;
import com.lechenggu.tcategory.biz.impl.CateBizImpl;
import com.lechenggu.tcategory.entity.Tcategory;
import com.lechenggu.tcategorysecond.biz.IcateSecondBiz;
import com.lechenggu.tcategorysecond.biz.impl.IcateSecondBizImpl;
import com.lechenggu.tcategorysecond.entity.Tcategorysecond;
import com.lechenggu.tuser.entitys.Tuser;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

<<<<<<< HEAD
@Scope("prototype")//不表明默认的是单例
@Controller("Supcate")//bean的id
=======
>>>>>>> f287f93b8f1d0f9e14a942804a73323837f6ccac
public class updateStcate extends ActionSupport {
private int id;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Tcategorysecond getScate() {
	return scate;
}
public void setScate(Tcategorysecond scate) {
	this.scate = scate;
}
private Tcategorysecond scate;
public IcateSecondBiz getCatd() {
	return catd;
}
public void setCatd(IcateSecondBiz catd) {
	this.catd = catd;
}
private List<Tcategory> Cate;
 
public List<Tcategory> getCate() {
	return Cate;
}
public void setCate(List<Tcategory> cate) {
	Cate = cate;
}
<<<<<<< HEAD
@Autowired
=======
>>>>>>> f287f93b8f1d0f9e14a942804a73323837f6ccac
private IcateSecondBiz catd;
 
	@Override
		public String execute() throws Exception {
			 scate=catd.querById(id);
			 Cate=catd.queryAllCa();
			return super.execute();
		}
	
	public String updatesScate(){
		
		Tuser user=(Tuser) ActionContext.getContext().getSession().get("user");
		
		scate.setCreatuser(user.getId());
		scate.setModifyuser(user.getId());
		catd.updateTcategorysecond(scate);
		return "keyi";
	}
	
}
