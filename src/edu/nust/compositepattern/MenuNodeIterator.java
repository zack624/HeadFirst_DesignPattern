package edu.nust.compositepattern;

import java.util.Iterator;
import java.util.Stack;

public class MenuNodeIterator implements Iterator<Object>{
	Stack stack = new Stack();
	
	
	public MenuNodeIterator(Iterator i) {
		stack.push(i);
	}

	@Override
	public boolean hasNext() {
		if(stack.empty()){
			return false;
		}else{
			Iterator i = (Iterator) stack.peek();
			if(!i.hasNext()){
				stack.pop();
				return hasNext();
			}else{
				return true;
			}
		}
	}

	@Override
	public Object next() {
		if(hasNext()){
			Iterator i = (Iterator) stack.peek();
			MenuComponent menuNode = (MenuComponent) i.next();
			if(menuNode instanceof MenuNode){
				stack.push(menuNode.createIterator());
			}
			return menuNode;
		}else{
			return null;
		}
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}

}
