package Util;

import java.io.Serializable;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;

public class HibernateUtil {
	@Autowired
	private  SessionFactory sessionFactory;
	 
 

 public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
public void sava(Object o){
	 
	 sessionFactory.getCurrentSession().save(o);
 }
public void update(Object o){
	 
	 sessionFactory.getCurrentSession().update(o);
 }
public void delete(Object o){
	 
	 sessionFactory.getCurrentSession().delete(o);
	
}
public void getEntity(Class clazz, Serializable id){
	 
	 sessionFactory.getCurrentSession().get(clazz,id);
}
	 
}
