package org.example.designpattern.factory;

public class EmailSenderMessage implements SendMessageSpi {

	@Override
	public void sendMessage(String message) {
System.out.println("email message has been sent");		
	}

}
