package org.example.designpattern.factory;


public class DefaultMessage implements SendMessageSpi {

	@Override
	public void sendMessage(String message) {
System.out.println("default message builder");		
	}

}
