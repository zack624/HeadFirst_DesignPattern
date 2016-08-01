package edu.nust.behavioral.strategypattern;

import edu.nust.behavioral.strategypattern.behavior.MeowBehavior;

/**
 * 策略模式的上下文是具体类，模式注重的是更换算法行为，运行时更换
 * @author zack
 * @since 2016年7月27日
 */
public class CatContext {
	protected MeowBehavior meowBehavior;
	
	public CatContext(MeowBehavior meowBehavior) {
		super();
		this.meowBehavior = meowBehavior;
	}

	public void meow(){
		meowBehavior.meow();
	}
	
	
	public void display(){
		System.out.println("i am a cat.");
		meow();
	}

	public void setMeowBehavior(MeowBehavior meowBehavior) {
		this.meowBehavior = meowBehavior;
	}


	
	
	
}
