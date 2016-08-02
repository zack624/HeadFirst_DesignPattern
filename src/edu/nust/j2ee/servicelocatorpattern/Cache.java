package edu.nust.j2ee.servicelocatorpattern;

import java.util.ArrayList;
import java.util.List;

public class Cache {
	private List<Service> services;
	
	
	
	public Cache() {
		services = new ArrayList<Service>();
	}

	public void addService(Service s){
		boolean flag = false;
		for (Service service : services) {
			if(service.getName().equalsIgnoreCase(s.getName())){
				flag = true;
			}
		}
		if(!flag){
			services.add(s);
		}
	}
	
	public Service getService(String jndiName){
		for (Service service : services) {
			if(service.getName().equalsIgnoreCase(jndiName)){
				return service;
			}
		}
		return null;
	}
}
