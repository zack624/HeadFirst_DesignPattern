package edu.nust.creational.factorymethodpattern;

public class KPizzaStore extends PizzaStore{

	@Override
	public ProductPizza getPizza(String pizzaType) {
		if(pizzaType.equalsIgnoreCase("koreapizza")){
			return new KoreaPizza();
		}
		return null;
	}

}
