package rmi_ex1_adder;

import java.rmi.Naming;

public class AdderServer {
    public static void main(String[] args){
        try{
            AdderRemoteInterface stub = new AdderRemote();
            Naming.rebind("rmi://localhost:1099/AdderRemote", stub);

        }catch(Exception e){
            System.out.println("Exception: " + e);
        }
    }
}
