package edu.nust.creational.prototypepattern;

public class ConcretePrototype implements Prototype {
	String name;
	
	public ConcretePrototype(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Object clone(){
		Object clone = null;
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}

	@Override
	public String toString() {
		return "ConcretePrototype [name=" + name + "]";
	}
	
}
