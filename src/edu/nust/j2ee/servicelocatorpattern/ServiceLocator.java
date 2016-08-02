package edu.nust.j2ee.servicelocatorpattern;

public class ServiceLocator {
	private static Cache cache = new Cache();
	
	public Service getService(String jndiName){
		Service service = cache.getService(jndiName);
		
		if(service != null){
			return service;
		}
		
		InitialContext ic = new InitialContext();
		Service s = ic.lookup(jndiName);
		cache.addService(s);
		return s;
	}
	
}
