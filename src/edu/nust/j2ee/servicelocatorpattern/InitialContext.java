package edu.nust.j2ee.servicelocatorpattern;

public class InitialContext {
	public Service lookup(String jndiName){
		if(jndiName.equalsIgnoreCase("A")){
			System.out.println("find a AService");
			return new AService();
		}else if(jndiName.equalsIgnoreCase("b")){
			System.out.println("find a BService");
			return new BService();
		}else{
			return null;
		}
	}
}
