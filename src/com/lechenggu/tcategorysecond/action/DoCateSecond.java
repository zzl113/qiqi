package com.lechenggu.tcategorysecond.action;

import java.util.List;

 

<<<<<<< HEAD




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

=======
>>>>>>> f287f93b8f1d0f9e14a942804a73323837f6ccac
import com.lechenggu.tcategory.entity.Tcategory;
import com.lechenggu.tcategorysecond.biz.IcateSecondBiz;
import com.lechenggu.tcategorysecond.biz.impl.IcateSecondBizImpl;
import com.lechenggu.tcategorysecond.entity.Tcategorysecond;
import com.opensymphony.xwork2.ActionSupport;
<<<<<<< HEAD
@Controller("doCateSecond")//bean的id
@Scope("prototype")//不表明默认的是单例
=======

>>>>>>> f287f93b8f1d0f9e14a942804a73323837f6ccac
public class DoCateSecond extends ActionSupport {
	private List<Tcategorysecond> Cate;
	public List<Tcategorysecond> getCate() {
		return Cate;
	}
	public void setCate(List<Tcategorysecond> cate) {
		Cate = cate;
	}
	private int yehao;
	
	 
	public int getYehao() {
		return yehao;
	}
	public void setYehao(int yehao) {
		this.yehao = yehao;
	}
	public int getCountyehao() {
		return countyehao;
	}
	public void setCountyehao(int countyehao) {
		this.countyehao = countyehao;
	}
	private int countyehao;
	 
	 
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	private int page;
<<<<<<< HEAD
	@Autowired
	private IcateSecondBiz cat;
	/*public void setCat(IcateSecondBiz cat) {
		this.cat = cat;
	}*/
=======
	private IcateSecondBiz cat;
	public void setCat(IcateSecondBiz cat) {
		this.cat = cat;
	}
>>>>>>> f287f93b8f1d0f9e14a942804a73323837f6ccac
	public String loginCateSecond(){
	 
			if(page>=1){
				 yehao=page;
			}
			int hashu=3;
			if(yehao<1){
				yehao=1;
			}
			
			
			int countrows=cat.QueryCateSecond();
//			总页数
			  countyehao=countrows/hashu;
//			总行数不能整除行数，页号+12
			if(countrows/hashu!=0){
				countyehao++;
			}
//			页号边界判断
			if(yehao>countyehao){
				yehao=countyehao;
			}
			
			Cate=cat.querCateSecond(yehao,hashu);
			if (Cate!= null) {
		 
				return "chengg";
			} else {
				return "shib";
			}
		
		
		
	}
}
