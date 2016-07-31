package edu.nust.singletonpattern;
/**
 * 登记式/静态内部类,线程安全,明确实现 lazy loading 效果时使用
 * 是Lazy初始化
 * 达到双检锁一样的功效
 * @author zack
 *
 */
public class Singleton5 {
	private static class SingletonHolder{
		private static final Singleton5 instance = new Singleton5();
	}
	private Singleton5(){};
	public static final Singleton5 getInstance(){
		return SingletonHolder.instance;
	}
}
