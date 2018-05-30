import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import pojo.Tcategory;
import pojo.Tcategorysecond;
import pojo.Tuser;
//查询
// public void dele(){//		1。解析主配置文件 cfg.xml
//		Configuration conf=new Configuration().configure();
////		2，解析映射文件hbm
//		SessionFactory sf=conf.buildSessionFactory();
//		
////		3.打开会话
//		
//		Session se=sf.openSession();

//	 Tuser user=(Tuser) se.get(Tuser.class,2l);
//	 
//	 se.close();
//	 
// }

// 修改

//1。解析主配置文件 的到 配置对象 Configuration
//Configuration conf=new Configuration().configure();
////2，通过配置对象 解析映射文件 获得session 工厂 SessionFactory	
//SessionFactory sf=conf.buildSessionFactory();
//
////通过SessionFactory对象打开 会话，获得Session对象（类似数据库连接）
//
//Session se=sf.openSession();
////获得代理对象user
//Tuser user=(Tuser) se.get(Tuser.class,2l);
//user.setRealname("呵呵");
////使用session对象的api完成增删改查 如果是增删改要先启动事务。
//se.beginTransaction();
//se.update(user);
////提交事务
//se.getTransaction().commit();
////关闭回话
//se.close();
//新增
//1。解析主配置文件 的到 配置对象 Configuration
//Configuration conf=new Configuration().configure();
////2，通过配置对象 解析映射文件 获得session 工厂 SessionFactory	
//SessionFactory sf=conf.buildSessionFactory();
//
////通过SessionFactory对象打开 会话，获得Session对象（类似数据库连接）
//
//Session se=sf.openSession();
////获得代理对象user
//Tuser user=new Tuser();
//user.setRealname("齐天大圣");
//user.setAddress("石家庄");
//user.setBirthday(new Date(System.currentTimeMillis()));
//user.setCardid("123432545464523234");
//user.setEmail("qq1@qq.com");
//user.setLoginname("aaa444");
//user.setCreatuser(1l);
//user.setSex(1l);
//user.setCreattime(new Date(System.currentTimeMillis()));
////使用session对象的api完成增删改查 如果是增删改要先启动事务。
//se.beginTransaction();
//se.save(user);
////提交事务
//se.getTransaction().commit();
////关闭回话
//se.close();

//删除
//1。解析主配置文件 的到 配置对象 Configuration
//Configuration conf=new Configuration().configure();
////2，通过配置对象 解析映射文件 获得session 工厂 SessionFactory	
//SessionFactory sf=conf.buildSessionFactory();
//
////通过SessionFactory对象打开 会话，获得Session对象（类似数据库连接）
//
//Session se=sf.openSession();
////获得代理对象user
//Tuser user=new Tuser();
//user.setId(30l); 
//
////使用session对象的api完成增删改查 如果是增删改要先启动事务。
//se.beginTransaction();
//se.delete(user);
////提交事务
//se.getTransaction().commit();
////关闭回话
//se.close();

public class test {

 
	public static void main(String[] args) {
		Configuration conf = new Configuration().configure();
		// // 2，解析映射文件hbm
		SessionFactory sf = conf.buildSessionFactory();

		// // 3.打开会话

		Session se = sf.openSession();
		Tuser user=(Tuser) se.get(Tuser.class, 8l);
		Tcategorysecond tg = new Tcategorysecond();
		tg.setCatesname("补脑");
	
		tg.setTuser(user);
		Tcategorysecond td = new Tcategorysecond();
		
		td.setCatesname("免疫");
		td.setTuser(user);
		Tcategory ct = new Tcategory();
		ct.setCatename("保健品");
		ct.getTcategoryseconds().add(tg);
		ct.getTcategoryseconds().add(td);

		se.beginTransaction();
		se.save(ct);
		se.save(tg);
		se.save(td);
		se.getTransaction().commit();
		se.close();

	}

//	public static void cateGory(Session se) {
//		Tcategory ct = new Tcategory();
//		ct.setCatename("酒");
//		Tcategorysecond tg = new Tcategorysecond();
//		tg.setCatesname("白酒");
//		tg.setTcategory(ct);
//		Tcategorysecond td = new Tcategorysecond();
//		td.setCatesname("红酒");
//		td.setTcategory(ct);
//		se.beginTransaction();
//		se.save(ct);
//		se.save(tg);
//		se.save(td);
//		se.getTransaction().commit();
//		System.out.println(tg.getTcategory());
//		se.close();
//	}

}
