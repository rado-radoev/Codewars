
public class SumOfMultiples {
	
	public static int sum(int number1, int[] number2) {
		int sum = 0;
		boolean isMultiple = false;
		for (int i = 0; i < number1; i++) {
			isMultiple = false;
			for (int j = 0; j < number2.length; j++) {
				if (i % number2[j] == 0) 
					isMultiple = true;
			}
			if (isMultiple)
				sum += i;
		}

		return sum;
	}
	
	public static void main (String[] args) {
		int[] set = {
	            4,
	            6
	        };
		System.out.println(sum(15, set));
	}
}
