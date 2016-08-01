package edu.nust.structural.flyweightpattern;

/**
 * 享元模式（Flyweight Pattern）
 * 让某个类的一个实例能提供多个虚拟实例
 * @author zack
 * @since 2016年7月28日
 */
public class ClientDemo {
	public static void main(String[] args) {
		Tree ta = TreeFactory.getTree("ATree");
		Tree tb = TreeFactory.getTree("BTree");
		Tree tc = TreeFactory.getTree("ATree");
		
		ta.display();
		tb.display();
		tc.display();
		
		if(ta == tc){
			System.out.println("ta is the same of tc.");
		}
	}
}
