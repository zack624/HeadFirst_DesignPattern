package edu.nust.abstractfactorypattern.store;

import edu.nust.abstractfactorypattern.pizza.KoreaPizza;
import edu.nust.abstractfactorypattern.pizza.ProductPizza;
import edu.nust.abstractfactorypattern.source.KoreaSourceFactory;


public class KPizzaStore extends PizzaStore{

	@Override
	public ProductPizza getPizza(String pizzaType) {
		if(pizzaType.equalsIgnoreCase("koreapizza")){
			return new KoreaPizza(new KoreaSourceFactory());
		}
		return null;
	}

}
