package com.bridgelabz;

//import static org.junit.Assert.assertFalse;
//import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;
//import org.mockito.Mock;

public class UserDetailsTest {
	// @Mock
	// private UserDetails details;
	UserDetails details = new UserDetails();
	SampleEmails se = new SampleEmails();

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

	/**
	 * Test case to check if the PhoneNo is valid then result is true and the it
	 * will pass the test.
	 */
	@Test
	public void isValidPhoneNo() {
		boolean actualResult = details.phoneNum("91 953210786");
		Assert.assertTrue(actualResult);
	}

	/**
	 * Test case to check if the PhoneNo is not valid then result is true and the it
	 * will fails the test.
	 */
	@Test
	public void isInvalidPhoneNo() {
		boolean actualResult1 = details.phoneNum("919866795861");
		Assert.assertFalse(actualResult1);
	}

	/**
	 * Test case to check if the password is valid then result is true and the it
	 * will pass the test.
	 */
	@Test
	public void isValidPassword() {
		boolean actualResult = details.pwd("Pass@123");
		Assert.assertTrue(actualResult);
	}

	/**
	 * Test case to check if the password is not valid then result is true and the
	 * it will fails the test.
	 */
	@Test
	public void isInvalidPassword() {
		boolean actualResult1 = details.pwd("Password@#123");
		Assert.assertFalse(actualResult1);
	}

	/**
	 * Test method to check sample emails are valid
	 */
	@Test
	public void checkValidEmails() {
		boolean result = details.sampleEmails("abc111@abc.com");
		Assert.assertTrue(result);
	}

	/**
	 * Test method to check sample emails are invalid
	 */
	@Test
	public void checkInValidEmails() {
		boolean result1 = details.sampleEmails("abc");
		Assert.assertFalse(result1);
	}
}
