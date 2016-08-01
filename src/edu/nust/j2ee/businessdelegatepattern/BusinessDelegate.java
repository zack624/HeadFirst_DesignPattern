package edu.nust.j2ee.businessdelegatepattern;

public class BusinessDelegate {
	private BusinessLookup lookup;
	private String serviceName;
	
	public BusinessDelegate() {
		this.lookup = new BusinessLookup();
	}
	
	
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}


	public void doTask(){
		this.lookup.lookupService(serviceName).doProcess();
	}
}
