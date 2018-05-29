package com.lechenggu.tannouncement.action;

import java.util.List;

import com.lechenggu.tannouncement.biz.ItannouncementBiz;
import com.lechenggu.tannouncement.entity.Tannouncement;
import com.opensymphony.xwork2.ActionSupport;

public class DoTannouncement extends ActionSupport {
	 

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
