package edu.nust.visitorpattern;

import java.util.ArrayList;
import java.util.List;

public class Menu {
	private List<Item> items = new ArrayList<Item>();

	public List getItems() {
		return items;
	}

	public void setItems(List items) {
		this.items = items;
	}
	public void addItem(Item i){
		items.add(i);
	}
	public void accept(Visitor vistor){
		for (Item item : items) {
			item.accept(vistor);
		}
	}
}
