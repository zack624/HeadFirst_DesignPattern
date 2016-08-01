package edu.nust.j2ee.businessdelegatepattern;

public class OneClient {
	private BusinessDelegate bDelegate;
	
	public void setbDelegate(BusinessDelegate bDelegate) {
		this.bDelegate = bDelegate;
	}



	public void doTask(){
		this.bDelegate.doTask();
	}
}
