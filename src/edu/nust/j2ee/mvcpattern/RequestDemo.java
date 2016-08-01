package edu.nust.j2ee.mvcpattern;

/**
 * MVC模式
 * 应用程序的分层开发
 * @author zack
 * @since  2016年8月1日
 */
public class RequestDemo {
	public static void main(String[] args) {
		Student student = new Student();
		student.setName("zack");
		student.setAge(18);
		
		View view = new View();
		Controller controller = new Controller(student, view);
		controller.updateData();
	}
}
