package edu.nust.strategypattern;

import edu.nust.strategypattern.behavior.LoudlyMeowConcrete;
import edu.nust.strategypattern.behavior.SilentMeowConcrete;

/**
 * 策略模式（Strategy Pattern）
 * 定义了算法族，分别封装起来，使其可以相互替换，让算法的变化独立于使用算法的客户之外
 * 策略模式注重运行时更改委托对象
 * @author zack
 * @since 2016年7月27日
 */
public class AdoptorDemo {
	public static void main(String[] args) {
		CatContext cat = new CatContext(new SilentMeowConcrete());
		cat.display();
		
		System.out.println("------------------------");
		//运行时改变算法对象
		cat.setMeowBehavior(new LoudlyMeowConcrete());
		cat.display();
	}
}
