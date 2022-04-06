package java_msg_service_code;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.qpid.jms.JmsConnectionFactory;

import javax.jms.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class producer {
    public static void main(String[] args)throws Exception{
        System.out.println("Initialize a connection factory");

        ActiveMQConnectionFactory  connectionFactory = new ActiveMQConnectionFactory("tcp://localhost:61616");

        System.out.println("Create a connection");
        Connection connection = connectionFactory.createConnection("admin","admin");
        connection.start();

        System.out.println("Create a Session");
        Session session = connection.createSession(false,Session.AUTO_ACKNOWLEDGE);

        System.out.println("Create QUEUE or TOPIC based on the user input");
        Destination destination = null;
        Scanner scanner = new Scanner(System.in);
        System.out.print("QUEUE or TOPIC? : ");
        String user_input = scanner.nextLine();
        if(user_input.equalsIgnoreCase("QUEUE")){
            destination = session.createQueue("philong-jms-queue");
        }else if(user_input.equalsIgnoreCase("TOPIC")){
            destination = session.createTopic("philong-jms-topic");
        }else{
            System.out.println("Error: Must specific the right keyword for QUEUE or TOPIC");
            connection.close();
            System.exit(1);
        }
        System.out.println("Create a producer to send msg");
        MessageProducer producer = session.createProducer(destination);

        System.out.println("Start sending messages");
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));){
            String response;
            do{
                System.out.print("Enter message: ");
                response = br.readLine().trim();
                TextMessage msg = session.createTextMessage(response);
                producer.send(msg);
            }while(!response.equalsIgnoreCase("close"));
        }

        System.out.println("Shutdown JMS connection and free resources");
        connection.close();
        scanner.close();
        System.exit(1);
    }
}
