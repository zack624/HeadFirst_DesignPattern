package edu.nust.creational.abstractfactorypattern.source;

public class ChaoSourceFactory implements AbstractSourceFactory {

	@Override
	public Dough createDough() {
		return new ChaoDough();
	}

	@Override
	public Sauce createSauce() {
		return new ChaoSauce();
	}

}
