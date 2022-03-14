package com.bridgelabz;

public class UserEntry {
	/**
	 *  1. method to check if it is Happy or sad test case
	 *  2. If it is happy then it returns Entry Successful.
	 *  3. If it sad then it returns Entry Failed
	 *
	 */
	public String analyseEmotion(String emotion) {
		if (emotion.toLowerCase().contains("happy")) {
			return "Entry Successful";//emotion is happy
		} else if (emotion.toLowerCase().contains("sad")) {
			return "Entry Failed";//emotion is sad
		} else
			return null;
	}
}
