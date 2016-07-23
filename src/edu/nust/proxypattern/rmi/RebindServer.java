package edu.nust.proxypattern.rmi;

import java.rmi.Naming;

public class RebindServer {
	public static void main(String[] args) {
		try{
			CandyMachine cMachine = new CandyMachine("zack", 100);
			Naming.rebind("CandyMachine", cMachine);
		}catch(Exception e){}
	}
}
