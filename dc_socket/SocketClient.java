package Distributed_System_Java_Src.dc_socket;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;



public class SocketClient {
    public static void main(String[] args)throws IOException {
        //connect socket to the host
        Socket s = new Socket("localhost",1286);

        //define socket input stream
        InputStream sIn = s.getInputStream();
        DataInputStream socketDIS = new DataInputStream(sIn);
        //read the first message from server
        String testString = new String(socketDIS.readUTF());
        //print it  out
        System.out.println(testString);

        //Data output
        OutputStream socketOutputStream = s.getOutputStream();
        DataOutputStream socketDOS = new DataOutputStream(socketOutputStream);
        String sent_string  ="";
        String receive = "";
        Scanner sc = new Scanner(System.in);

        while(true)
        {
            System.out.println("\nEnter some words: ");
            sent_string= sc.nextLine();
            //send the message to the server
            socketDOS.writeUTF(sent_string);
            //read server's response
            receive = socketDIS.readUTF();
            if(receive.equals("quit"))
            {
                break;
            }
            //print it out
            System.out.println("\n\n->Answer from server : "+ receive);
        }

        socketDIS.close();
        socketDOS.close();

        sIn.close();
        s.close();
        sc.close();
        
        
    }
}
