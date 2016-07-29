package edu.nust.visitorpattern;

public class Visitor {
	public void visitMenu(Item item){
		System.out.println("visit " + item.getName());
	}
}
