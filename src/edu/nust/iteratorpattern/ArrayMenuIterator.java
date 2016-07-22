package edu.nust.iteratorpattern;

public class ArrayMenuIterator implements Iterator{
	static final int ARRAY_MAX = 6;
	int count = 0;
	MenuItem[] items;
	int addIndex = 0;
	
	public ArrayMenuIterator() {
		items = new MenuItem[ARRAY_MAX];
		addItem("arraycai", "shucai",12);
		addItem("arraymeat", "rou", 11);
		addItem("arrayapple","fruit",10);
	}

	public void addItem(String name,String description,int price){
		MenuItem item = new MenuItem(name, description, price);
		if(count >= ARRAY_MAX){
			System.out.println("array is full.");
		}else{
			//需要一个新的索引，避免和next混淆
			items[addIndex] = item;
			addIndex++;
		}
	}

	public MenuItem[] getItems(){
		return items;
	}

	@Override
	public boolean hasNext() {
		if(count < ARRAY_MAX && items[count] != null){
			return true;
		}else{
			return false;
		}
	}

	@Override
	public Object next() {
		MenuItem item = items[count];
		count++;
		return item;
	}
}
