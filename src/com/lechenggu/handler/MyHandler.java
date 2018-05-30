package com.lechenggu.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
 

 


 
import java.sql.Date;

import org.aspectj.weaver.NewMethodTypeMunger;

public class MyHandler implements InvocationHandler {
private Object realObject;//将来持有真实角色，代理对象对相应方法的调用，会调用MyHandler的invoke方法，实现对真实角色对象的调用
//构造方法，作用是传入真实角色对象realObject
	public MyHandler(Object realObject) {
	super();
	this.realObject = realObject;
}

	@Override
	public Object invoke(
			Object proxy,//代理对象
			Method method, //调用的方法
			Object[] args//调用的方法传入的参数
			)
			throws Throwable {
	 Object ret=null;//声明一个对象
//	 ret相当于realObject.method
	 System.out.println(new Date(System.currentTimeMillis())+"执行开始执行"+method.getName());
	 ret=method.invoke(realObject, args);//等价于realObject.method对象realObject调用方法method，args是方法method里的参数
	 System.out.println(new Date(System.currentTimeMillis())+"结束执行"+method.getName());
	 
	 //	 返回结果ret
	 
		return ret;
	}
	
//	传入真实对象Object realObject生成即返回真实对象的代理对象；
	public static Object getProxyObject(Object realObject){
		
		return Proxy.newProxyInstance(realObject.getClass().getClassLoader(),realObject.getClass().getInterfaces(),new MyHandler(realObject));
		
		
		
		
	}
	
	

}
