package edu.nust.creational.factorymethodpattern;

public class KoreaPizza extends ProductPizza {
	
	public KoreaPizza(){
		this.name = "korea pizza";
		this.dough = "korea dough";
	}

	@Override
	public void cut() {
		System.out.println("pizza cutting in korea way.");
	}
}
