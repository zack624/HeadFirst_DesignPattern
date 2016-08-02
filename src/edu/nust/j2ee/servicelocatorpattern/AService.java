package edu.nust.j2ee.servicelocatorpattern;

public class AService implements Service {
	private String name = "AService";
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public void execute() {
		System.out.println(name + "executing.");
	}

}
