//http://exercism.io/exercises/java/nth-prime/readme
public class PrimeCalculator {
	
	// Create a boolean array, set to false by default.
	// that array will contain all prime numbers to the square root of INTEGER MAX VALUE
	private static boolean[] arr = new boolean[(int)Math.sqrt(Integer.MAX_VALUE) + 1];

	public static void main(String[] args) {
		// Use the sieve algorithm
		// Add counter
		// every time a prime has been found
		// increment counter
		// when the counter == the nTh number 
		// return the prime
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println("Square root of Integer.MAX_VALUE = " + (int)Math.sqrt(Integer.MAX_VALUE));

	}
	
	private static void findAllPrimes() {
		int nSqrt = (int)Math.sqrt(Integer.MAX_VALUE);
		
		for (int i = 2; i <= nSqrt; i++) {
			if (!arr[i]) {
				
			}
		}
	}
	
	public static int findNprime (int nthPrime) {
		// this method to look up the nth (index in the array containing all primes)
		return 0;
	}

}
