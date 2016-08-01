package edu.nust.creational.abstractfactorypattern.source;

public class ChinaSourceFactory implements AbstractSourceFactory {

	@Override
	public Dough createDough() {
		return new ChinaDough();
	}

	@Override
	public Sauce createSauce() {
		return new ChinaSauce();
	}

}
