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
		
		StringBuilder sb = new StringBuilder(s);
		
		for (int i = 0; i < s.length(); i++) {

			
			
			if (Character.isLetter((sb.charAt(i)))) {
				int charShift = sb.charAt(i) + n;
				String shiftedChar = Integer.toString(charShift);
				sb.replace(i, i, shiftedChar);
			}
			else if (Character.isDigit(sb.charAt(i))) {
				char str = sb.charAt(i);
				System.out.println(str);
			}
		
		}

		return sb.toString();
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		playPass("I LOVE 123!!!", 1);
	}
	
	

}
