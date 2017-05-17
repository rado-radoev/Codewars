//http://exercism.io/exercises/java/nth-prime/readme
public class PrimeCalculator {
	
	// Create an array of primes that will hold up to 20 000 primes
	private static int[] primes = new int[20000];
	
	// default constructor that runs the findAllPrimes method when class is called
	public PrimeCalculator() {
//		long before = System.currentTimeMillis();
		findAllPrimes();
//		long after = System.currentTimeMillis();
//		System.out.println("findAllPrimes Elapsed time: " + Long.toString(after - before) + " milliseconds");
	}
	
	private final static void findAllPrimes() {
		
		// array to hold up to 200 000 booleans
		// we don't need that array outside of the method, so we'll let the garbage collector
		// remove it once the method is closed
		boolean[] arr = new boolean[200000];
	
		// set all values in the array to true
		// this takes time, but will not take memory if we had put the array in the class as an instance
//		long before = System.currentTimeMillis();
		zeroOutBooleanArray(arr);
//		long after = System.currentTimeMillis();
//		System.out.println("zeroOutBooleanArray Elapsed time: " + Long.toString(after - before) + " milliseconds");		
		
		// variable to set the array index to add the prime number to
		// index 0 should not be used. start from index 1
		int arrayIndex=1;
		
		// loop until the array length is reached
		for (int i = 2; i < arr.length; i++) {
			if (arr[i]) {	// If the index is prime go through all multiples and make their values false (they are not primes)		
				primes[arrayIndex++] = i;	// if true add the index to the primes array (that is a prime number)
				for (int j = 2; i * j < arr.length; j++) {
					arr[i*j] = false;	// make all the multiples of i - false
				}
			}
		}
	}
	
	// used to set a boolean array to all true	
	private static boolean[] zeroOutBooleanArray (boolean[] array) {
		
		for (int i = 0; i < array.length; i++) {
			array[i] = true;
		}
		return array;
	}

	
	// main method
	// looks up the primes array and returns the number at the specified index
	// the nthPrime should be the the element at nth index in the primes array
	public static int nth (int nthPrime) throws IllegalArgumentException {
		if (nthPrime == 0) {
			throw new IllegalArgumentException();
		}
		return primes[nthPrime];
	}
}
