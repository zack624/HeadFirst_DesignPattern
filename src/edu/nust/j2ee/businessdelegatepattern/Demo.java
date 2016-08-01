package edu.nust.j2ee.businessdelegatepattern;

/**
 * 业务代表模式（Business Delegate Pattern）
 * 用于表示层和业务层的解耦，减少通信或表示层对业务层的远程查询
 * @author zack
 * @since  2016年8月2日
 */
public class Demo {
	public static void main(String[] args) {
		OneClient client = new OneClient();
		
		BusinessDelegate bd = new BusinessDelegate();
		bd.setServiceName("login");
		
		client.setbDelegate(bd);
		client.doTask();
	}
}
