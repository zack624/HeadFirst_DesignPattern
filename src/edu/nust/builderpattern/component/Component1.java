package edu.nust.builderpattern.component;

public class Component1 implements Component {
	public String name = "c1";

	@Override
	public String getName() {
		return name;
	}
}
