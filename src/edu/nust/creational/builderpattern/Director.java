package edu.nust.creational.builderpattern;

import edu.nust.creational.builderpattern.product.AbstractProduct;
/**
 * 应该是可以不用Director类的，直接使用Builder生成对应产品
 * @author zack
 * @since 2016年7月27日
 */
public class Director {
	private AbstractBuilder builder;
	
	public Director(AbstractBuilder ab){
		this.builder = ab;
	}
	
	public AbstractProduct getProduct(){
		return builder.buildProduct();
	}
	
}
