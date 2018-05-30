package com.lechenggu.tgoods.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.lechenggu.tgoods.biz.IgoodsBiz;
import com.lechenggu.tgoods.biz.impl.IgoodsBizImpl;
import com.lechenggu.tgoods.entity.Tgoods;
import com.opensymphony.xwork2.ActionSupport;
@Scope("prototype")
@Controller("doAction")
public class DoGoods extends ActionSupport {
	private int page;
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	 
 
	private List<Tgoods> gd;
	public List<Tgoods> getGd() {
		return gd;
	}
	public void setGd(List<Tgoods> gd) {
		this.gd = gd;
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
	public IgoodsBiz getGod() {
		return god;
	}
	public void setGod(IgoodsBiz god) {
		this.god = god;
	}

@Autowired
	private IgoodsBiz god;
 public String loginGoods(){
	 
	if(page>=1){
		 yehao=page;
	}
	int hashu=3;
	if(yehao<1){
		yehao=1;
	}
	
	
	int countrows=god.QueryGoods();
//	总页数
	  countyehao=countrows/hashu;
//	总行数不能整除行数，页号+12
	if(countrows/hashu!=0){
		countyehao++;
	}
//	页号边界判断
	if(yehao>countyehao){
		yehao=countyehao;
	}
	
	gd=god.querGoods(yehao,hashu);
	if (gd!= null) {
 
		return "chengg";
	} else {
		return "shib";
	}



}
}
