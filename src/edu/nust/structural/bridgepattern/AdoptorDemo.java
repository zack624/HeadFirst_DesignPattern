package edu.nust.structural.bridgepattern;
/**
 * 桥接模式（Bridge Pattern）
 * 将抽象部分与实现部分分离，使它们可以独立变化
 * 强调两部分都可以随时解耦
 * @author zack
 * @since 2016年7月27日
 */
public class AdoptorDemo {
	public static void main(String[] args) {
		AbstractionCat cat = new RefinedCat();
		cat.multiMeow();
	}
}
