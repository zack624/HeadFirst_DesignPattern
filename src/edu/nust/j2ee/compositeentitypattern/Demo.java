package edu.nust.j2ee.compositeentitypattern;

/**
 * 组合实体模式（Composite Entity Pattern）
 * 更新一个组合实体时，内部依赖对象beans会自动更新，即由实体bean管理这些对象，主要用于EJB持久化机制
 * @author zack
 * @since  2016年8月2日
 */
public class Demo {
	public static void main(String[] args) {
		Client client = new Client();
		
		client.setData("zack", "luomu");
		client.printData();
	}
}
