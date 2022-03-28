package Distributed_System_Java_Src.rmi_ex1_adder;

import java.rmi.*;

public interface AdderRemoteInterface extends Remote{
    public int add(int a, int b) throws RemoteException;
}
