package edu.nust.creational.factorymethodpattern;

public abstract class ProductPizza {
	String name;
	String dough;
	
	public void prepare(){
		System.out.println("pizza is preparing.");
	}
	
	public void cut(){
		System.out.println("pizza is cutting.");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
