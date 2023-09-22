package org.example.designpattern.factorypattern;

public class MessageBuilderClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MessageBuilder  mess=MessageBuilderFactory.getMessageBuilder("sms");
		
		mess.sendNotification();

	}

}
