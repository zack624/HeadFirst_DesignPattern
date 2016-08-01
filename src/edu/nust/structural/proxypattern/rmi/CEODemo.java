package edu.nust.structural.proxypattern.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class CEODemo {
	public static void main(String[] args) {
		MyMachineRemote candyMachine;
		try {
			candyMachine = (MyMachineRemote) Naming.lookup("rmi://127.0.0.1/CandyMachine");
			CandyMonitor cMonitor = new CandyMonitor(candyMachine);
			cMonitor.report();
		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			e.printStackTrace();
		}
		
	}
}
