package com.lechenggu.tannouncement.biz.impl;

import java.util.List;

import com.lechenggu.tannouncement.biz.ItannouncementBiz;
import com.lechenggu.tannouncement.dao.ItannouncementDao;
import com.lechenggu.tannouncement.entity.Tannouncement;

public class ItannouncementBizImpl implements ItannouncementBiz {
private ItannouncementDao tanndao;
	public void setTanndao(ItannouncementDao tanndao) {
	this.tanndao = tanndao;
}
	@Override
	public List<Tannouncement> QuerAnnouncement() {
		 
		return tanndao.QuerAnnouncement();
	}

}
