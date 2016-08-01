package edu.nust.j2ee.businessdelegatepattern;

public class QuitService implements BusinessService {

	@Override
	public void doProcess() {
		System.out.println("you are quit out.");
	}

}
