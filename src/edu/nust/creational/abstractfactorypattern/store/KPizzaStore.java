package edu.nust.creational.abstractfactorypattern.store;

import edu.nust.creational.abstractfactorypattern.pizza.KoreaPizza;
import edu.nust.creational.abstractfactorypattern.pizza.ProductPizza;
import edu.nust.creational.abstractfactorypattern.source.KoreaSourceFactory;


public class KPizzaStore extends PizzaStore{

	@Override
	public ProductPizza getPizza(String pizzaType) {
		if(pizzaType.equalsIgnoreCase("koreapizza")){
			return new KoreaPizza(new KoreaSourceFactory());
		}
		return null;
	}

}
