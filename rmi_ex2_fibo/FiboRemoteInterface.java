package rmi_ex2_fibo;

import java.rmi.*;

public interface FiboRemoteInterface extends Remote{
    public int fibo(int n) throws RemoteException;
}
