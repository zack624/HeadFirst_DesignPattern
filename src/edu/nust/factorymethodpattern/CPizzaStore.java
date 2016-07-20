package edu.nust.factorymethodpattern;

public class CPizzaStore extends PizzaStore {

	@Override
	public ProductPizza getPizza(String pizzaType) {
		if(pizzaType.equalsIgnoreCase("chinapizza")){
			return new ChinaPizze();
		}else if (pizzaType.equalsIgnoreCase("chaopizza")) {
			return new ChaoPizza();
		}
		return null;
	}

}
