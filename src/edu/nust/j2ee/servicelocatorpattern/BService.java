package edu.nust.j2ee.servicelocatorpattern;

public class BService implements Service{
	private String name = "BService";
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public void execute() {
		System.out.println(name + "executing.");
	}

}
