package com.venu.jsf;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.DeliveryMode;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.TextMessage;

//import org.apache.log4j.Logger;







public class Util {
	
	//private static	Logger logger =  Logger.getLogger(Util.class);

	
	// private static	Logger logger =  LoggerFactory.getLogger(Util.class);
	
	   public static void sendMessage(ConnectionFactory connectionFactory, Queue queue, String text)  throws JMSException {

	        Connection connection = null;
	        Session session = null;

	        try 
	        {
	        	
	        	
	            connection = connectionFactory.createConnection();
	            connection.start();
	            
	            System.out.println("connection started");

	            // Create a Session
	            session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
	            
	            System.out.println("session  created");


	            // Create a MessageProducer from the Session to the Topic or Queue
	            MessageProducer producer = session.createProducer(queue);
	            producer.setDeliveryMode(DeliveryMode.NON_PERSISTENT);

	            // Create a message
	            TextMessage message = session.createTextMessage(text);

	            // Tell the producer to send the message
	            producer.send(message);
	            
	            
	            System.out.println("messsage  sent");
	        } 
	        
	        catch(Exception e){
	        	
	        //	System.out.println.info(e.toString());
	        	
	        }finally {
	            // Clean up
	            if (session != null) session.close();
	            if (connection != null) connection.close();
	        }
	    }

}
