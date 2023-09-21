package designepattern.factorypattern;

public class MessageBuilderFactory {
	
	public static MessageBuilder getMessageBuilder(String type)
	{
		if(type.equalsIgnoreCase("sms"))
		{
			return new SmsNotification();
		}else
		{
			return new EmailNotification();
		}
	}

}
