package rmi_ex2_fibo;

import java.rmi.*;

public class FiboClient {
    public static void main(String[] args){
        try{
            FiboRemoteInterface stub = (FiboRemoteInterface) Naming.lookup("rmi://localhost:1099/FiboRemote");
            int result = stub.fibo(10);
            System.out.println("Fibo(10) = " + result);
        }catch(Exception e){
            System.out.println("Exception: " + e);
        }
    }
}
