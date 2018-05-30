package com.lechenggu.tcategory.action;

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
import com.opensymphony.xwork2.ActionSupport;
<<<<<<< HEAD
@Scope("prototype")//不表明默认的是单例
@Controller("TCate")//bean的id
=======

>>>>>>> f287f93b8f1d0f9e14a942804a73323837f6ccac
public class DoCategory extends ActionSupport {
	public List<Tcategory> getCate() {
		return Cate;
	}

	public void setCate(List<Tcategory> cate) {
		Cate = cate;
	}

	private List<Tcategory> Cate;
	 
	 

	 

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	private int page;
	private int yehao;
	public int getYehao() {
		return yehao;
	}

	public void setYehao(int yehao) {
		this.yehao = yehao;
	}

	public int getCountyeshu() {
		return countyeshu;
	}

	public void setCountyeshu(int countyeshu) {
		this.countyeshu = countyeshu;
	}

	private int countyeshu;
<<<<<<< HEAD
	
	
	@Autowired
	private IcategoryBiz cat;
	
 
=======
	private IcategoryBiz cat;
public void setCat(IcategoryBiz cat) {
		this.cat = cat;
	}
>>>>>>> f287f93b8f1d0f9e14a942804a73323837f6ccac

	//	总行数
	public String loginCate(){
	  yehao=1;
	if(page!=0){
		yehao=page;
	}
	int hashu=3;
	if(yehao<1){
		yehao=1;
	}
	
	
	int countrows=cat.QueryCate();
//	总页数
	  countyeshu=countrows/hashu;
//	总行数不能整除行数，页号+12
	if(countrows/hashu!=0){
		countyeshu ++;
	}
//	页号边界判断
	if(yehao>countyeshu){
		yehao=countyeshu;
	}
	
	Cate=cat.querCate(yehao, hashu);
	if (Cate!= null) {
 
		return "chengg";
	} else {
		return "shib";
	}
}
	}
