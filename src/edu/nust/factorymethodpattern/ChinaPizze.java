package edu.nust.factorymethodpattern;

public class ChinaPizze extends ProductPizza {
	
	public ChinaPizze(){
		this.name = "china pizza";
		this.dough = "china dough";
	}

	@Override
	public void cut() {
		System.out.println("pizza is cutting in chinese way.");
	}
	
	
}
