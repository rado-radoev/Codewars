//http://exercism.io/exercises/java/pig-latin/readme
package com.exercism;
import java.util.HashSet;

public class PigLatinTranslator {
	
	HashSet<String> vowels = new HashSet<String>();
	
	private void populateVowels() {
		vowels.add("a");
		vowels.add("e");
		vowels.add("i");
		vowels.add("o");
		vowels.add("u");
	}
	
	public String translate(String text) {
		return null;
	}
}
