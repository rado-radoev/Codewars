package PostiveCountNegativeSum;

import java.util.Arrays;
/**
 * Given an array of integers.
	Return an array, where the first element is the count of positives numbers and the second element is sum of negative numbers.
	If the input array is empty or null, return an empty array:
	C#/Java: new int[] {} / new int[0];
	C++: std::vector<int>();
	ATTENTION!
	The passed array should NOT be changed. Read more here.
	For example:
	input int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15}
	return int[] {10, -65}.
*/
public class Kata {

	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15};
		int[] nullArray = null;
		int[] emptyArray = new int[0];
		countPositivesSumNegatives(emptyArray);
		
		//test(nullArray);
	}

	public static void test (int[] arr) {
		if (arr == null) {
			System.out.println("Null");
		} 
		else {
			System.out.println("NOT Null");
		}			
	}
	
	public static int[] countPositivesSumNegatives(int[] input)
    {
			if (input == null || input.length == 0 ) {
					int[] outputArray = {};
					return outputArray;
			}
			int postiveCount = 0;
			int negativeSum = 0;
			for (int n : input ) {
					if (n > 0) {
							postiveCount++;
					}
					else {
							negativeSum += n;
					}
			}
			int[] outputArray = {postiveCount, negativeSum};
			return outputArray; //return an array with count of positives and sum of negatives
    }

}
