package edu.nust.behavioral.strategypattern.behavior;


public class SilentMeowConcrete implements MeowBehavior {

	@Override
	public void meow() {
		System.out.println("can't meow.");
	}

}
