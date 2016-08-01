package edu.nust.behavioral.mediatorpattern;

public abstract class PersonColleague {
	//每个
	Mediator mediator;
	String name;
	
	public PersonColleague(Mediator mediator, String name) {
		super();
		this.mediator = mediator;
		this.name = name;
	}
	public Mediator getMediator() {
		return mediator;
	}
	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public abstract void getPartner(PersonColleague other);
	
}
