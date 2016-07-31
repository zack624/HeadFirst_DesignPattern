package edu.nust.singletonpattern;
/**
 * 懒汉式,线程安全,不推荐使用
 * 是Lazy初始化
 * lazy loading很好
 * 效率很低
 * @author zack
 *
 */
public class Singleton2 {
	private static Singleton2 instance;
	private Singleton2(){};
	public static synchronized Singleton2 getInstance(){
		if(null == instance){
			instance = new Singleton2();
		}
		return instance;
	}
}
