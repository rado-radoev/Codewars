
public class LargestSeriesProductCalculator {

	private String str;
	private long[] numArray;
	
	public LargestSeriesProductCalculator(String str) throws IllegalArgumentException {
		setStr(str);
		this.numArray = convertStrToIntArray(str);
	}
	
	
	
	public void setStr(String str) {
		if (str.length() == 0) {
			throw new IllegalArgumentException("Series length must be less than or equal to the length of the string to search.");
		}
		else if (str.isEmpty()) {
			throw new IllegalArgumentException("String to search must be non-null.");
		}
		
		this.str = str;
	}
	
	
	private long[] convertStrToIntArray(String str) {
		long[] numArray = new long[str.length()];
		for (int i = 0; i < str.length(); i++) {
			numArray[i] = str.charAt(i) - 48;
		}
		return numArray;
	}
	
	public long calculateLargestProductForSeriesLength(long n) throws IllegalArgumentException {
		
		if (n == 0) {
			
		}
		
		if (n > str.length()) {
			throw new IllegalArgumentException("Series length must be less than or equal to the length of the string to search.");
		}
		else if (n < 0) {
			throw new IllegalArgumentException("Series length must be non-negative.");
		}
		
		
		long maxSum = Integer.MIN_VALUE;
		for (int i = 0; i < numArray.length;i++) {
			long sum = 1;
			if (i > numArray.length - n) {
				break;
			}
			
			for (int j = 0; j < n; j++) {
				sum *= numArray[i + j];
			}
			
			if (sum > maxSum) {
				maxSum = sum;
			}
		}
		
		return maxSum;
	}
//	
//	public static void main(String[] args) {
//		String s = "0123456789";
//		LargestSeriesProductCalculator_1 largest = new LargestSeriesProductCalculator_1(s);
//		System.out.println(largest.calculateLargestProductForSeriesLength(3));
//		
//	}
	
}
