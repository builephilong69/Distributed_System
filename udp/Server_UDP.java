package main.java.Distributed_System_Java_Src.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;


public class Server_UDP {
    public static void main(String[] args){
        DatagramSocket dgSocket = null;
        
        try {
            int socketNumber = 17;
            dgSocket = new DatagramSocket(socketNumber);
            byte[] buffer = new byte[1000];
            while(true){
                //get request form client, and save it into a prepared request
                DatagramPacket dgRequest =  new DatagramPacket(buffer, buffer.length);
                dgSocket.receive(dgRequest);
                //receive
                String receivedMsg = new String(dgRequest.getData());
                receivedMsg.toUpperCase();
                byte[] responseByte = receivedMsg.getBytes();
                //response
                DatagramPacket dgResponse = new DatagramPacket(responseByte, responseByte.length,dgRequest.getAddress(),dgRequest.getPort());
                dgSocket.send(dgResponse);
            }
        }catch(SocketException e){
            System.out.println("Socket Exception: " + e.getMessage());
        }catch(IOException e){
            System.out.println("IO Exception: " + e.getMessage());
        }finally{
            if(dgSocket!=null){
                dgSocket.close();
            }
        }

    }
}
