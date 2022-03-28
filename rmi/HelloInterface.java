package Distributed_System_Java_Src.rmi;

import java.rmi.*;

 public interface HelloInterface extends Remote {
    
    public String say() throws RemoteException;
}
