package com.bridgelabz;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
//import org.mockito.Mock;

public class UserDetailsTest {
	// @Mock
	// private UserDetails details;
	UserDetails details = new UserDetails();

	/**
	 * We have created this Test case to check if the first name is proper & if
	 * passes the regex pattern. The assertTrue will check if the result is true and
	 * the it will pass the test.
	 */
	@Test
	public void isValidInputFn() {
		boolean actualResult = details.firstName("Saranya");
		assertTrue(actualResult);

	}

	/**
	 * We have created this test case to check if the test fails if we pass the
	 * wrong pattern for first name The assertFalse will check if the result is
	 * false and the it will pass the test.
	 */
	@Test
	public void isInvalidInputFn() {
		boolean actualResult = details.firstName("sary");
		assertFalse(actualResult);
	}

	//@Test
	//public void isEqualInputFn(String firstName) {
	//	boolean actualResult = details.firstName(firstName);
	//	equals(actualResult);
		// assertEqual(actualResult);
	//}

}
