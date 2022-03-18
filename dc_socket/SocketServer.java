package Distributed_System_Java_Src.dc_socket;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {
    public static void main(String[] args) throws IOException{
        //define server socket
        ServerSocket ss = new ServerSocket(1286);

        //accept from client
        Socket s = ss.accept();

        // define output stream from the server
        OutputStream socketOutputStream = s.getOutputStream();
        DataOutputStream socketDOS = new DataOutputStream(socketOutputStream);

        //send an output from server to client
        socketDOS.writeUTF("Server connected");

        //define server's input
        InputStream sIn = s.getInputStream();
        DataInputStream socketDIS = new DataInputStream(sIn);

        
        while(true)
        {
            //receive message from client
            String receive = socketDIS.readUTF();
            String sent_string= receive;
            //send back to client
            socketDOS.writeUTF(sent_string);
            if(receive.equals("quit"))
                break;
        }
        socketDOS.close();
        socketDIS.close();

        s.close();
        ss.close();
        
    }
    
}
