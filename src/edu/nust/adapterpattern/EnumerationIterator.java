package edu.nust.adapterpattern;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * Iterator是目标接口，Enumeration接口是被适配者，EnumerationIterator是适配器
 * @author zack
 * @since 2016年7月20日
 */
public class EnumerationIterator implements Iterator {
	//组合（Composition）
	private Enumeration e;
	
	public EnumerationIterator(Enumeration e){
		this.e = e;
	}
	
	@Override
	public boolean hasNext() {
		return e.hasMoreElements();
	}

	@Override
	public Object next() {
		return e.nextElement();
	}

	@Override
	public void remove() {
		
	}

}

