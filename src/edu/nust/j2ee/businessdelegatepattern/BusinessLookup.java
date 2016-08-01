package edu.nust.j2ee.businessdelegatepattern;

public class BusinessLookup {
	
	public BusinessService lookupService(String serviceName){
		if(serviceName.equalsIgnoreCase("login")){
			return new LoginService();
		}else if(serviceName.equalsIgnoreCase("quit")){
			return new QuitService();
		}else{
			return null;
		}
	}
}
