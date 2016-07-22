package edu.nust.compositepattern;

import java.util.Iterator;


public abstract class MenuComponent {
	
	public String getName() {
		throw new UnsupportedOperationException();
	}
	public String getDescription() {
		throw new UnsupportedOperationException();
	}
	public int getPrice() {
		throw new UnsupportedOperationException();
	}
	
	public void add(MenuComponent child){
		throw new UnsupportedOperationException();
	}
	
	public void remove(MenuComponent child){
		throw new UnsupportedOperationException();
	}
	
	public Object getChild(int index){
		throw new UnsupportedOperationException();
	}
	
	public void print(){
		throw new UnsupportedOperationException();
	}
	
	public Iterator createIterator(){
		throw new UnsupportedOperationException();
	}
}
