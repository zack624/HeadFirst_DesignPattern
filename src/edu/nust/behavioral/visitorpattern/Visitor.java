package edu.nust.behavioral.visitorpattern;

public class Visitor {
	public void visitMenu(Item item){
		System.out.println("visit " + item.getName());
	}
}
