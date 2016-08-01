package edu.nust.structural.adapterpattern;

import java.util.Enumeration;

/**
 * 适配器模式（Adapter Pattern）
 * 将一个类的接口转换成客户需要的另一个接口，让原本不兼容的类合作无间
 * @author zack
 * @since 2016年7月20日
 */
public class Demo {
	public static void main(String[] args) {
		concreteEnumeration cEnumeration = new concreteEnumeration(new String[]{"zhao","qian","sun"});
		System.out.println("-----Enumeration-----");
		while(cEnumeration.hasMoreElements()){
			System.out.print(cEnumeration.nextElement()+".");
		}
		
		cEnumeration.setCount(0);
		EnumerationIterator eIterator = new EnumerationIterator(cEnumeration);
		System.out.println("\n-----Iterator-----");
		while (eIterator.hasNext()) {
			System.out.print(eIterator.next()+".");
		}
		
	}
	
	static class concreteEnumeration implements Enumeration{
		private int count;
		private String[] ss;
		
		public concreteEnumeration(String[] s) {
			this.ss = s;
			this.count = 0;
		}

		@Override
		public boolean hasMoreElements() {
			return count < ss.length;
		}
	
		@Override
		public Object nextElement() {
			return ss[count++];
		}
		
		public void setCount(int i) {
			this.count = i;
		}
}
}
