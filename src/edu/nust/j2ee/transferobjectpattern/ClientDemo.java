package edu.nust.j2ee.transferobjectpattern;

import java.util.List;

/**
 * 传输对象模式（Transfer Object Pattern)
 * 业务对象从数据库读取数据，然后填充POJO,并传输给客户端或按值传递
 * @author zack
 * @since  2016年8月2日
 */
public class ClientDemo {
	public static void main(String[] args) {
		StudentBO sbo = new StudentBO();
		List<Student> slist = sbo.getAll();
		System.out.println(slist);
		
		sbo.addStu(new Student("li",33));
		sbo.delStu("zhao");
		
		System.out.println(sbo.getAll());
	}
}
