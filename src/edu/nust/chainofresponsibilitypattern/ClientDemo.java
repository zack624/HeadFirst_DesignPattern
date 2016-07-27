package edu.nust.chainofresponsibilitypattern;

/**
 * 责任链模式（Chain Of Responsibility Pattern）
 * 使一个以上的对象有机会处理请求
 * @author zack
 * @since 2016年7月27日
 */
public class ClientDemo {
	public static void main(String[] args) {
		Handler lHandler = new LowHandler();
		Handler mHandler = new MiddleHandler();
		Handler hHandler = new HighHandler();
		
		lHandler.setSuccessor(mHandler);
		mHandler.setSuccessor(hHandler);
		
		lHandler.handlerRequest(99);
		lHandler.handlerRequest(101);
		lHandler.handlerRequest(250);
		lHandler.handlerRequest(330);
	}
	
	
}
