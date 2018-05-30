package com.lechenggu.qiantai.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.lechenggu.qiantai.dao.ICustomerDao;

import Util.HibernateUtil;
import pojo.Tcustomer;
@Repository
public class ICustomerDaoImpl extends HibernateUtil implements ICustomerDao {

	@Override
	public Tcustomer doLogin(Tcustomer tcus) {
		Session se=getSessionFactory().getCurrentSession();
		 String hql="from Tcustomer where loginname=? and password=?";
		 Query query=se.createQuery(hql);
		 query.setString(0, tcus.getLoginname());
		 query.setString(1, tcus.getPassword());
		 List<Tcustomer> tcustomers=query.list();
		 if (tcustomers.size()>0) {
			 return tcustomers.get(0);
			
		}
				 
		return null;
	}

}
