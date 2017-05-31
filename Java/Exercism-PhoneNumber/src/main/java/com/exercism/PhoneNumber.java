package com.exercism;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// http://exercism.io/exercises/java/phone-number/readme
// Regular expression: ^[1]?\D?\s{0,}(\d{3})\D?\D?\s{0,}(\d{3})\D?\s{0,}(\d{4})\s{0,}$
// Thanks to: http://www.regexlib.com/REDetails.aspx?regexp_id=45

public class PhoneNumber {
	
	private String phoneNumber;
	
	public PhoneNumber(String phoneNumber) {
		setPhoneNumber(phoneNumber);
	}

	public String getNumber() {
		return getPhoneNumber();
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public final void setPhoneNumber(String phoneNumber) throws IllegalArgumentException {
		
		// Perform phoneNumber string validations before proceeding forward
		if (phoneNumberValidation(phoneNumber)) {
			// If all checks have completed the number is correct and we can extract the digits from the string passed as phoneNumber
			this.phoneNumber = extractDigitsFromString(phoneNumber);	
		}
	}
	
	/**
	 * Verify if provided string is valid phone number. If string is not valid
	 * phone number an IllegalArgumentExceptions is thrown
	 * @param phoneNumber	phone number as a string
	 * @throws IllegalArgumentException		with custom message
	 */
	private boolean phoneNumberValidation(String phoneNumber) throws IllegalArgumentException {
		String wrongLengt9OrLess = "^[0-9]{0,9}$";	// Pattern to match 9 or less digits
		String wrongLengt12rMore = "^[0-9]{12,}$";	// Pattern to match 12 or море digits
		String numberIs11DigitsAndStartsWith1 = "^[^1][0-9]{10}$";	// Pattern to match 11 digits only if first digit is 1
		String illegalCharacter =  "^[1]?\\D?\\s{0,}(\\d{3})\\D?\\D?\\s{0,}(\\d{3})\\D?\\s{0,}(\\d{4})\\s{0,}$";	// Pattern to match only digits, spaces, parantheses, hyphens and dots
		
		// Create pattern objects for each pattern
		Pattern wrongLengt9OrLessPattern = Pattern.compile(wrongLengt9OrLess);
		Pattern wrongLengt12rMorePattern = Pattern.compile(wrongLengt12rMore);
		Pattern numberIs11DigitsAndStartsWith1Pattern =  Pattern.compile(numberIs11DigitsAndStartsWith1);
		Pattern illegalCharacterPattern = Pattern.compile(illegalCharacter);
		
		// Create matcher objects for each pattern object and match them to the phone number
		Matcher wrongLengt9OrLessMatcher = wrongLengt9OrLessPattern.matcher(phoneNumber);
		Matcher wrongLengt12rMoreMatcher = wrongLengt12rMorePattern.matcher(phoneNumber);
		Matcher numberIs11DigitsAndStartsWith1Matcher = numberIs11DigitsAndStartsWith1Pattern.matcher(phoneNumber);
		Matcher illegalCharacterMatcher = illegalCharacterPattern.matcher(phoneNumber);
		
		
		
		if (numberIs11DigitsAndStartsWith1Matcher.find()) {	// Check if the phone number has 11 digits, if the 1st digit is 1
			throw new IllegalArgumentException("Can only have 11 digits if number starts with '1'");
		}
		else if (wrongLengt9OrLessMatcher.find() || wrongLengt12rMoreMatcher.find()) {		// Check if phone number has 10 or 11 digits
			throw new IllegalArgumentException("Number must be 10 or 11 digits");
		}
		else if (!illegalCharacterMatcher.find()) {	// Check if only digits, spaces, parentheses, hyphens or dots exist in the phone number string. NO other chars are allowed.
			throw new IllegalArgumentException("Illegal character in phone number. Only digits, spaces, parentheses, hyphens or dots accepted.");
		}
		
		// If no exceptions are thrown this means that the number is valid
		return true;
	}
	
	/**
	 * Extract numbers from a String
	 * @param str	String that contains number
	 * @return String	new string that contains only the numbers
	 */
	private String extractDigitsFromString(String str) {
		StringBuilder sb = new StringBuilder();
		
		// Iterate thought the string and check if each character is number and concatenate to a new string
		for (int i = 0; i < str.length();i++) {
			if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
				sb.append(str.charAt(i));
			}
		}
		
		// If the output number is of lenght 11 and 1st digit is 1(char 49) remove it
		if (sb.length() == 11 && sb.charAt(0) == 49) {
			return sb.substring(1);
		}
		return sb.toString();
	}
}













