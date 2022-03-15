package userdetails;

//import static org.junit.Assert.assertFalse;
//import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;
//import org.mockito.Mock;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

public class UserTest {
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
	public void isValidInputFn() throws UserRegistrationException{
		boolean actualResult = details.firstName("Sar");
		Assert.assertTrue(actualResult);
	}

	/**
	 * We have created this test case to check if the test fails if we pass the
	 * wrong pattern for First name The assertFalse will check if the result is
	 * false and the it will pass the test.
	 */
	@Test
	public void isInvalidInputFn() throws UserRegistrationException{
		// boolean actualResult1 = details.lastName("sar");
		Assert.assertFalse(details.lastName("sar"));
	}

	/**
	 * We have created this Test case to check if the Last name is proper & if
	 * passes the regex pattern. The assertTrue will check if the result is true and
	 * the it will pass the test.
	 */
	@Test
	public void isValidInputLn() throws UserRegistrationException{
		// boolean actualResult = details.firstName("Sir");
		Assert.assertTrue(details.firstName("Sir"));
	}

	/**
	 * We have created this test case to check if the test fails if we pass the
	 * wrong pattern for Last name The assertFalse will check if the result is false
	 * and the it will pass the test.
	 */
	@Test
	public void isInvalidInputLn() throws UserRegistrationException{
		// boolean actualResult1 = details.lastName("sir");
		Assert.assertFalse(details.lastName("sir"));
	}

	/**
	 * Test case to check if the email is valid then result is true and the it will
	 * pass the test.
	 */
	@Test
	public void isValidEmail() throws UserRegistrationException{
		// boolean actualResult = details.email("acd@yahoo.co");
		Assert.assertTrue(details.email("acd@yahoo.co"));
	}

	/**
	 * Test case to check if the email is not valid then result is true and the it
	 * will fails the test.
	 */
	@Test
	public void isInvalidEmail() throws UserRegistrationException{
		// boolean actualResult1 = details.email("sir@@bl.co.in");
		Assert.assertFalse(details.email("sir@@bl.co.in"));
	}

	/**
	 * Test case to check if the PhoneNo is valid then result is true and the it
	 * will pass the test.
	 */
	@Test
	public void isValidPhoneNo() throws UserRegistrationException{
		// boolean actualResult = details.phoneNum("+1 1234567890123");
		// Assert.assertTrue(actualResult);
		Assert.assertTrue(UserDetails.phoneNum("+1 1234567890123"));
	}

	/**
	 * Test case to check if the PhoneNo is not valid then result is true and the it
	 * will fails the test.
	 */
	@Test
	public void isInvalidPhoneNo() throws UserRegistrationException{
		Assert.assertFalse(UserDetails.phoneNum("494361"));
		// Assert.assertFalse(actualResult1);
	}

	/**
	 * Test case to check if the password is valid then result is true and the it
	 * will pass the test.
	 */
	@Test
	public void isValidPassword() throws UserRegistrationException{
		// boolean actualResult = details.pwd("Pass@123");
		Assert.assertTrue(details.pwd("Pass@123"));
	}

	/**
	 * Test case to check if the password is not valid then result is true and the
	 * it will fails the test.
	 */
	@Test
	public void isInvalidPassword() throws UserRegistrationException{
		// boolean actualResult1 = details.pwd("Password@#123");
		Assert.assertFalse(details.pwd("Password@#123"));
	}

	/**
	 * Test method to check sample emails are valid
	 */
	@Test
	public void checkValidEmails() throws UserRegistrationException{
		// boolean result = details.sampleEmails("abc111@abc.com");
		Assert.assertTrue(details.sampleEmails("abc111@abc.com"));
	}

	/**
	 * Test method to check sample emails are invalid
	 */
	@Test
	public void checkInValidEmails() throws UserRegistrationException{
		// boolean result1 = details.sampleEmails("abc");
		Assert.assertFalse(details.sampleEmails("abc"));
	}
	///**
	// * Test method to check sample emails are valid
	// */
	//@Test
	//public void checkmood() throws UserRegistrationException{
	//	Assert.assertTrue(details.sampleEmails(Happy, "Happy"));
	//}

	///**
	// * Test method to check sample emails are invalid
	// */
	//@Test
	//public void checknotmood() throws UserRegistrationException{
	//	Assert.assertFalse(details.sampleEmails(Sad, "Sad"));
	//}
}
