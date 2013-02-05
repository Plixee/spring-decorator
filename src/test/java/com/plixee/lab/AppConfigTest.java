package com.plixee.lab;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { AppConfig.class })
public class AppConfigTest {
	@Inject
	private MessageService messageService;

	@Test
	public void the_message_service_should_be_decorated() {
		assertTrue(this.messageService instanceof AuthorizationDecorator);
		fail("Write the real test.");
	}
}
