// http://exercism.io/exercises/java/acronym/readme
// Help generate some jargon by writing a program that converts a long name like Portable Network Graphics to its acronym (PNG).
public class Acronym {
	
	public static String generate(String text) {
		StringBuilder acronym = new StringBuilder(); // Empty string to hold the acronym
		String[] words = text.split("\\W+"); // split the string at all non letter chars

		for (String s : words) { // for each splitted string
			if (s.matches("^[A-Z \\d\\W]+$")) { // If the string is all upper case
				acronym.append(s.substring(0, 1));	// Add the 1st letter to acronym 
			}
			else if (s.matches("^[a-z \\d\\W]+$")) { // if the next word is all lower case
				acronym.append(s.substring(0, 1)); // add the 1st letter to acronym
			}
			else { // If the word is not all uppercase and not all lowercase
				for (int letter = 0; letter < s.length();letter++) { // Check each letter
					char currentChar = s.charAt(letter); // Assign letter at index to variable
					if (Character.isUpperCase(currentChar)) { // If letter is uppercase
						acronym.append(currentChar); // Add it to the acronym
					}
				}
			}
		}
		return acronym.toString().toUpperCase();
	}
}
