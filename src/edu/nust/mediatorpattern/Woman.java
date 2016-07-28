package edu.nust.mediatorpattern;

public class Woman extends PersonColleague{

	public Woman(Mediator mediator, String name) {
		super(mediator, name);
	}

	@Override
	public void getPartner(PersonColleague other) {
		getMediator().getPartner(this);
		getMediator().getPartner(other);
	}

}
