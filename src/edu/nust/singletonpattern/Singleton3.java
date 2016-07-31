package edu.nust.singletonpattern;
/**
 * 饿汉式,线程安全,一般常用
 * Lazy初始化:否
 * 容易产生垃圾对象
 * @author zack
 *
 */
public class Singleton3 {
	private static Singleton3 instance = new Singleton3();
	private Singleton3(){};
	public static Singleton3 getInstance(){
		return instance;
	}
}
