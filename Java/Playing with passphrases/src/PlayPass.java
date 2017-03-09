// https://www.codewars.com/kata/playing-with-passphrases/train/java

/**
  	shift each letter by a given number but the transformed letter must be a letter (circular shift),
	replace each digit by its complement to 9,
	keep such as non alphabetic and non digit characters,
	downcase each letter in odd position, upcase each letter in even position (the first character is in position 0),
	reverse the whole result.
 	@author regradra
 	
 	Resources: 
 	
 	ASCII table
 	http://sticksandstones.kstrom.com/appen.html
 	
 	Char to int
 	http://stackoverflow.com/questions/16458564/convert-character-to-ascii-numeric-value-in-java
 	
	Complements:
	https://www.electrical4u.com/9s-complement-and-10s-complement/

 */
public class PlayPass {

	public static String playPass(String s, int n) {
		// convert stirng s to upperCase
		// convert the string s to charArray
		// each letter (if it is a letter) convert to int 				char character = 'a';  int ascii = (int) character;
		// shift letter (add n) to int
		// cannot be lower then 65(A) and higher than 90(Z)
		// if char is and int
		// caluclate with formula (10N - 1) where N is the number of digits - basically subtract 9 from every digit and change the sign to positive
		// if character is not letter or digit leave it be
		// for each odd letter number = char.toLower
		// go through the array in reverse order and return
		
//		
//		char[] charArray = s.toUpperCase()
//							.toCharArray();
//		
//		for (int i = 0; i < charArray.length; i++) {
//			if (Character.isLetter(charArray[i])) {
//				int currentChar = charArray[i] + n;
//				
//				while (!Character.isLetter()) {
//					currentChar += n;
//				}
//				
//				charArray[i] = (char)currentChar;
//				
//				if (i % 2 == 1) {
//					charArray[i] = Character.toLowerCase(charArray[i]);
//				}
//			}
//			else if (Character.isDigit(charArray[i])) {
//				int currentDigit = Character.getNumericValue(charArray[i]);
//				int complement = Math.abs(currentDigit - 9);
//				charArray[i] = (char)(complement + '0');
//			}
//		}
//		
//		
//		char[] newCharArray = new char[charArray.length];
//		for (int i = charArray.length - 1; i >= 0; i--) {
//			newCharArray[i] = charArray[charArray.length - 1 - i];
//		}
//		
//		String str = new String().valueOf(newCharArray);
//		return str;

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetter(c)) {
                if (i % 2 == 0) {
                    c = String.valueOf(c).toUpperCase().charAt(0);
                    if (c + n > 90) c += n - 26;
                    else c += n;
                }
                else {
                    c = String.valueOf(c).toLowerCase().charAt(0);
                    if (c + n > 122) c += n - 26;
                    else c += n;
                }
                result.append(c);
            }
            else if (Character.isDigit(c)) result.append(9 - Integer.parseInt(String.valueOf(c)));
            else result.append(c);
        }
        return result.reverse().toString();
    }


	
	public static void main(String[] args) {
		System.out.print(playPass("MY GRANMA CAME FROM NY ON THE 23RD OF APRIL 2015", 2));		
	}
}
 