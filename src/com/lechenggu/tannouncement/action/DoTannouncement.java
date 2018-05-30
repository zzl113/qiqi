package com.lechenggu.tannouncement.action;

import java.util.List;

<<<<<<< HEAD
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.lechenggu.tannouncement.biz.ItannouncementBiz;
import com.lechenggu.tannouncement.entity.Tannouncement;
import com.opensymphony.xwork2.ActionSupport;
@Scope("prototype")
@Controller("tannAction")
public class DoTannouncement extends ActionSupport {
	 
@Autowired
=======
import com.lechenggu.tannouncement.biz.ItannouncementBiz;
import com.lechenggu.tannouncement.entity.Tannouncement;
import com.opensymphony.xwork2.ActionSupport;

public class DoTannouncement extends ActionSupport {
	 

>>>>>>> f287f93b8f1d0f9e14a942804a73323837f6ccac
	private ItannouncementBiz tanb;
	
	public ItannouncementBiz getTanb() {
		return tanb;
	}

	public void setTanb(ItannouncementBiz tanb) {
		this.tanb = tanb;
	}
	private List<Tannouncement> tann;

	public List<Tannouncement> getTann() {
		return tann;
	}

	public void setTann(List<Tannouncement> tann) {
		this.tann = tann;
	}
@Override
public String execute() throws Exception {
	 tann=tanb.QuerAnnouncement();
	return super.execute();
}
}
