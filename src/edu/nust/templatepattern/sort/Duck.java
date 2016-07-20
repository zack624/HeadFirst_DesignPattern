package edu.nust.templatepattern.sort;

public class Duck implements Comparable {
	String name;
	int weight;
	
	public Duck(String name, int weight) {
		super();
		this.name = name;
		this.weight = weight;
	}

	@Override
	public int compareTo(Object duck) {
		Duck d = (Duck) duck;
		if(this.weight < d.weight){
			return -1;
		}else if(this.weight == d.weight){
			return 0;
		}else{
			return 1;
		}
	}

	@Override
	public String toString() {
		return "Duck [name=" + name + ", weight=" + weight + "]";
	}

}
