package com.venu.jsf; 

import javax.annotation.Resource;
import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.jms.ConnectionFactory;
import javax.jms.Queue;

@Stateless
public class SaveBid {
	
    @Resource(mappedName="java:/AMSQonnectionFactory")
    private ConnectionFactory connectionFactory;

    @Resource(mappedName="java:/queue/test-queue")
   private Queue chatQueue;
	
	
	public  String returnHello(){
		
		try {
		
		if (connectionFactory != null) {
			
			System.out.println("ConnectionFactory is not null");
			
			Util.sendMessage(connectionFactory, chatQueue, "test");
		}
		
		else {
			
			System.out.println("ConnectionFactory is null");

		}
		
		}
		catch(Exception e){
			
			e.printStackTrace();
		}
		
		return "hello";
		
	}
 
}
