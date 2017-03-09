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

	 convert stirng s to upperCase
	 convert the string s to charArray
	 each letter (if it is a letter) convert to int 				char character = 'a';  int ascii = (int) character;
	 shift letter (add n) to int
	 cannot be lower then 65(A) and higher than 90(Z)
	 if char is and int
	 caluclate with formula (10N - 1) where N is the number of digits - basically subtract 9 from every digit and change the sign to positive
	 if character is not letter or digit leave it be
	 for each odd letter number = char.toLower
	 go through the array in reverse order and return
 */
public class PlayPass {
	public static String playPass(String s, int n) {
		char[] charArray = s.toUpperCase()
							.toCharArray();
		
		for (int i = 0; i < charArray.length; i++) {
			char c = charArray[i];
			if (Character.isLetter(c)) {			// Check if character is letter
				if (i % 2 == 0) {					// Check if character is even position
					if (c + n > 90) {				// If the character ASCII code is above 90 (Z) go back to 64 (A)
						c += n - 26;
					}
					else {
						c += n;						// Else add n to the character
					}
				}
				else {								// If the character is on odd position 
					c = Character.toLowerCase(c);	// Replace the character with a lower case character
					if (c + n > 122) {				
						c += n - 26;				// Again check if character would go over 122 (z) and go back to (97) a
					}
					else {
						c += n;						// Else just add n to char
					}
				}
				charArray[i] = c;					// Finally reassign character at the charArray position
			}
			else if (Character.isDigit(c)) {		// Check if character is digit
				int currentDigit = Character.getNumericValue(c);	// Convert char to int
				int complement = Math.abs(currentDigit - 9);		// Calculate the complement (by subtracting 9 from the char) and because it is
																	// negative value convert it to positive using Math.abs();
				charArray[i] = (char)(complement + '0');			// Assign the calculated complement to the charArray position
			}
		}
		
		char[] newCharArray = new char[charArray.length]; // Create new array to hodl the reversed string
		for (int i = charArray.length - 1; i >= 0; i--) {	
			newCharArray[i] = charArray[charArray.length - 1 - i];	// Assign the char at last index in charArray to 1st position of newCharArray
		}
		
		String str = new String().valueOf(newCharArray);	// Create new string containing the char array
		return str;											// return
	}

	
	public static void main(String[] args) {
		System.out.print(playPass("MY GRANMA CAME FROM NY ON THE 23RD OF APRIL 2015", 2));		
	}
}
 