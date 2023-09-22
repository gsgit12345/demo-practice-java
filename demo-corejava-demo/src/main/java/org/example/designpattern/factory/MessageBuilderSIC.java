package org.example.designpattern.factory;


public interface MessageBuilderSIC {
	public SendMessageSpi buildMessage(String messageType);

}
