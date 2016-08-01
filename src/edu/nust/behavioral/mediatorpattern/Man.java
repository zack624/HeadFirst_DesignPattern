package edu.nust.behavioral.mediatorpattern;

public class Man extends PersonColleague {

	public Man(Mediator mediator, String name) {
		super(mediator, name);
	}

	public void getPartner(PersonColleague other) {
		getMediator().getPartner(this);
		getMediator().getPartner(other);
	}

}
