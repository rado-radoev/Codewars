import java.util.ArrayList;
import java.util.regex.*;

public class LuhnValidator {

	public static boolean isValid(String code) {
		Pattern pattern = Pattern.compile("((?:(?:\\d{4}[- ]){3}\\d{4}|\\d{16}))(?![\\d])");
		Matcher matcher = pattern.matcher(code);
		ArrayList<Integer> singleDigits = new ArrayList<Integer>();
				
		if (!matcher.matches()) {
			return false;
		}
		else {
			singleDigits = convertStringToInts(code);
			int tempInt;
			int sum = 0;
			for (int i = 0; i < singleDigits.size(); i++) {
				if (i % 2 == 0) {
					tempInt = singleDigits.get(i) << 1;
					if (tempInt > 9) {
						tempInt -= 9;
					}
					singleDigits.set(i, tempInt);
				}
				sum =+ singleDigits.get(i);
			}
			System.out.println(sum);
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
		
		
		// regex life saver
		
		String code = "4539 1488 0343 6467";

		System.out.println(isValid(code));


	}

}
