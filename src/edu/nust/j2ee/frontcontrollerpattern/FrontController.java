package edu.nust.j2ee.frontcontrollerpattern;

public class FrontController {
	private Dispatcher dispatcher;
	
	public FrontController() {
		this.dispatcher = new Dispatcher();
	}

	public void dispatchRequest(String request){
		this.dispatcher.dispatch(request);
	}
}
