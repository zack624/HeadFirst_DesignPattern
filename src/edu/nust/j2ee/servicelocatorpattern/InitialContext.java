package edu.nust.j2ee.servicelocatorpattern;

public class InitialContext {
	public Service lookup(String jndiName){
		if(jndiName.equalsIgnoreCase("AService")){
			System.out.println("find a AService first time.");
			return new AService();
		}else if(jndiName.equalsIgnoreCase("BService")){
			System.out.println("find a BService first time.");
			return new BService();
		}else{
			return null;
		}
	}
}
