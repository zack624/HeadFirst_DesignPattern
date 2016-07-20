package edu.nust.abstractfactorypattern.pizza;

import edu.nust.abstractfactorypattern.source.AbstractSourceFactory;


public class ChaoPizza extends ProductPizza {
	public ChaoPizza(AbstractSourceFactory asf){
		this.name = "chao pizza";
		this.dough = asf.createDough();
		this.sauce = asf.createSauce();
	}

	@Override
	public void cut() {
		System.out.println("cutting is a china chaoshan way.");
	}
	
}
