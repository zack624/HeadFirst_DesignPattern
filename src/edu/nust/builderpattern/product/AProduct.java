package edu.nust.builderpattern.product;

import java.util.ArrayList;
import java.util.List;

import edu.nust.builderpattern.component.Component;
import edu.nust.builderpattern.component.Component1;
import edu.nust.builderpattern.component.Component2;

public class AProduct implements AbstractProduct {
	List<Component> components;
	String name;
	
	public AProduct(){
		this.name = "product a";
		this.components = new ArrayList<Component>();
	}
	
	public void display(){
		System.out.println("i am product a.");
		for (Component c : components) {
			System.out.print(c.getName() + ".");
		}
		System.out.println("\n------------------product a");
	}


	@Override
	public void setName(String name) {
		this.name = name;
	}


	@Override
	public void addComponent(Component c) {
		components.add(c);
	}
}
