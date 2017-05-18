import java.util.ArrayList;
import java.util.List;

//http://exercism.io/exercises/java/diamond/readme
// asci char map: http://www.asciitable.com/

public class DiamondPrinter {
	
	public static List<String> printToList (char edge) {
		List<String> output = new ArrayList<String>(); 	// empty list that will contain each row
		int iterations = 26 - (90 - edge); 				// subtract the char from 90(Z) and subtract from 26(total number of chars in the alphabet)
		int repeat = 1;									// helper variable that contains how many times to repeat the string between two characters
		
		// Start from the top. Letter A
		for (int i = 0; i < iterations; i++) {
			char letterToPrint = (char) (65 + i); 						// Start from Letter A and increment by 1. Adding 1 rolls over to the next letter - B, C etc.
			String rowHeadTail = repeatChar(' ', (iterations - 1) -i);	// string representing the repeated character before and after the printed letter
			
			output.add(String.format("%s%s%s", 
					rowHeadTail,		// return the X number of whitespace
					//if the letter != A return letter + repeated character, if character is > B, add 2 to repeat(only odd), if not use repeat (1). If the letter is A return the letter
					letterToPrint != 'A' ? (letterToPrint + repeatChar(' ', letterToPrint > 'B' ? repeat += 2 : repeat) + letterToPrint) : letterToPrint,
					rowHeadTail));		// return the X number of whitespace	 
		} // end of normal loop
		
		// start reverse loop 
		for (int i = iterations - 2; i >= 0; i--) {
			char letterToPrint = (char) (65 + i); 						// Start from Letter A and increment by 1. Adding 1 rolls over to the next letter - B, C etc.
			String rowHeadTail = repeatChar(' ', (iterations - 1) -i); // string representing the repeated character before and after the printed letter
			
			output.add(String.format("%s%s%s", 
					rowHeadTail,		// return the X number of whitespace
					//if the letter != A return letter + repeated character, if character is > A, subtract 2 to repeat(only odd), if not use repeat (1). If the letter is A return the letter
					letterToPrint != 'A' ? (letterToPrint + repeatChar(' ', letterToPrint > 'A' ? repeat -= 2 : repeat) + letterToPrint) : letterToPrint,
					rowHeadTail));		// return the X number of whitespace
		} // end of reverse loop
		
		// return the List with all the lines
		return output;
	}
	
	// Helper class to return a string representation of a character repeated X amount of times
	private static String repeatChar(char character, int repeat)  {
		String output = "";
		for (int i = 0; i < repeat; i++) {
			output += character;
		}
		
		return output;
	}
	
	public static void main (String[] args) {
		DiamondPrinter diamondPointer = new DiamondPrinter();
		
		List<String> str = diamondPointer.printToList('A');
		
		for (String s : str) 
			System.out.println(s);
	}

}
