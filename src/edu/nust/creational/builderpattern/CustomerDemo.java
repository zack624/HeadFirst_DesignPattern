package edu.nust.creational.builderpattern;

/**
 * 生成器模式（Builder Pattern）
 * 封装一个产品的构造过程，并允许按步骤构造
 * @author zack
 * @since 2016年7月27日
 */
public class CustomerDemo {
	public static void main(String[] args) {
		Director aDirector = new Director(new ABuilder());
		aDirector.getProduct().display();
		
		System.out.println("///////////////////");
		Director bDirector = new Director(new BBuilder());
		bDirector.getProduct().display();
	}
}
