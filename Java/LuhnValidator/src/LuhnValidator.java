import java.util.ArrayList;
import java.util.regex.*;

public class LuhnValidator {

	public static boolean isValid(String code) {
		Pattern pattern = Pattern.compile("\\d+\\s");
		Matcher matcher = pattern.matcher(code);
		ArrayList<Integer> singleDigits = new ArrayList<Integer>();
		
		if (!matcher.matches()) {
			return false;
		}
		else {
			singleDigits = convertStringToInts(code);
			int tempInt;
			for (int i = 0; i < singleDigits.size(); i++) {
				if (i % 2 == 0) {
					tempInt = singleDigits.get(i) << 1;
					if (tempInt > 9) {
						tempInt -= 9;
					}
					singleDigits.set(i, tempInt);
				}
			}
			
			
			return true;
		}
	}
	
	
	public static int[] integerToArray (int number) {
		int[] arr = new int[16];
		int i = 0;
		
		while (number != 0) {
			arr[i] = number % 10;
			number = number / 10;
			i++;
		}
		
		return arr;
	}
	
	public static long convertStringToInt(String str) {
		StringBuilder tempString = new StringBuilder();
		long tempNumber;
		Pattern p = Pattern.compile("\\d");
		Matcher m = p.matcher(str);
		
		while (m.find()) {
			tempString.append(m.group());
		}

		tempNumber = Long.parseLong(tempString.toString());
		return tempNumber;
	}
	
	public static ArrayList<Integer> convertStringToInts(String str) {
		str = str.trim();	// Trim unnecessary spaces
		char[] strToChar = str.toCharArray(); // Convert to char array
		ArrayList<Integer> digitChars = new ArrayList<Integer>(); // Array that will hold the digits
		int digit; // Empty var to be used later
		 
		for (Character c : strToChar) { // Iterate through every char
			if (Character.isDigit(c)) {	// If the char is digit
				digit = Character.getNumericValue(c); // Convert it to its numerical value
				digitChars.add(digit); // Add it to the array
			}
		}
		return digitChars; // return the digit array
	}
	
	public static void main(String[] args) {
		// regex to check string has only spaces \\d+\\s - if contains other chars and stuff. not valid return false
		// strip spaces
		// convert string to int
		// add to array digit by digit % 10 and / 10
		// every second(even) digit is multiplied can do bitwise operation <<1
		// if the result is greater than 9 subtract 9 from result and 
		// rewrite this digit
		// sum all the digits
		// if sum % 10 == 0
		// number is valid - return true;
		
		
		String code = "4539 14880";
		int num = 453914880;
		//System.out.println(num);

		int[] numbers = integerToArray(num);
		for (int i : numbers) {
			System.out.println(i);
		}

	}

}
