package userdetails;

import java.util.regex.Pattern;

/**
 * functional interface for first name
 * 
 * @author
 *
 */
@FunctionalInterface
interface IfirstName {
	public String validate(String input, String firstname);
}

/**
 * functional interface for last name
 * 
 * @author
 *
 */
@FunctionalInterface
interface ILastName {
	public String validate(String input, String lastname);
}

/**
 * functional interface for email id and it contains an abstract method validate
 * 
 * @author saranya
 *
 */
@FunctionalInterface
interface IEmail {
	public String validate(String input, String email);
}

/**
 * functional interface for phoneNo number and it contains an abstract method
 * validate
 * 
 * @author saranya
 *
 */
@FunctionalInterface
interface IphoneNoNumber {
	public String validate(String input, String phoneNo);
}

/**
 * functional interface for pwd and it contains an abstract method validate
 * 
 * @author saranya
 *
 */
@FunctionalInterface
interface Ipwd {
	public String validate(String input, String pwd);
}

public class LambdaPrograms {
	public static void main(String[] args) {
		/**
		 * To check first name is valid or not using lambda expression and also
		 * providing functional interface
		 */
		IfirstName lfn = (input, firstname) -> {
			return "The first name provided is :" + Pattern.compile(input).matcher(firstname).matches();
		};
		System.out.println(lfn.validate("^([A-Z]{1}[a-z]{2,})$", "Saranya"));
		/**
		 * To check last name is valid or not using lambda expression and also providing
		 * functional interface
		 */
		ILastName lln = (input, lastname) -> {
			return "The last name provided is :" + Pattern.compile(input).matcher(lastname).matches();
		};
		System.out.println(lln.validate("^([A-Z]{1}[a-z]{2,})$", "Siripurapu"));

		/**
		 * To check email id is valid or not using lambda expression and also providing
		 * functional interface
		 */
		IEmail lemail = (input, email) -> {
			return "The email id provided is :" + Pattern.compile(input).matcher(email).matches();
		};
		System.out.println(lemail.validate(
				"^[\\w!#$%&’*+/=?`{|}~^-]+(?:\\.[\\w!#$%&’*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$",
				"bac@yahoo.com"));

		/**
		 * To check phoneNo number is valid or not using lambda expression and also
		 * providing functional interface
		 */
		IfirstName lphonenumber = (input, phoneNo) -> {
			return "The phone number provided is :" + Pattern.compile(input).matcher(phoneNo).matches();
		};
		System.out.println(lphonenumber.validate("^\\+(?:[0-9] ?){6,14}[0-9]$", "+1 1234567890123"));

		/**
		 * To check pwd is valid or not using lambda expression and also providing
		 * functional interface
		 */
		IfirstName pwdOfUser = (input, pwd) -> {
			return "The pwd provided is :" + Pattern.compile(input).matcher(pwd).matches();
		};
		System.out.println(
				pwdOfUser.validate("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])[a-zA-Z0-9]*[\\@\\#\\^][a-zA-Z0-9]*$", "Pwd@123"));
	}
}
