package com.plixee.lab;

public class MessageServiceImpl implements MessageService {
	@Override
	public String buildMessage(String author, String text) {
		return author + " posted: " + text;
	}
}
