package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserDetails {
	public String input;

	public boolean lastName(String lastName) {
		input = "([A-Z]{1}[a-z]{2,})";
		Pattern p = Pattern.compile(input);
		Matcher m = p.matcher(lastName);
		if (m.matches()==true) {
			System.out.println("Valid Input");
		} else {
			System.out.println("Sorry!! InValid Input");
			System.out.println("Try valid Input");
		}
		return m.matches();
	}
}
