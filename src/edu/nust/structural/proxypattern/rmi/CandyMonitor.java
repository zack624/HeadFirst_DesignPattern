package edu.nust.structural.proxypattern.rmi;

import java.rmi.RemoteException;

public class CandyMonitor {
	MyMachineRemote cMachine;
	
	public CandyMonitor(MyMachineRemote c){
		cMachine = c;
	}
	
	public void report() throws RemoteException{
		System.out.println("CandyMachine:" + cMachine.getName() + "," + cMachine.getCount());
		
	}
}
