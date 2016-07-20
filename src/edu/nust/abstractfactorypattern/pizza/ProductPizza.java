package edu.nust.abstractfactorypattern.pizza;

import edu.nust.abstractfactorypattern.source.Dough;
import edu.nust.abstractfactorypattern.source.Sauce;


public abstract class ProductPizza {
	String name;
	Dough dough;
	Sauce sauce;
	
	public void prepare(){
		System.out.println("pizza is preparing.");
	}
	
	public void cut(){
		System.out.println("pizza is cutting.");
	}

	public String getName() {
		return name;
	}

	public Dough getDough() {
		return dough;
	}

	public Sauce getSauce() {
		return sauce;
	}

	
	
}
