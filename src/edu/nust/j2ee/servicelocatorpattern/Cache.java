package edu.nust.j2ee.servicelocatorpattern;

import java.util.List;

public class Cache {
	private List<Service> services;
	
	public void addService(Service s){
		for (Service service : services) {
			
		}
	}
	
	public Service getService(String jndiName){
		for (Service service : services) {
			if(service.getName().equals(jndiName)){
				return service; 
			}
		}
		return null;
	}
}
