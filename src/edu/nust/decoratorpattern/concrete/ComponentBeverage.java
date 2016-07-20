package edu.nust.decoratorpattern.concrete;

public abstract class ComponentBeverage {
	String description = "unknow beverage";
	
	public String getDescription(){
		return description;
	}
	public abstract double cost();
}
