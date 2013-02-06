package com.plixee.lab;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean
	public MessageService decoratedMessageService() {
		MessageService messageService = new MessageServiceImpl();
		return new AuthorizationDecorator(messageService);
	}

	@Bean
	public MessageService simpleMessageService() {
		return new MessageServiceImpl();
	}
}
