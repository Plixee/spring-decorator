package com.plixee.lab;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class AuthorizationDecoratorTest {
	private MessageService messageService;

	@Before
	public void setUp() {
		this.messageService = new AuthorizationDecorator(
				new MessageServiceImpl());
	}

	@Rule
	public ExpectedException expectedException = ExpectedException.none();

	@Test
	public void chuckNorris_can_post_a_message() {
		// GIVEN
		String author = "Chuck Norris";
		String text = "Hello world!";

		// WHEN
		this.messageService.buildMessage(author, text);

		// THEN
		// No exception.
	}

	@Test
	public void nyan_cat_cannot_post_a_message() {
		// GIVEN
		String author = "Nyan cat";
		String text = "Hello world!";

		// THEN
		this.expectedException.expect(RuntimeException.class);
		this.expectedException
				.expectMessage("Only Chuck Norris can build a message.");

		// WHEN
		this.messageService.buildMessage(author, text);
	}
}
