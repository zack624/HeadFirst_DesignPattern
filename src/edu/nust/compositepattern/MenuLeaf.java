package edu.nust.compositepattern;

import java.util.Iterator;

public class MenuLeaf extends MenuComponent {
	private String name;
	private String description;
	private int price;
	
	public MenuLeaf(String name, String description, int price) {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
	}
	@Override
	public String getName() {
		return name;
	}
	@Override
	public String getDescription() {
		return description;
	}
	@Override
	public int getPrice() {
		return price;
	}

	@Override
	public void print() {
		System.out
				.println("menuleaf:" + name + "," + description + "," + price);
	}
	@Override
	public Iterator createIterator() {
		return new NullIterator();
	}
	
	
}
