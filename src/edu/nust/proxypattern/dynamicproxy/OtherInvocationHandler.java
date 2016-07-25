package edu.nust.proxypattern.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class OtherInvocationHandler implements InvocationHandler{
	PersonBean person;
	
	public OtherInvocationHandler(PersonBean person) {
		super();
		this.person = person;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		if(method.getName().startsWith("get")){
			return method.invoke(person, args);
		}else if(method.getName().equals("setScore")){
			return method.invoke(person, args);
		}else if(method.getName().startsWith("set")){
			System.out.println("不能调用其他人除setScore以外的set方法.");
//			throw new IllegalAccessException();
		}
		return null;
	}
}
