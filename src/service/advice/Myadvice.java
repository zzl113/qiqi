package service.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class Myadvice {
	
	public void hehe(JoinPoint ppp){
		System.out.println("执行前============");
		
	}
	 public void haha(JoinPoint ddd){
		System.out.println("执行后++++++++++++++++++++++"); 
		 
	 }
	 
	 
	 
	 public Object heihei(ProceedingJoinPoint ggg){
		 
		 
		 
		 try {
			 System.out.println("环绕前，启动事务");
			Object ret=ggg.proceed();//执行真正的方法
			System.out.println("环绕s后，启动事务");
			return ret;
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				 
		 
		return null;
		 
		 
		 
	 }
	 

}
