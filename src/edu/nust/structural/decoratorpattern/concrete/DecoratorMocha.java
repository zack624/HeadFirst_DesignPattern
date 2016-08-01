package edu.nust.structural.decoratorpattern.concrete;

public class DecoratorMocha extends DecoratorCondiment {
	ComponentBeverage cb;
	public DecoratorMocha(ComponentBeverage cb){
		this.cb = cb;
	}
	@Override
	public String getDescription() {
		return this.cb.getDescription() + ",Mocha ";
	}

	@Override
	public double cost() {
		return 0.5 + this.cb.cost();
	}

}
