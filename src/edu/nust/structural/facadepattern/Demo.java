package edu.nust.structural.facadepattern;
/**
 * 外观模式（Facade Pattern）
 * 提供一个统一的接口用来访问子系统的一群接口，高层接口方便使用子系统
 * @author zack
 * @since 2016年7月20日
 */
public class Demo {
	public static void main(String[] args) {
		Power p = new Power();
		TV t = new TV();
		
//		直接使用子系统接口
		p.powerOn();
		t.tvOn();
		
//		使用外观接口
		MovieFacade mf = new MovieFacade(p, t);
		mf.watchMovie();
	}
}
