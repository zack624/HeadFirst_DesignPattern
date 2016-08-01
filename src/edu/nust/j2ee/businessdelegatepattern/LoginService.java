package edu.nust.j2ee.businessdelegatepattern;

public class LoginService implements BusinessService {

	@Override
	public void doProcess() {
		System.out.println("you are login in.");
	}

}
