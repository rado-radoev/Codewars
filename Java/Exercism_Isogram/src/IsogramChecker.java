//http://exercism.io/exercises/java/isogram/readme
import java.util.HashSet;

public class IsogramChecker {

	public boolean isIsogram(String text) {
		HashSet<Character> stringMap = new HashSet<Character>();
		text = text.toLowerCase();
		
				
		for (int i = 0; i < text.length(); i++) {
			char currentChar = text.charAt(i);
			if (Character.isLetter(currentChar)) {
				if (stringMap.contains(currentChar)) {
					return false;
				}
				else {
					stringMap.add(currentChar);
				}				
			}
		}
		
		return true;
	}
}
