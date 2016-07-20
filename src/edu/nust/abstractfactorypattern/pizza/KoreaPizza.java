package edu.nust.abstractfactorypattern.pizza;

import edu.nust.abstractfactorypattern.source.AbstractSourceFactory;


public class KoreaPizza extends ProductPizza {
	
	public KoreaPizza(AbstractSourceFactory asf){
		this.name = "korea pizza";
		this.dough = asf.createDough();
		this.sauce = asf.createSauce();
	}

	@Override
	public void cut() {
		System.out.println("pizza cutting in korea way.");
	}
}
