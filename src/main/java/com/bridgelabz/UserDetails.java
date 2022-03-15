package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserDetails {
	/**
	 * 1. To check firstname of the User using Regex
	 * 2. To check Last name of the User using Regex
	 * 3. To check Email of the User using Regex
	 * 4. To check Phone number of the User valid or not using Regex
	 * 5. To check Password valid or not using Regex
	 * 6. to check valid and invalid emails
	 * 7. To check Mood of the User
	 */
	public static String input;
	SampleEmails testSampleEmail = new SampleEmails();

	/**
	 * 1. To check firstname of the User using Regex
	 * 
	 * @param firstName - first name of the User
	 * @return
	 */
	public boolean firstName(String firstName) {
		input = "([A-Z]{1}[a-z]{2,})";
		Pattern p = Pattern.compile(input);
		Matcher m = p.matcher(firstName);
		if (m.matches() == true) {
			System.out.println("Valid Input");
		} else {
			System.out.println("Sorry!! InValid Input");
			System.out.println("Try valid Input");
		}
		return m.matches();
	}

	/**
	 * 2. To check Last name of the User using Regex
	 * 
	 * @param lastName - Last name of the User
	 * @return
	 */
	public boolean lastName(String lastName) {
		input = "([A-Z]{1}[a-z]{2,})";
		Pattern p = Pattern.compile(input);
		Matcher m = p.matcher(lastName);
		if (m.matches() == true) {
			System.out.println("Valid Input");
		} else {
			System.out.println("Sorry!! InValid Input");
			System.out.println("Try valid Input");
		}
		return m.matches();
	}

	/**
	 * 3. To check Email of the User using Regex
	 * 
	 * @param email - mail ids of User
	 * @return
	 */
	public boolean email(String email) {
		input = "^[\\w!#$%&’*+/=?`{|}~^-]+(?:\\.[\\w!#$%&’*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";

		// Pattern p = Pattern.complie("((?=.*\\d).{8,20})");
		Pattern p = Pattern.compile(input);
		Matcher m = p.matcher(email);
		if (m.matches() == true) {
			System.out.println("Valid Input");
		} else {
			System.out.println("Sorry!! InValid Input");
			System.out.println("Try valid Input");
		}
		return m.matches();
	}

	/**
	 * 4. To check Phone number of the User valid or not using Regex
	 * 
	 * @param phoneNum - contact number of User
	 * @return
	 */
	public static boolean phoneNum(String phoneNum) {
		input = "^\\+(?:[0-9] ?){6,14}[0-9]$";
		Pattern pattern = Pattern.compile(input);
		Matcher matcher = pattern.matcher(phoneNum);
		return matcher.matches();
	}

	/**
	 * 5. To check Password valid or not using Regex
	 * 
	 * @param pwd - security pin of the User account
	 * @return
	 */
	public boolean pwd(String pwd) {
		input = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])[a-zA-Z0-9]*[\\@\\#\\^][a-zA-Z0-9]*$";

		// Pattern p = Pattern.complie("((?=.*\\d).{8,20})");
		Pattern p = Pattern.compile(input);
		Matcher m = p.matcher(pwd);
		if (m.matches() == true) {
			System.out.println("Valid Input");
		} else {
			System.out.println("Sorry!! InValid Input");
			System.out.println("Try valid Input");
		}
		return m.matches();
	}

	/**
	 * 6. to check valid and invalid emails
	 * 
	 * @param email - mail ids of user
	 * @return
	 */
	public boolean sampleEmails(String email) {

		input = "^[\\w!#$%&’*+/=?`{|}~^-]+(?:\\.[\\w!#$%&’*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
		Pattern p = Pattern.compile(input);
		Matcher m = p.matcher(email);
		if (m.matches() == true) {
			System.out.println(testSampleEmail.testForValidEmails());
		} else {
			System.out.println(testSampleEmail.testForNonValidEmails());
			System.out.println("Try valid Input");
		}
		return m.matches();
	}

	/**
	 * 7. To check Mood of the User
	 * 
	 * @param firstName - first name of the User
	 * @param lastName  - Last name of the User
	 * @param phoneNum  - contact number of the User
	 * @param email     - conacted mail id of the User
	 * @param password  - security pin for email of the User
	 * @return
	 */
	public String moodAnalyzer(String firstName, String lastName, String phoneNum, String email, String password) {
		if (firstName(firstName) == true && lastName(lastName) == true && email(email) == true
				&& phoneNum(phoneNum) == true && pwd(password) == true) {
			return "HAPPY";
		} else {
			return "SAD";
		}
	}
}
