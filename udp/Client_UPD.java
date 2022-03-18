package main.java.Distributed_System_Java_Src.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Client_UPD {
    public static void main(String[] args){
        DatagramSocket dgSocket = null;
        String hostname="localhost";
        int port=17;
        String client_message = "Bruh";

        try {
            dgSocket = new DatagramSocket();
            byte[] bytes = client_message.getBytes();
            InetAddress serverHost = InetAddress.getByName(hostname);
            int serverPortNumber = port;

            DatagramPacket dgRequest = new DatagramPacket(bytes,client_message.length(),serverHost,serverPortNumber);
            dgSocket.send(dgRequest);

            byte[] byteBuffer = new byte[1000];
            DatagramPacket dgResponse = new DatagramPacket(byteBuffer,byteBuffer.length);
            dgSocket.receive(dgResponse);
            System.out.println("Datagram Response: "+ new String(dgResponse.getData()));

        }catch(SocketException e) {System.out.println("Socket Exception: "+ e.getMessage());}
        catch(IOException e) {System.out.println("IO Exception: "+ e.getMessage());}
        finally{
            if(dgSocket!=null){
                dgSocket.close();
            }
        }
    }
}
