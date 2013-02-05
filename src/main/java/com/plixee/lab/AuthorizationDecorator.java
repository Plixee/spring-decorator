package com.plixee.lab;

public class AuthorizationDecorator extends MessageServiceDecorator {
	public AuthorizationDecorator(MessageService messageService) {
		super(messageService);
	}

	@Override
	public String buildMessage(String author, String text) {
		if ("Chuck Norris".equals(author)) {
			return super.buildMessage(author, text);
		} else {
			throw new RuntimeException("Only Chuck Norris can build a message.");
		}
	}
}
