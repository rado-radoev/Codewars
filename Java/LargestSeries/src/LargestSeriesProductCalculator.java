
/**
 * @author superlamer
 *
 */
public class LargestSeriesProductCalculator {

	private String str;
	private long[] numArray;
	
	/**
	 * LargestSeriesProductCalculator constructor
	 * @param str	String to evaluate
	 * @throws IllegalArgumentException 	String should not be empty and should only contain numbers
	 */
	public LargestSeriesProductCalculator(String str) throws IllegalArgumentException {
		setStr(str);
		this.numArray = convertStrToIntArray(str);
	}
	
	
	/**
	 * String setter
	 * @param str 	String to evaluate
	 * @throws IllegalArgumentException	String should not be null
	 */
	private void setStr(String str) throws IllegalArgumentException {
		if (str == null) {
			throw new IllegalArgumentException("String to search must be non-null.");
		}
		this.str = str;
	}
	
	
	/**
	 * convertStrToIntArray helper method. Converts string to Integer array
	 * @param str	String to convert
	 * @return		Integer array
	 */
	private long[] convertStrToIntArray(String str) {
		long[] numArray = new long[str.length()];
		for (int i = 0; i < str.length(); i++) {
			if (!Character.isDigit(str.charAt(i))) {
				throw new IllegalArgumentException("String to search may only contains digits.");
			}
			numArray[i] = str.charAt(i) - 48;
		}
		return numArray;
	}
	
	/**
	 * calculateLargestProductForSeriesLength	Calculates the largest product for a contiguous substring of digits of length n
	 * @param n		Number of digits to evaluate
	 * @return	the largest product for a contiguous substring of digits of length n
	 * @throws IllegalArgumentException		If n is bigger than the string length. If n is 0 or lower.
	 */
	public long calculateLargestProductForSeriesLength(long n) throws IllegalArgumentException {
		
		if (n == 0) {
			return 1;
		}
		
		if (n > str.length()) {
			throw new IllegalArgumentException("Series length must be less than or equal to the length of the string to search.");
		}
		else if (n < 0) {
			throw new IllegalArgumentException("Series length must be non-negative.");
		}
		
		
		long maxSum = Integer.MIN_VALUE;				// Get an absolute min value
		for (int i = 0; i < numArray.length;i++) {		// Loop throught the array
			long sum = 1;								// Dummy variable to be recalculated for every n group of numbers
			if (i > numArray.length - n) {				// Break out of the loop if the current index + n group of numbers will exceed the array lenght
				break;
			}
			
			for (int j = 0; j < n; j++) {				// Loop n number of digits
				sum *= numArray[i + j];					// Add the digit at the current index to sum
			}
			
			if (sum > maxSum) {							// If the calculated sum is bigger than maxSum
				maxSum = sum;							// reassign maxSum to be equal to the sum
			}
		}
		return maxSum;									// return maxSum
	}

}
