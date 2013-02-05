package com.plixee.lab;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean
	public MessageService messageService() {
		// TODO have a second bean without decoration?
		MessageService messageService = new MessageServiceImpl();
		return new AuthorizationDecorator(messageService);
	}
}
