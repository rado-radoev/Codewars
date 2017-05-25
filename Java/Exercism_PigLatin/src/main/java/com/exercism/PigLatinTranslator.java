//http://exercism.io/exercises/java/pig-latin/readme
package com.exercism;
import java.util.HashSet;

public class PigLatinTranslator {
	
	HashSet<String> vowels = new HashSet<String>();
	HashSet<String> specialConsonants = new HashSet<String>();
	HashSet<String> specialVowels = new HashSet<String>();
	HashSet<String> verySpecialConsonants = new HashSet<String>();
	
	private void populateVowels() {
		vowels.add("a");
		vowels.add("e");
		vowels.add("i");
		vowels.add("o");
		vowels.add("u");
	}
	
	private void populateSpecialConsonants() {
		specialConsonants.add("ch");
		specialConsonants.add("qu");
		specialConsonants.add("th");
	}

	private void populateSpecialVowels() {
		specialVowels.add("yt");
		specialVowels.add("xr");
	}
	
	
	private void populateVerySpecialConsonants() {
		verySpecialConsonants.add("thr");
		verySpecialConsonants.add("sch");
	}
	
	
	private String convertStringArrayToStringWithSpaces(String[] arr) {
		String s = "";
		for (int i = 0; i < arr.length; i++) {
			s += arr[i] + " ";
		}
		
		return s.trim();
	}
	
	public String translate(String text) {
		populateVowels();
		populateSpecialConsonants();
		populateSpecialVowels();
		populateVerySpecialConsonants();
		
		String[] array = text.split(" ");
		
		for (int i = 0; i < array.length; i++) {
			String word = array[i];		// assign current array inde to a variable for easier reference
			if (vowels.contains(word.substring(0, 1))) {	// check only very fist char
				word += "ay";
			}
			else if (specialVowels.contains(word.substring(0,2))) {	// check first two chars
				word += "ay";	
			}
			else if (verySpecialConsonants.contains(word.substring(0,3)) || word.startsWith("squ", 0))	{	// check special case consonant + qu or three letter consonant
				String temp = word.substring(3, word.length()) + word.substring(0,3) + "ay";
				word = temp;
			}
			else if (specialConsonants.contains(word.substring(0,2))) { // check first two chars for special consonants
				String temp = word.substring(2, word.length()) + word.substring(0,2) + "ay";
				word = temp;
			}
			else {	// every other case, when beginning with consonant
				word = word.substring(1, word.length()) + word.substring(0,1) + "ay";
			}
			
			array[i] = word;	// reassign the modified word variable to the array index
		}
		
		return convertStringArrayToStringWithSpaces(array);
	}
}
