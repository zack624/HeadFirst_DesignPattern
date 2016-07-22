package edu.nust.compositepattern;

import java.util.Iterator;

public class Waitress {
	MenuComponent menu;
	
	public Waitress(MenuComponent menu) {
		this.menu = menu;
	}


	public void printMenu(){
		Iterator i = menu.createIterator();
		while(i.hasNext()){
//			System.out.println("waitress here");
			MenuComponent menuNode = (MenuComponent) i.next();
			try{
				menuNode.print();
			}catch(UnsupportedOperationException e){}
		}
	}
}
