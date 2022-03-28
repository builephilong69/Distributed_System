package rmi_ex2_fibo;

import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

public class FiboRemote extends UnicastRemoteObject implements FiboRemoteInterface {
    public FiboRemote() throws RemoteException {
        super();
    }

    public int fibo(int n) throws RemoteException {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }
    
}
