package edu.nust.strategypattern.behavior;


public class SilentMeowConcrete implements MeowBehavior {

	@Override
	public void meow() {
		System.out.println("can't meow.");
	}

}
