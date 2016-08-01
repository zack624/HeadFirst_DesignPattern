package edu.nust.behavioral.iteratorpattern;

import java.util.ArrayList;

public class ListMenuIterator implements Iterator {
	ArrayList<MenuItem> items;
	int count = 0;
	
	public ListMenuIterator(){
		items = new ArrayList<MenuItem>();
		addItem("listcai", "listde",79);
		addItem("listrou", "listderou", 112);
		addItem("listfruit", "listdefruit",135);
	}
	
	public void addItem(String name,String description,int price){
		items.add(new MenuItem(name, description, price));
	}
	
	public ArrayList<MenuItem> getItems() {
		return items;
	}

	@Override
	public boolean hasNext() {
		if(count < items.size() && items.get(count) != null){
			return true;
		}else{
			return false;
		}
	}

	@Override
	public Object next() {
		MenuItem item = items.get(count);
		count++;
		return item;
	}

}
