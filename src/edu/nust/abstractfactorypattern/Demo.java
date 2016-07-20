package edu.nust.abstractfactorypattern;

import edu.nust.abstractfactorypattern.pizza.ProductPizza;
import edu.nust.abstractfactorypattern.store.CPizzaStore;
import edu.nust.abstractfactorypattern.store.PizzaStore;


/**
 * 抽象工厂模式（AbstractFactory Pattern）
 * 提供一个接口，用于创建相关或依赖的对象家族，而不需要明确指定具体类
 * @author zack
 * @since 2016年7月14日
 */
public class Demo {
	public static void main(String[] args) {
		PizzaStore cps = new CPizzaStore();
		ProductPizza chinap = cps.orderPizza("chinapizza");
		System.out.println("----------" + chinap.getName() + "," 
				+ chinap.getDough().getDoughName() + "," + 
				chinap.getSauce().getSauceName());
		
		System.out.println();		
		ProductPizza chaop = cps.orderPizza("chaopizza");
		System.out.println("----------" + chaop.getName() + ","
				+ chaop.getDough().getDoughName());
	}
}
