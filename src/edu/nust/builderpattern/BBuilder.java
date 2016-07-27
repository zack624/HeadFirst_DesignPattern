package edu.nust.builderpattern;

import edu.nust.builderpattern.component.Component1;
import edu.nust.builderpattern.component.Component3;
import edu.nust.builderpattern.component.Component4;
import edu.nust.builderpattern.product.AbstractProduct;
import edu.nust.builderpattern.product.BProduct;

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
