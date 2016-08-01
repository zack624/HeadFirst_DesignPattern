package edu.nust.creational.builderpattern;

import edu.nust.creational.builderpattern.component.Component1;
import edu.nust.creational.builderpattern.component.Component2;
import edu.nust.creational.builderpattern.product.AProduct;
import edu.nust.creational.builderpattern.product.AbstractProduct;

public class ABuilder extends AbstractBuilder {
	private AbstractProduct productA;
//由ABuiler决定产品A的组件集合包含哪些具体组件	
	public AbstractProduct buildProduct() {
		productA = new AProduct();
		productA.setName("abuilder set the product named a.");
		productA.addComponent(new Component1());
		productA.addComponent(new Component2());
		return productA;
	}


}
