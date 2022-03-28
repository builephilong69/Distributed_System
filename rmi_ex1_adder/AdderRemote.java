package Distributed_System_Java_Src.rmi_ex1_adder;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class AdderRemote extends UnicastRemoteObject implements AdderRemoteInterface {
    public AdderRemote() throws RemoteException {
        super();
    }

    public int add(int a, int b) throws RemoteException {
        return a + b;
    }
}
    
