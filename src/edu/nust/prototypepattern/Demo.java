package edu.nust.prototypepattern;

/**
 * 原型模式（Prototype Pattern）
 * 创建给定类的实例的过程昂贵复杂时，使用原型模式
 * @author zack
 * @since 2016年7月29日
 */
public class Demo {
	public static void main(String[] args) {
		PrototypeManager pm = new PrototypeManager(new ConcretePrototype("zack"));
		//通过管理器来获取实例
		Prototype prototype = pm.getPrototype();
		System.out.println(prototype);
		
		Prototype proli = new ConcretePrototype("li");
		System.out.println(proli);
		
		Prototype proclone = (Prototype) proli.clone();
		System.out.println(proclone);
	}
}
