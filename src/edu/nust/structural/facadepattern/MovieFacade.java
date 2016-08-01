package edu.nust.structural.facadepattern;

public class MovieFacade {
	private Power power;
	private TV tv;
	
	public MovieFacade(Power p,TV t){
		this.power = p;
		this.tv = t;
	}
	
	public void watchMovie(){
		power.powerOn();
		tv.tvOn();
	}
	
	public void turnDownMovie(){
		tv.tvOff();
		power.powerOff();
	}
}
