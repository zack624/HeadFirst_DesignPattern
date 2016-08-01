package edu.nust.behavioral.templatepattern.hook;

public abstract class Template {
	public final void templateMethod(){
		boilWater();
		brew();
		pourInCup();
		if(hook()){
			addCondiments();
		}else{
			System.out.println("no condiments add.");
		}
	}

	public abstract void addCondiments();
//	子类决定是否重写这个方法（钩子）
	public boolean hook() {
		return true;
	}

	public abstract void brew();

	public final void pourInCup() {
		System.out.println("pour in cup.");
	}

	public final void boilWater() {
		System.out.println("boiling water.");
	}
}
