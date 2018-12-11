package com.bob.protocol;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BobProtocol {
	
	private static final Map<String, String> ANSWERS = generateAnswers();
	private String message;
	
	public BobProtocol() { }

	public BobProtocol(String message) {
		this.message = message;
	}
	

	private static Map<String, String> generateAnswers() {
		Map<String, String> answers = new HashMap<String, String>();
		
		for (PREDEFINDEDANSWERS answer : PREDEFINDEDANSWERS.values()) {
			answers.put(answer.name().toLowerCase(), answer.quesiton);
		}
	
		return answers;
	}
	
	
	public String hey(String message) {
		return checkMessageMeaning(message);
	}

	private String checkMessageMeaning(String message) {
		
		// Bob's default answer will be Whatever. 
		// This answer will be outputted if nothing else applies
		String bobsAnswer = ANSWERS.get("other");
		
		// Trim spaces from string
		String new_message = message.trim();
		
		// Check if String is all upper case and last char is question mark
		if (isAddressUpper(new_message) && 
				isLastCharQuestionMark(new_message)) {
			bobsAnswer = ANSWERS.get("yell_question");
		}
		else if (isAddressUpper(new_message)) {
			bobsAnswer = ANSWERS.get("yell");
		}
		else if (isLastCharQuestionMark(new_message)) {
			bobsAnswer = ANSWERS.get("question");
		}
		else if (isAddressEmpty(new_message)) {
			bobsAnswer = ANSWERS.get("empty");
		}
		else if (new_message.toLowerCase().startsWith("bye")) {
			bobsAnswer = ANSWERS.get("bye");
		}
		
		return bobsAnswer;

	}
	
	
	private Boolean isAddressUpper(String message) {
		
		boolean hasAtLeastOneChar = false;
		boolean isAllUpperCase = true;
		
		for (char c : message.toCharArray()) {
			if (!Character.isAlphabetic(c)) continue;
			if (Character.isLetter(c)) hasAtLeastOneChar = true;
			if (Character.isLowerCase(c)) isAllUpperCase = false;;
		}
		return hasAtLeastOneChar && isAllUpperCase;
	}
	
	private Boolean isLastCharQuestionMark(String message) {
		if (message.length() > 0)
			return message.charAt(message.length() - 1) == '?';
		
		return false;
	}
	
	private Boolean isAddressEmpty(String messge) {
		boolean isEmpty = false;
		String pattern = "\\s[^\\w\\?]";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(messge);
		
		
		if (messge.equals("") || m.find()) { 
			isEmpty = true; 
		}
		
		return isEmpty;
	}


}
