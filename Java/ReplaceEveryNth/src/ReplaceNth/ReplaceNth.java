package ReplaceNth;

/**
 * Replace every nth
	Write a method, that replaces every nth char oldValue with char newValue.
	Method:
	replaceNth(String text, int n, char oldValue, char newValue)
	Example:
	n:         2
	oldValue: 'a'
	newValue: 'o'
	"Vader said: No, I am your father!" -> "Vader soid: No, I am your fother!"
	  1     2          3        4       -> 2nd and 4th occurence are replaced
	Your method has to be case sensitive!
	As you can see in the example: The first changed is the 2nd 'a'. So the start is always at the nth suitable char and not at the first!
	If n is 0 or negative or if it is larger than the count of the oldValue, return the original text without a change.
	The text and the chars will never be null.
 */

public class ReplaceNth {

	public static void main(String[] args) {
		String starWars = "Vader said: No, I am your father!";
		System.out.println(replaceNth(starWars, -2, 'a', 'o'));
	}

	public static String replaceNth(String text, int n, char oldValue, char newValue) {
		int occurance = 0;
		int oldValueCount = 0;
		char[] charArray = text.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == oldValue){
				if (occurance % n == 0) {
					charArray[i] = newValue;
				}
				occurance++;
				oldValueCount++;
			}
		}
		if (n <= 0 || n > oldValueCount) {
			return text;
		}
		else {
			String result = new String(charArray);
			return result;
		}
	}
}
/*
Get the String
Find occurance of oldValue
Assign an occurance value
If occurance % 3 == 0
Replace oldValue with newValue
OR CONVERT string to charArray OR use StringBuilder to build ne string
USE the charArray - BETTER!
*/
