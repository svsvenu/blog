package com.venu.jsf;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import org.jboss.logging.Logger;
import org.jboss.logging.Logger.Level;


//import org.apache.log4j.Logger;




@ManagedBean(name = "welcome", eager = true)
public class WelcomeBean {
	
// private static	Logger logger =  Logger.getLogger(WelcomeBean.class);
	
	private static final Logger logger = Logger.getLogger(WelcomeBean.class.getName());

	
	@Inject
	private SaveBid saveBid;
	
	private String userName;
	
    public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public WelcomeBean() {
		
       System.out.println("WelcomeBean instantiated");
       
       System.out.println("Name of logger is  " + logger.getName());
       
       int i = 0;
       
       while (i < 100) {
       
       logger.info("INFO-welcome bean logged using joss loggin");
       logger.fatal("fatal-msg");
       logger.debug("debug-welcome bean logged using joss loggin");
       logger.error("error-welcome bean logged using joss loggin");
       logger.warn("warn-warm");
       logger.log(Level.DEBUG, "debug-welcome bean logged using joss loggin");
       
       i++;
       try{
       Thread.sleep(1000L);
       
       }
       
       catch(Exception e){
    	   e.printStackTrace();
    	   
       }

       }

    }
    public String getMessage() {
    	
    	System.out.println("user name is " + userName);
    	
    	if (saveBid == null) {
    		
    		System.out.println("saveBid is null");
    	}
    	
    	else {
    		
    		System.out.println("saveBid is NOT null, injection succesful with @inject and it says " + saveBid.returnHello());

    	}
        return "I'm alive!";
    }
    
    public String processRequest(){
    	
    	System.out.println("processrequest invokded");
    	
    	System.out.println("forwarding to page 2 called input is " + userName);
    	
    	return "page2";
    	
    }
}