package com.lechenggu.tuser.action.logintuser;

import java.util.List;

import org.apache.catalina.connector.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.lechenggu.tuser.biz.IUserBiz;
import com.lechenggu.tuser.biz.impl.UserBizImpl;
import com.lechenggu.tuser.entitys.Tuser;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.sun.net.httpserver.Authenticator.Success;
@Scope("prototype")
@Controller("tuserAction")
public class TuserAction extends ActionSupport {
 
	private Tuser user;

	public Tuser getUser() {
		return user;
	}

	public void setUser(Tuser user) {
		this.user = user;
	}
@Autowired
	private IUserBiz userBiz;

	public void setUserBiz(IUserBiz userBiz) {
		this.userBiz = userBiz;
	}

	public String addTuser() {
 
		int t = userBiz.addUser(user);
		if (t == 1) {
			return "chenggong";
		} else {
			return "shibai";
		}

	}

	private String page;
	private List<Tuser> us;
private int  yeha;
public int getYeha() {
	return yeha;
}

public void setYeha(int yeha) {
	this.yeha = yeha;
}

public int getTotlPages() {
	return totlPages;
}

public void setTotlPages(int totlPages) {
	this.totlPages = totlPages;
}

private int totlPages;
	public List<Tuser> getUs() {
		return us;
	}

	public void setUs(List<Tuser> us) {
		this.us = us;
	}

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}

	public String UserManage() {
		  yeha = 1;// 默认页号
		// page如果不为空,//如果参数传了页号 得到page参数不是空的
		if (page != null) {
			// 类型转换
			yeha = Integer.parseInt(page);
		}
		int hanshu = 3;
		if (yeha < 1) {// 页号的边界判断，页号不能小于1也不能大于最大页数
			yeha = 1;
		}
		// 总行数
		int totalRows = userBiz.queryToRows();
		// 总页数
		  totlPages = totalRows / hanshu;
		// 如果总行数不能整除每页行数，页号+1
		if (totalRows % hanshu != 0) {

			totlPages++;

		}
		// 页号边界判断 如果要查询的页号不能大于总页数
		if (yeha > totlPages) {
			yeha = totlPages;

		}
		us = userBiz.querUser(yeha, hanshu);
		if (us != null) {

//			ActionContext.getContext().getSession().put("YH", yeha);
//			ActionContext.getContext().getSession().put("HS", totlPages);
			return "hehe";
		} else {
			return "haha";
		}

	}

}
