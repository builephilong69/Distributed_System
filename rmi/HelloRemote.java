package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloRemote extends UnicastRemoteObject implements HelloInterface {
    HelloRemote()throws RemoteException{
        super();
    }
    public String say() throws RemoteException {
        return "Hello lmao lmao lmao lmao";
    }
}
