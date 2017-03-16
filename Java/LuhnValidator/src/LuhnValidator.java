import java.util.ArrayList;
import java.util.regex.*;

public class LuhnValidator {

	public static boolean isValid(String code) {
		Pattern pattern = Pattern.compile("[^0-9\\s]"); // pattern that matches any
		code = code.trim();
		Matcher matcher = pattern.matcher(code);
		ArrayList<Integer> singleDigits = new ArrayList<Integer>();
		int sum = 0;
		
		if (matcher.find()) {
			return false;
		}
		else {
			singleDigits = convertStringToInts(code);
			int tempInt;
			
			if (singleDigits.size() <= 1) {
				return false;
			}
			
			for (int i = 0; i < singleDigits.size(); i++) {
				if ((i + 1) % 2 == 0) {
					tempInt = singleDigits.get(i) << 1;
					if (tempInt > 9) {
						tempInt -= 9;
					}
					singleDigits.set(i, tempInt);
				}
				sum += singleDigits.get(i);
			}
		}
		if (sum % 10 == 0 || 
				!(sum >= 22 && sum <= 55) && !(sum >= 33 && sum <= 66) && !(sum >= 44 && sum <= 77)) {
			
			return true; // number is valid
		}
		else {
			return false; // number is not valid
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
		
		String code = "8273 1232 7352 0569";

		System.out.print(isValid(code));


	}

}
