package edu.nust.templatepattern.hook;
/**
 * 模板方法模式（Template Pattern）
 * 在一个方法中定义一个算法的骨架，而将一些步骤延迟到子类中，模板方法使得子类可以在不改变算法结构的情况
 * 下重新定义算法中某些步骤
 * @author zack
 * @since 2016年7月21日
 */
public class Demo {
	public static void main(String[] args) {
		Template teaTemplate = new TeaConcrete();
		teaTemplate.templateMethod();
		
		System.out.println("/////////coffee//////////");
		Template coffeetTemplate = new CoffeeConcrete();
		coffeetTemplate.templateMethod();
	}
}
