package org.example.designpattern.factory;


public class SmsMessage implements SendMessageSpi {

	@Override
	public void sendMessage(String message) {
System.out.println("sms had  been sent");		
	}

}
