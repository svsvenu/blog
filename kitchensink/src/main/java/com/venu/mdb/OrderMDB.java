package com.venu.mdb;

import javax.ejb.MessageDriven;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.ejb.ActivationConfigProperty;

import org.jboss.ejb3.annotation.ResourceAdapter; 

import com.venu.cache.jdg.SaveToJDG;
import com.venu.cache.terraccota.SaveToTerracota;

@MessageDriven(activationConfig =
{
@ActivationConfigProperty(propertyName="destinationType", propertyValue="javax.jms.Queue"),
@ActivationConfigProperty(propertyName="destination", propertyValue="testQueue"),
@ActivationConfigProperty(propertyName="acknowledgeMode", propertyValue="Auto-acknowledge")
})
@ResourceAdapter(value="org.apache.activemq.ra")
public class OrderMDB implements MessageListener {
public OrderMDB() {
}
public void onMessage(Message message) {
	
	
	System.out.println("received message" + message.toString());
	
	//SaveToTerracota.main(null);
	SaveToJDG.writeToCache("frommdb", "frommdb");
	
	
}
}