package edu.nust.j2ee.daopattern;

import java.util.List;

/**
 * 数据访问对象模式（Data Access Object Pattern）
 * 用于把低级的数据访问API从高级的业务服务中分离出来
 * @author zack
 * @since  2016年8月2日
 */
public class Demo {
	public static void main(String[] args) {
		StudentDao sDao = new StudentDaoImpl();
		List<Student> students = sDao.getAll();
		printList(students);
		
		System.out.println("-----------------------");
		System.out.println(sDao.getByName("zhao"));
		
		sDao.deleteStudent(1);
		System.out.println("------------------------");
		printList(sDao.getAll());
		
	}
	
	public static void printList(List list){
		for (Object object : list) {
			System.out.println(object);
		}
	}
}
