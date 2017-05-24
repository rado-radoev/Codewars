//http://exercism.io/exercises/java/pig-latin/readme
package com.exercism;
import java.util.HashSet;

public class PigLatinTranslator {
	
	HashSet<String> vowels = new HashSet<String>();
	HashSet<String> specialConsonants = new HashSet<String>();
	
	private void populateVowels() {
		vowels.add("a");
		vowels.add("e");
		vowels.add("i");
		vowels.add("o");
		vowels.add("u");
		vowels.add("yt");
		vowels.add("xt");
	}
	
	private void populateSpecialConsonants() {
		specialConsonants.add("ch");
		specialConsonants.add("qu");
		specialConsonants.add("th");
		specialConsonants.add("thr");
		specialConsonants.add("sch");
	}
	
	public String translate(String text) {
		
	}
}
