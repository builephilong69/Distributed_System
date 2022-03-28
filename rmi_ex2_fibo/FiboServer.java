package rmi_ex2_fibo;

import java.rmi.*;
import java.rmi.registry.LocateRegistry;

public class FiboServer {
    public static void main(String[] args) {
        try{
            FiboRemoteInterface stub = new FiboRemote();
            LocateRegistry.createRegistry(1099);
            Naming.rebind("rmi://localhost:1099/FiboRemote", stub);

            System.out.println("Server is ready");
        }catch (Exception e){
            System.out.println("Exception: " + e);
        }
    }
}
