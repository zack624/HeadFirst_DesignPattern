package edu.nust.decoratorpattern.concrete;

public class ComponentDarkRoast extends ComponentBeverage {
	
	public ComponentDarkRoast(){
		this.description = "DarkRoast ";
	}
	@Override
	public double cost() {
		return 1.2;
	}

}
