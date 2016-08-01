package edu.nust.creational.factorymethodpattern;

public class ChaoPizza extends ProductPizza {
	public ChaoPizza(){
		this.name = "chao pizza";
		this.dough = "chao dough";
	}

	@Override
	public void cut() {
		System.out.println("cutting is a china chaoshan way.");
	}
	
}
