
public class LargestSeriesProductCalculator {

	private String str;
	private int[] numArray;
	
	public LargestSeriesProductCalculator(String str) {
		this.str = str;
		this.numArray = convertStrToIntArray(str);
	}
	
	private int[] convertStrToIntArray(String str) {
		int[] numArray = new int[str.length()];
		for (int i = 0; i < str.length(); i++) {
			numArray[i] = str.charAt(i) - 48;
		}
		return numArray;
	}
	
	public int calculateLargestProductForSeriesLength(int n) {
		int maxSum = Integer.MIN_VALUE;
		for (int i = 0; i < numArray.length;i++) {
			int sum = 1;
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
