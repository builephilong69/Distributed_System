package Distributed_System_Java_Src.rmi_ex1_adder;

import java.rmi.*;

public class AdderClient {
    public static void main(String[] args) {
        try {
            AdderRemoteInterface stub = (AdderRemoteInterface) Naming.lookup("rmi://localhost:1099/AdderRemote");
            int result = stub.add(1, 2);
            System.out.println("1 + 2 = " + result);
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}
