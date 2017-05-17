import java.util.Collections;

//http://exercism.io/exercises/java/diamond/readme
// asci char map: http://www.asciitable.com/

public class Exercism_DiamondPrinter {

	public static void main(String[] args) {
		/*
		 * letter A = 65
		 * letter Z = 90
		 * max loop is max number of letters = 26
		 * 
		 * 
		 * 
		 * Get the number of letter supplied as argument
		 * subtract the number from 90, the result subtract from 26
		 * that will be the number of loops you have to make
		 * EXAMPLE: 
		 * 
		 * argument is C (67)
		 * subtract from Z (90)
		 * 90 - 67 = 23
		 * max letters (26) - 23 = 3 iterations
		 * 3 would be the highest point of the diamond 
		 * at index 1 print A = 65
		 * at index 2 print B = 66
		 * at index 3 print C = 67 (highest point)
		 * START LOOPING BACKWARDS
		 * at index 2 print B = 66
		 * at index 1 print A = 65 
		 *
		 * starting row 1 add the number of iterations as spaces before and after the letter
		 * 
		 * create a string made up of n copies of s
		 * String.join("", Collections.nCopies(n, s));
		 * 
		 * */
		
		char edge = 'E'; // 67
		int iterations = 26 - (90 - edge); // 26 - 23 = 3
		int width = 1 + (iterations * 2);
		
		for (int i = 0; i < iterations; i++) { // 0 1 2
			char toPrint = (char) (65 + i); // 65 66 67
			
			System.out.printf("\"%s%s%s\"%n", 
					repeatChar(' ', (iterations - i) -1),
					toPrint != 'A' ? toPrint + repeatChar(' ', i > 1 ? i + 1 : i) + toPrint : toPrint,
					repeatChar(' ', (iterations - i) -1));
		}
		
//		for (int i = iterations - 2; i >= 0; i--) {
//			char toPrint = (char) (65 + i);
//			System.out.printf("\"%s%s%s%s\"%n", 
//					String.join("", Collections.nCopies((iterations - i) - 1, " ")),
//					toPrint,
//					iterations > 0 ? String.join("", Collections.nCopies((iterations - i) - 1, " ")) : "",
//					String.join("", Collections.nCopies((iterations - i) - 1, " ")));
//		}

	}
	
	private static String repeatChar(char character, int repeat)  {
		String output = "";
		for (int i = 0; i < repeat; i++) {
			output += character;
		}
		
		return output;
	}

}
