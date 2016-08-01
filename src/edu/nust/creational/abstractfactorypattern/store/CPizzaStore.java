package edu.nust.creational.abstractfactorypattern.store;

import edu.nust.creational.abstractfactorypattern.pizza.ChaoPizza;
import edu.nust.creational.abstractfactorypattern.pizza.ChinaPizze;
import edu.nust.creational.abstractfactorypattern.pizza.ProductPizza;
import edu.nust.creational.abstractfactorypattern.source.ChaoSourceFactory;
import edu.nust.creational.abstractfactorypattern.source.ChinaSourceFactory;


public class CPizzaStore extends PizzaStore {

	@Override
	public ProductPizza getPizza(String pizzaType) {
		if(pizzaType.equalsIgnoreCase("chinapizza")){
			return new ChinaPizze(new ChinaSourceFactory());
		}else if (pizzaType.equalsIgnoreCase("chaopizza")) {
			return new ChaoPizza(new ChaoSourceFactory());
		}
		return null;
	}

}
