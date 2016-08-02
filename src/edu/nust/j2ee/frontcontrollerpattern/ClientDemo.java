package edu.nust.j2ee.frontcontrollerpattern;

/**
 * 前端控制器模式（Front Controller Pattern）
 * 提供一个集中的请求处理机制，所有的请求都由一个单一的处理程序处理，可以做认证、授权、记录日志、跟踪请求，
 * 然后把请求传给相应的处理程序
 * @author zack
 * @since 2016年8月2日
 */
public class ClientDemo {
	public static void main(String[] args) {
		FrontController fc = new FrontController();
		fc.dispatchRequest("A");
	}
}
