package edu.nust.behavioral.visitorpattern;

/**
 * 访问者模式(Visitor Pattern)
 * 对象组合的封装不重要时，为一个对象组合增加新功能
 * @author zack
 * @since 2016年7月29日
 */
public class ClientDemo {
	public static void main(String[] args) {
		Item item1 = new Item("zack");
		Item item2 = new Item("li");
		
		Menu menu = new Menu();
		menu.addItem(item1);
		menu.addItem(item2);
		
		menu.accept(new Visitor());
	}
}
