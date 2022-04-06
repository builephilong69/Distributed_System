package java_msg_service_code;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.Connection;
import javax.jms.Session;
import javax.jms.Destination;
import javax.jms.MessageConsumer;
import javax.jms.TextMessage;
import javax.jms.*;
import java.util.Scanner;

public class consumer {
    public static void main(String[] args) throws JMSException {
        System.out.println("Create a ConnectionFactory");
        ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory("tcp://localhost:61616");
        System.out.println("Create a Connection");
        Connection connection = connectionFactory.createConnection("admin", "admin");
        connection.start();

        System.out.println("Create a Session");
        Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
        System.out.println("Create QUEUE or TOPIC based on the user input");
        Destination destination = null;
        Scanner scanner = new Scanner(System.in);
        System.out.print("QUEUE or TOPIC? : ");
        String user_input = scanner.nextLine();
        if (user_input.equalsIgnoreCase("QUEUE")) {
            destination = session.createQueue("philong-jms-queue");
        } else if (user_input.equalsIgnoreCase("TOPIC")) {
            destination = session.createTopic("philong-jms-topic");
        } else {
            System.out.println("Error: Must specific the right keyword for QUEUE or TOPIC");
            connection.close();
            System.exit(1);
        }
        System.out.println("Create a Consumer to receive msg");
        MessageConsumer consumer = session.createConsumer(destination);

        System.out.println("Ready to receive messages....");

        String body;
        do {
            Message msg = consumer.receive();
            body = ((TextMessage) msg).getText();
            System.out.println("has received: " + body);

        } while (!body.equalsIgnoreCase("close"));
        System.out.println("Shutdown JMS connection, freeing resources");
        connection.close();
        System.exit(1);

    }
}
