package edu.nust.decoratorpattern.concrete;
/**
 * 装饰者模式(Decorator Pattern)
 * 动态地将责任附加到对象身上,若要扩展功能，装饰者提供比继承更有弹性的替代方案
 * @author zack
 * @since 2016年7月13日
 */
public class Demo {
	public static void main(String[] args) {
		ComponentBeverage darkRoast = new ComponentDarkRoast();
		System.out.println("description:" + darkRoast.getDescription() + ",cost:" + darkRoast.cost());
		
		ComponentBeverage milkDarkRoast = new DecoratorMilk(darkRoast);
		System.out.println("description:" + milkDarkRoast.getDescription() + ",cost:" + milkDarkRoast.cost());
		
		ComponentBeverage mochaMilkDarkRoast = new DecoratorMocha(milkDarkRoast);
		System.out.println("description:" + mochaMilkDarkRoast.getDescription() + ",cost:" + mochaMilkDarkRoast.cost());
		
		ComponentBeverage espresso = new ComponentEspresso();
		System.out.println("description:" + espresso.getDescription() + ",cost:" + espresso.cost());
		
	}
}
