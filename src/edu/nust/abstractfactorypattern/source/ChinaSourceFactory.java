package edu.nust.abstractfactorypattern.source;

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
