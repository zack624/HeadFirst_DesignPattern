package edu.nust.j2ee.servicelocatorpattern;

/**
 * 服务定位器模式（Service Locator Pattern)
 * 在首次请求某个服务时，服务定位器在JNDI中查找服务，并缓存该服务对象，当再次请求相同服务时，
 * 服务定位器会在它的缓存中查找。
 * @author zack
 * @since  2016年8月2日
 */
public class ClientDemo {
	public static void main(String[] args) {
		ServiceLocator sl = new ServiceLocator();
		sl.getService("AService").execute();
		sl.getService("AService").execute();
	}
}
