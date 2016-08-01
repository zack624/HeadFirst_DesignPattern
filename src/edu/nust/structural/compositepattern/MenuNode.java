package edu.nust.structural.compositepattern;

import java.util.ArrayList;
import java.util.Iterator;

public class MenuNode extends MenuComponent {
	private String name;
	private String description;
	private ArrayList menuChildren = new ArrayList();
	
	public MenuNode(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}
	@Override
	public String getName() {
		return name;
	}
	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public void add(MenuComponent child) {
		menuChildren.add(child);
	}
	@Override
	public void remove(MenuComponent child) {
		menuChildren.remove(child);
	}
	@Override
	public Object getChild(int index) {
		return menuChildren.get(index);
	}
//	@Override
//	public void print() {
//		System.out.println("menunode:"+name+","+description);
//		Iterator<MenuComponent> iterator = menuChildren.iterator();
//		while(iterator.hasNext()){
//			iterator.next().print();
//		}
//	}
	@Override
	public Iterator createIterator() {
		return new MenuNodeIterator(menuChildren.iterator());
	}
	
	
}
