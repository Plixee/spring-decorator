package com.plixee.lab;

import static org.junit.Assert.assertTrue;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { AppConfig.class })
public class AppConfigTest {
	@Inject
	private MessageService decoratedMessageService;
	@Inject
	private MessageService simpleMessageService;

	@Test
	public void the_decoratedMessageService_should_be_decorated() {
		assertTrue(this.decoratedMessageService instanceof AuthorizationDecorator);
	}

	@Test
	public void the_simpleMessageService_should_not_be_decorated() {
		assertTrue(this.simpleMessageService instanceof MessageServiceImpl);
	}
}
