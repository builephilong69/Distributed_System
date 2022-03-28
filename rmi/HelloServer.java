package Distributed_System_Java_Src.rmi;
import java.rmi.*;  

public class HelloServer {
    public static void main(String[] args){
        try{
            HelloInterface hellostub = new HelloRemote();
            Naming.rebind("rmi://localhost:1099/Hello", hellostub);
            System.out.println("Server is ready");
        }catch(Exception e){
            System.out.println("Exception: " + e);
        }
    }
    
}
