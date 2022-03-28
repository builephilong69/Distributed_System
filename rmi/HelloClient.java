package Distributed_System_Java_Src.rmi;
import java.rmi.*;


public class HelloClient {
    public static void main(String[] args) throws Exception {
        try{
            HelloInterface stub = (HelloInterface) Naming.lookup("rmi://localhost:1099/Hello");
            System.out.println(stub.say());
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}
