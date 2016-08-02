package edu.nust.j2ee.interceptingfilterpattern;

/**
 * 拦截过滤器模式（Intercepting Filter Pattern)
 * 对应用程序的请求或响应做一些预处理或后处理
 * @author zack
 * @since 2016年8月2日
 */
public class ClientDemo {
	public static void main(String[] args) {
		FilterChain fc = new FilterChain();
		fc.addFilter(new AFilter());
		fc.addFilter(new BFilter());
		
		fc.setTarget(new Target());
		fc.doProcess();
	}
}
