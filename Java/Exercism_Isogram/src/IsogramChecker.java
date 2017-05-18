//http://exercism.io/exercises/java/isogram/readme
import java.util.HashSet;

public class IsogramChecker {

	public boolean isIsogram(String text) {
		HashSet<Character> stringMap = new HashSet<Character>();
		text = text.toLowerCase();
		
				
		for (int i = 0; i < text.length(); i++) {
			char currentChar = text.charAt(i);
			if ((currentChar >= 65 && currentChar <= 90) || (currentChar >= 97 && currentChar <= 122)) {
				if (stringMap.contains(currentChar)) {
					return false;
				}
				else {
					stringMap.add(currentChar);
				}				
			}
			else {
				return false;
			}
		}
		
		return true;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
