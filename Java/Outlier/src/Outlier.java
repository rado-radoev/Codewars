//https://www.codewars.com/trainer/java
public class Outlier {
	
	public static int find(int[] integers) {
		int evenNumbers = 0;
		int oddNumbers = 0;
		int lastEvenNumber = 0;
		int lastOddNumber = 0;
		
		for (int i = 0; i < integers.length; i++) {
			if (integers[i] % 2 == 0) {
				evenNumbers++;
				lastEvenNumber = integers[i];
			}
			else {
				oddNumbers++;
				lastOddNumber = integers[i];
			}
		}
		
		
		if (evenNumbers > oddNumbers) {
			return lastOddNumber;
		}
		else {
			return lastEvenNumber;
		}
  }
}
