package edu.nust.structural.proxypattern.dynamicproxy;

import java.lang.reflect.Proxy;
/**
 * 代理模式（Proxy Pattern）
 * 为另一个对象提供一个替身或占位符以访问这个对象
 * @author zack
 * @since 2016年7月25日
 */
public class PersonDemo {
	public static void main(String[] args) {
		PersonBean person = new PersonBeanImpl("zack","男",100);
		PersonBean ownProxy = getOwnProxy(person);
		System.out.println(ownProxy.getName()+ "," 
					+ ownProxy.getGender() + "," + ownProxy.getScore());
		ownProxy.setName("huang");
		ownProxy.setScore(200);
		
		System.out.println("------------------------");
		PersonBean otherProxy = getOtherProxy(person);
		otherProxy.setScore(200);
		System.out.println(otherProxy.getName()+","+otherProxy.getGender()+","+otherProxy.getScore());
		otherProxy.setName("huang");
	}
	
	public static PersonBean getOwnProxy(PersonBean realSubject){
		PersonBean proxy = (PersonBean) Proxy.newProxyInstance(realSubject.getClass().getClassLoader(),
				realSubject.getClass().getInterfaces(),
				new OwnInvocationHandler(realSubject));
		return proxy;
	}
	
	public static PersonBean getOtherProxy(PersonBean realSubject){
		PersonBean proxy = (PersonBean) Proxy.newProxyInstance(realSubject.getClass().getClassLoader(),
				realSubject.getClass().getInterfaces(),new OtherInvocationHandler(realSubject));
		return proxy;
	}
}
