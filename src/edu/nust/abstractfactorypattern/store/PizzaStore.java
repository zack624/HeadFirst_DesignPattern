package edu.nust.abstractfactorypattern.store;

import edu.nust.abstractfactorypattern.pizza.ProductPizza;


public abstract class PizzaStore {
	ProductPizza pizza;
	
	public ProductPizza orderPizza(String pizzaType){
		this.pizza = getPizza(pizzaType);
		pizza.prepare();
		pizza.cut();
		
		return pizza;
	}
	
	public abstract ProductPizza getPizza(String pizzaType);
}
