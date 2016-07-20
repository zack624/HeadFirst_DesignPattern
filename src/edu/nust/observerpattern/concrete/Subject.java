package edu.nust.observerpattern.concrete;


public interface Subject {

	
	public void regist(Observer o);
	
	public void remove(Observer o);
	
	public void notifyObservers();
}
