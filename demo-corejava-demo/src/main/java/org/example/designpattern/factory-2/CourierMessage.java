package factory;

public class CourierMessage implements SendMessageSpi {

	@Override
	public void sendMessage(String message) {
System.out.println("courier message had been sent"+message);		
	}

}
