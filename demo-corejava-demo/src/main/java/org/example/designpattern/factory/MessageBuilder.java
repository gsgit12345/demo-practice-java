package org.example.designpattern.factory;


public class MessageBuilder implements MessageBuilderSIC {

	@Override
	public SendMessageSpi buildMessage(String messageType) {

		if(messageType.equalsIgnoreCase("courier"))
		{
			return new CourierMessage();
	
		}else if(messageType.equalsIgnoreCase("sms"))
		{
			return new SmsMessage();

		}
		else if(messageType.equalsIgnoreCase("email"))
		{
			return new EmailSenderMessage();
	
		}
		else
		{
			return new DefaultMessage();
		}
		
	}

}
