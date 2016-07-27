package edu.nust.builderpattern.product;

import java.util.ArrayList;
import java.util.List;

import edu.nust.builderpattern.component.Component;
import edu.nust.builderpattern.component.Component2;
import edu.nust.builderpattern.component.Component3;
import edu.nust.builderpattern.component.Component4;

public class BProduct implements AbstractProduct {
	private List<Component> components;
	private String name;
	
	public BProduct() {
		this.name = "product b";
		this.components = new ArrayList<Component>();
	}

	public void display(){
		System.out.println("i am product b.");
		for (Component c : components) {
			System.out.print(c.getName() + ".");
		}
		System.out.println("\n----------product b");
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
