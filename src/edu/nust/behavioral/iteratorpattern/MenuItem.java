package edu.nust.behavioral.iteratorpattern;

public class MenuItem {
	private String name;
	private String description;
	private int price;
	
	public MenuItem(String name, String description, int price) {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
	public int getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return "MenuItem [name=" + name + ", description=" + description
				+ ", price=" + price + "]";
	}
	
	
}
