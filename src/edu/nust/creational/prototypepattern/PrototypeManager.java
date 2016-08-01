package edu.nust.creational.prototypepattern;

public class PrototypeManager {
	Prototype prototype;

	public PrototypeManager(Prototype prototype) {
		super();
		this.prototype = prototype;
	}

	public Prototype getPrototype() {
		return prototype;
	}

	public void setPrototype(Prototype prototype) {
		this.prototype = prototype;
	}
	
}
