package edu.nust.abstractfactorypattern.source;


public interface AbstractSourceFactory {
	public Dough createDough();
	public Sauce createSauce();
}
