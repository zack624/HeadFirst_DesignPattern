package edu.nust.strategypattern.behavior;

public class LoudlyMeowConcrete implements MeowBehavior{

	@Override
	public void meow() {
		System.out.println("meow loudly.");
	}
}
