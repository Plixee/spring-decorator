package com.plixee.lab;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class MessageServiceImplTest {
	private MessageService messageService;

	@Before
	public void setUp() {
		this.messageService = new MessageServiceImpl();
	}

	@Test
	public void buildMessage_builds_the_message() {
		// GIVEN
		String author = "Bruce";
		String text = "Hi buddy!";

		// WHEN
		String message = this.messageService.buildMessage(author, text);

		// THEN
		assertEquals("Bruce posted: Hi buddy!", message);
	}
}
