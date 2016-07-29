package edu.nust.visitorpattern;

public class Item {
	private String name;

	public Item(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void accept(Visitor v){
		v.visitMenu(this);
	}
}
