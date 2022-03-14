package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserDetails {
	public String input;
	SampleEmails testSampleEmail = new SampleEmails();

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

	public boolean phoneNum(String phoneNum) {
		input = "^[0-9]{2}\\s{1}[0-9]{10}$";
		Pattern pattern = Pattern.compile(input);
		Matcher matcher = pattern.matcher(phoneNum);
		return matcher.matches();
	}

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
}
