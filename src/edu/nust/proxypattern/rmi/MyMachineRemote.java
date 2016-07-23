package edu.nust.proxypattern.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyMachineRemote extends Remote {
	String getName() throws RemoteException;
	int getCount() throws RemoteException;
}
