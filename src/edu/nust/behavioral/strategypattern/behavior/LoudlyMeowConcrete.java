package edu.nust.behavioral.strategypattern.behavior;

public class LoudlyMeowConcrete implements MeowBehavior{

	@Override
	public void meow() {
		System.out.println("meow loudly.");
	}
}
