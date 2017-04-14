///https://www.codewars.com/kata/your-order-please
import java.util.TreeMap;
import java.util.Iterator;

public class Order {

	public static void main(String[] args) {
		System.out.println(order("is2 Thi1s T4est 3a"));

	}
	
	// Get the string
	// split the string to array of strings, separeate by space
	// for each string in the array 
	// loop through every single char
	// if char is in range (find the digit range) or use regular expression
	// Add this character to a Treemap - key - more here: http://beginnersbook.com/2014/06/how-to-sort-hashtable-in-java/
	// add the string to the key as a value
	
	// Iterate through TreeMap and output each value (string)
	// 
	
	public static String order(String words) {
		String[] splitted = words.split(" ");
		StringBuilder output = new StringBuilder();
		TreeMap<Integer, String> myMap = new TreeMap<Integer, String>();
		
		for (String word : splitted) {
			for (int i = 0; i < word.length(); i++) {
				int charInt = word.charAt(i);
				
				if (charInt >= 48 && charInt <= 57) {
					int key = Character.getNumericValue(charInt);
					myMap.put(key, word);
					break;
				}			
			}
		}
		
		Iterator<Integer> keySetIterator = myMap.keySet().iterator();
		while (keySetIterator.hasNext()) {
			int key = keySetIterator.next();
			output.append(myMap.get(key) + " ");
		}

		return output.toString().trim();
	}

}
 