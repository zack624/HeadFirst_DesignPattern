package edu.nust.bridgepattern;

public class RefinedCat extends AbstractionCat {

	
	public RefinedCat() {
		this.behavior = new ConcreteBehavior();
	}

	@Override
	public void multiMeow() {
		System.out.println("use behavior,but do more in this class.");
		behavior.meow();
		behavior.meow();
		behavior.meow();
	}

}
