package com.ljma;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "preparing to send message......" );
        String message="SANA JAVA MAIL API";
       String subject="Mail API";
       String from="senders@email.com";
       String to="recievers@email.com";
       sendEmail(message,subject,to,from);
       
    }

	private static void sendEmail(String message, String subject, String to, String from) {
		String host="smtp.gmail.com";
		Properties properties=System.getProperties();
		System.out.println("PROPERTIES"+ properties);
		properties.put("mail.smtp.host", host);
		properties.put("mail.smtp.port", "portid");
		properties.put("mail.smtp.ssl.enable", "true");
		properties.put("mail.smtp.auth", "true");
	
		
		//setting session 2 things to do properties and authenticator an anonymus class
		 Session session=Session.getInstance(properties,new Authenticator()
				 {

					@Override
					protected PasswordAuthentication getPasswordAuthentication() {
						
						return new PasswordAuthentication("emails@email.com","Apppassword");
					}
			});
		
		
		 session.setDebug(true);
		 MimeMessage m=new MimeMessage(session);
		 try {
			m.setFrom(from) ;
			m.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			m.setSubject(subject);
			m.setText(message);
			
			 Transport.send(m); 
			 System.out.println("Sent Success......");
			 
		 }
		 catch(Exception e){
			 e.printStackTrace();
			
			 
		 }
		 
		
		 
	}	
	}
    




