package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserDetails {
	public String input;

	public boolean firstName(String firstName) {
		input = "([A-Z]{1}[a-z]{2,})";
		Pattern p = Pattern.compile(input);
		Matcher m = p.matcher(firstName);
		if (m.matches()) {
			System.out.println("Valid Input");
		} else {
			System.out.println("Sorry!! InValid Input");
			System.out.println("Try valid Input");
		}
		return false;

	}
}
