//https://www.codewars.com/kata/duplicate-encoder/train/java
import java.util.HashMap;


public class DuplicateEncoder {

	public static String encode (String word) {
		HashMap<Character, Integer> charMap = new HashMap<Character, Integer>(word.length() + 100, word.length() * .25F);
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < word.length(); i++) {
			word = word.toLowerCase();
			int value = 1;
			char c =  word.charAt(i);
			if (charMap.containsKey(c)) {
				value = charMap.get(c);
				charMap.put(c, ++value);
			}
			else {
				charMap.put(c, value);
			}
		}
		
		for (int j = 0; j < word.length(); j++) {
			char c = word.charAt(j);
			int value = charMap.get(c);
			if (value > 1 ) {
				sb.append(")");
			}
			else {
				sb.append("(");
			}
		}
		
		return sb.toString();
	}
}
