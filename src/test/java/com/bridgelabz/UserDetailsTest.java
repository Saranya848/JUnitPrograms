package com.bridgelabz;

import static org.junit.Assert.*;

import org.junit.Test;
//import org.mockito.Mock;

public class UserDetailsTest {
	// @Mock
	// private UserDetails details;
	UserDetails details = new UserDetails();

	/**
	 * We have created this Test case to check if the Last name is proper & if
	 * passes the regex pattern. The assertTrue will check if the result is true and
	 * the it will pass the test.
	 */
	@Test
	public void isValidInputLn() {
		boolean actualResult = details.lastName("Siripurapu");
		assertTrue(actualResult);

	}

	/**
	 * We have created this test case to check if the test fails if we pass the
	 * wrong pattern for Last name The assertFalse will check if the result is
	 * false and the it will pass the test.
	 */
	@Test
	public void isInvalidInputLn() {
		boolean actualResult = details.lastName("siri");
		assertFalse(actualResult);
	}

}
