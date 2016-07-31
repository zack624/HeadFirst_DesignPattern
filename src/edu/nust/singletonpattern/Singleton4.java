package edu.nust.singletonpattern;
/**
 * 双检锁/双重校验锁(DCL),线程安全,特殊需要时考虑使用
 * 是Lazy初始化
 * @author zack
 *
 */
public class Singleton4 {
	private volatile static Singleton4 instance;
	private Singleton4(){};
	public static Singleton4 getInstance(){
		if(null == instance){
			synchronized(Singleton4.class){
				if(null == instance){
					instance = new Singleton4();
				}
			}
		}
		return instance;
	}
}
