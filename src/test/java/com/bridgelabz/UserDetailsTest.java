package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;
//import org.mockito.Mock;

public class UserDetailsTest {
	// @Mock
	// private UserDetails details;
	UserDetails details = new UserDetails();

	/**
	 * We have created this Test case to check if the First name is proper & if
	 * passes the regex pattern. The assertTrue will check if the result is true and
	 * the it will pass the test.
	 */
	@Test
	public void isValidInputFn() {
		boolean actualResult = details.firstName("Saranya");
		Assert.assertTrue(actualResult);
	}

	/**
	 * We have created this test case to check if the test fails if we pass the
	 * wrong pattern for First name The assertFalse will check if the result is
	 * false and the it will pass the test.
	 */
	@Test
	public void isInvalidInputFn() {
		boolean actualResult1 = details.lastName("saranya");
		Assert.assertFalse(actualResult1);
	}

	/**
	 * We have created this Test case to check if the Last name is proper & if
	 * passes the regex pattern. The assertTrue will check if the result is true and
	 * the it will pass the test.
	 */
	@Test
	public void isValidInputLn() {
		boolean actualResult = details.firstName("Sir");
		Assert.assertTrue(actualResult);
	}

	/**
	 * We have created this test case to check if the test fails if we pass the
	 * wrong pattern for Last name The assertFalse will check if the result is false
	 * and the it will pass the test.
	 */
	@Test
	public void isInvalidInputLn() {
		boolean actualResult1 = details.lastName("sir");
		Assert.assertFalse(actualResult1);
	}

	/**
	 * Test case to check if the email is valid then result is true and the it will
	 * pass the test.
	 */
	@Test
	public void isValidEmail() {
		boolean actualResult = details.email("acd@yahoo.co");
		Assert.assertTrue(actualResult);
	}

	/**
	 * Test case to check if the email is not valid then result is true and the it
	 * will fails the test.
	 */
	@Test
	public void isInvalidEmail() {
		boolean actualResult1 = details.email("sir@@bl.co.in");
		Assert.assertFalse(actualResult1);
	}
}
