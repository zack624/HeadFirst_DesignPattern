package edu.nust.builderpattern.product;

import edu.nust.builderpattern.component.Component;

public interface AbstractProduct {
	public void setName(String name);
	public void addComponent(Component c);
	public void display();
}
