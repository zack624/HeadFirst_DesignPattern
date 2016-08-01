package edu.nust.creational.builderpattern.product;

import edu.nust.creational.builderpattern.component.Component;

public interface AbstractProduct {
	public void setName(String name);
	public void addComponent(Component c);
	public void display();
}
