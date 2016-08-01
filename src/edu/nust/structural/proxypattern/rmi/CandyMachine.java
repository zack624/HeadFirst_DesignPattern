package edu.nust.structural.proxypattern.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CandyMachine extends UnicastRemoteObject implements MyMachineRemote{
	String name;
	int count;
	
	public CandyMachine(String name, int count) throws RemoteException {
		this.name = name;
		this.count = count;
	}

	public String getName(){
		return name;
	}
	
	public int getCount(){
		return count;
	}
}
