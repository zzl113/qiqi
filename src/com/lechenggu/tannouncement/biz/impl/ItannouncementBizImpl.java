package com.lechenggu.tannouncement.biz.impl;

import java.util.List;

<<<<<<< HEAD
 



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lechenggu.tannouncement.biz.ItannouncementBiz;
 
import com.lechenggu.tannouncement.dao.ItannouncementDao;
import com.lechenggu.tannouncement.entity.Tannouncement;
 @Service
public class ItannouncementBizImpl implements ItannouncementBiz {
	 
	 
	 
 @ Autowired
private ItannouncementDao tanndao;
	 
=======
import com.lechenggu.tannouncement.biz.ItannouncementBiz;
import com.lechenggu.tannouncement.dao.ItannouncementDao;
import com.lechenggu.tannouncement.entity.Tannouncement;

public class ItannouncementBizImpl implements ItannouncementBiz {
private ItannouncementDao tanndao;
	public void setTanndao(ItannouncementDao tanndao) {
	this.tanndao = tanndao;
}
>>>>>>> f287f93b8f1d0f9e14a942804a73323837f6ccac
	@Override
	public List<Tannouncement> QuerAnnouncement() {
		 
		return tanndao.QuerAnnouncement();
	}

}
