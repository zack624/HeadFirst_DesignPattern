package edu.nust.j2ee.frontcontrollerpattern;

public class Dispatcher {
	private AView aview;
	private BView bView;
	
	public Dispatcher() {
		this.aview = new AView();
		this.bView = new BView();
	}
	public void dispatch(String request){
		if(request.equalsIgnoreCase("A")){
			aview.show();
		}else if(request.equalsIgnoreCase("B")){
			bView.show();
		}
	}
}
