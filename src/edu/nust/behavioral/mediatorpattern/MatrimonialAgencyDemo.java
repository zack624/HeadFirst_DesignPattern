package edu.nust.behavioral.mediatorpattern;
/**
 * 中介者模式（Mediator Pattern）
 * 集中相关对象之间复杂的沟通和控制方式
 * @author zack
 * @since 2016年7月28日
 */
public class MatrimonialAgencyDemo {
	public static void main(String[] args) {
		Mediator m1 = new Mediator();
		Mediator m2 = new Mediator();
		
		Man zack = new Man(m1,"zack");
		Woman lily = new Woman(m1, "lily");

		Woman jane = new Woman(m2,"jane");
		Woman jessica = new Woman(m2,"jessica");
		
		zack.getPartner(lily);
		jessica.getPartner(jane);
	}
}
