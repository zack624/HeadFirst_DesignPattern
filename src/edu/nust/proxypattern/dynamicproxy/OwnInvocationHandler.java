package edu.nust.proxypattern.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

//所有调用处理器都实现InvocationHandler接口
public class OwnInvocationHandler implements InvocationHandler{
	PersonBean person;

	public OwnInvocationHandler(PersonBean person) {
		super();
		this.person = person;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		if(method.getName().startsWith("get")){
			return method.invoke(person, args);
		}else if(method.getName().equals("setScore")){
			System.out.println("自己无法调用setScore方法.");
//			throw new IllegalAccessException();
		}else if(method.getName().startsWith("set")){
			return method.invoke(person, args);
		}
		return null;
	}
}
