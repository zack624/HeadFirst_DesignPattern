package edu.nust.structural.decoratorpattern.concrete;

public class DecoratorMilk extends DecoratorCondiment {
	ComponentBeverage cb;
	
	public DecoratorMilk(ComponentBeverage cb){
		this.cb = cb;
	}
	
	@Override
	public String getDescription() {
		return this.cb.getDescription() + ",Milk ";
	}

	@Override
	public double cost() {
		return 0.2 + this.cb.cost();
	}

}
