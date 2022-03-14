package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class EntryTest {

	UserEntry emotion = new UserEntry();

	/**
	 * If we created this test case to check if the user is happy. If happy then it
	 * will be true
	 */
	@Test
	public void messageSuccessful() {
		String actualResult = emotion.analyseEmotion("User is Happy");
		Assert.assertEquals("Entry Successful", actualResult);
	}

	/**
	 * If we created this test case to check if the user is sad.
	 */
	@Test
	public void messageFailed() {
		String actualResult = emotion.analyseEmotion("User is Sad");
		Assert.assertEquals("Entry Failed", actualResult);
	}
}