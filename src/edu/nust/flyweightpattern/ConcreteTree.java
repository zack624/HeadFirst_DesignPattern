package edu.nust.flyweightpattern;

public class ConcreteTree implements Tree {
	private String name;
	
	public ConcreteTree(String name) {
		super();
		this.name = name;
	}

	@Override
	public void display() {
		System.out.println("this tree's name is " + name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
