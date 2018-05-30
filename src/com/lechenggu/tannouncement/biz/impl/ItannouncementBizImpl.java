package com.lechenggu.tannouncement.biz.impl;

import java.util.List;

 



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lechenggu.tannouncement.biz.ItannouncementBiz;
 
import com.lechenggu.tannouncement.dao.ItannouncementDao;
import com.lechenggu.tannouncement.entity.Tannouncement;
 @Service
public class ItannouncementBizImpl implements ItannouncementBiz {
	 
	 
	 
 @ Autowired
private ItannouncementDao tanndao;
	 
	@Override
	public List<Tannouncement> QuerAnnouncement() {
		 
		return tanndao.QuerAnnouncement();
	}

}
