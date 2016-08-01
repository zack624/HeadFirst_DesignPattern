package edu.nust.creational.factorymethodpattern;
/**
 * 工厂方法模式（FactoryMethod Pattern）
 * 定义了一个创建对象的接口，由子类决定要实例化的类是哪个，让类的实例化推迟到子类
 * @author zack
 * @since 2016年7月14日
 */
public class Demo {
	public static void main(String[] args) {
		PizzaStore cps = new CPizzaStore();
		ProductPizza chinap = cps.orderPizza("chinapizza");
		System.out.println("----------" + chinap.getName());
		System.out.println();
		
		ProductPizza chaop = cps.orderPizza("chaopizza");
		System.out.println("----------" + chaop.getName());
	}
}
