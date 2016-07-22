package edu.nust.iteratorpattern;
/**
 * 迭代器模式（Iterator Pattern）
 * 提供一种方法顺序访问一个聚合对象中的各个元素，又不暴露其内部的表示
 * @author zack
 * @since 2016年7月22日
 */
public class Demo {
	public static void main(String[] args) {
		Iterator arrayIterator = new ArrayMenuIterator();
		Iterator listIterator = new ListMenuIterator();
		
		System.out.println("------arrayIterator------");
		while(arrayIterator.hasNext()){
			System.out.println(arrayIterator.next());
		}
		
		System.out.println("------listIterator------");
		while(listIterator.hasNext()){
			System.out.println(listIterator.next());
		}
	}
}
