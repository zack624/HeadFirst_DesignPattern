package edu.nust.creational.builderpattern;

import edu.nust.creational.builderpattern.component.Component1;
import edu.nust.creational.builderpattern.component.Component3;
import edu.nust.creational.builderpattern.component.Component4;
import edu.nust.creational.builderpattern.product.AbstractProduct;
import edu.nust.creational.builderpattern.product.BProduct;

public class BBuilder extends AbstractBuilder {
	private AbstractProduct productB;
	@Override
	public AbstractProduct buildProduct() {
		this.productB = new BProduct();
		productB.addComponent(new Component3());
		productB.addComponent(new Component1());
		productB.addComponent(new Component4());
		return productB;
	}

}
