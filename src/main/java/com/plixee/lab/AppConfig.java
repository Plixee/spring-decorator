package com.plixee.lab;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean(name = { "decoratedMessageService" })
	public MessageService decoratedMessageService() {
		MessageService messageService = new MessageServiceImpl();
		return new AuthorizationDecorator(messageService);
	}

	@Bean(name = { "simpleMessageService" })
	public MessageService simpleMessageService() {
		return new MessageServiceImpl();
	}
}
