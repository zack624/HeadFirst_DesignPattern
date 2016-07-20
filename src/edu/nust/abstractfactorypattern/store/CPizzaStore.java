package edu.nust.abstractfactorypattern.store;

import edu.nust.abstractfactorypattern.pizza.ChaoPizza;
import edu.nust.abstractfactorypattern.pizza.ChinaPizze;
import edu.nust.abstractfactorypattern.pizza.ProductPizza;
import edu.nust.abstractfactorypattern.source.ChaoSourceFactory;
import edu.nust.abstractfactorypattern.source.ChinaSourceFactory;


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
