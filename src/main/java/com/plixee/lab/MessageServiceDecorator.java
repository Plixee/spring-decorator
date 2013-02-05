package com.plixee.lab;

public abstract class MessageServiceDecorator implements MessageService {
	private MessageService messageService;

	public MessageServiceDecorator(MessageService messageService) {
		this.messageService = messageService;
	}

	@Override
	public String buildMessage(String author, String text) {
		return this.messageService.buildMessage(author, text);
	}
}
