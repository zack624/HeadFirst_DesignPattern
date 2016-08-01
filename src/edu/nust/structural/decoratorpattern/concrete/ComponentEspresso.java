package edu.nust.structural.decoratorpattern.concrete;

public class ComponentEspresso extends ComponentBeverage {

	public ComponentEspresso(){
		this.description = "Espresso ";
	}
	@Override
	public double cost() {
		return 2.3;
	}

}
