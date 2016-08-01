package edu.nust.creational.singletonpattern;
/**
 * 懒汉式,线程不安全,不推荐使用
 * 是Lazy初始化
 * lazy loading明显
 * @author zack
 *
 */
public class Singleton1 {
	private static Singleton1 instance;
	private Singleton1(){};
	public static Singleton1 getInstance(){
		if(null == instance){
			instance = new Singleton1();
		}
		return instance;
	}
}
