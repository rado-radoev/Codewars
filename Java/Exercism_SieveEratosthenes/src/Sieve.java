import java.util.ArrayList;

// http://exercism.io/exercises/java/sieve/readme

public class Sieve {
	
	private int maxNumber;
	private boolean[] arr;
	
	public Sieve(int maxNumber) throws IndexOutOfBoundsException {
		// Check if passed number is positive
		if (maxNumber <= 0) {
			throw new IndexOutOfBoundsException("Only positive number can be prime");
		}
		
		this.maxNumber = maxNumber;
		this.arr = new boolean[maxNumber + 1];	// Create boolean array of length maxNumber. We want our array to start always from 2. 0 and 1 are not primes
	}
	
	// iterate through the array and set to false any numbers that are not prime.
	public ArrayList<Integer> getPrimes() {
		
		// Find the sqrt of the maxNumber. That would be the last number to check. 
		// Everything past that number is prime
		int nSqrt = (int)Math.sqrt(maxNumber);
		
		// Go through the array starting from 2(first prime)
		// eliminate every multiple to 2 and hop on the next int
		// until the sqrt of maxNumbers is reached. Everything past that number
		// is prime.
		// By default all elements are set to false. If the element is NOT prime, it is marked with true.
		for (int i = 2; i <= nSqrt; i++) {
			if (!arr[i]) {
				for (int j = i + i; j <= maxNumber; j += i) {
					if (!arr[j])
						arr[j] = true;
				}
			}
		}
	
		// ArrayList to hold all primes
		ArrayList<Integer> primes = new ArrayList<Integer>();
		
		// loop the array one more time and assign all indexes of false value (primes)
		// to arraylist and output. This list contains all the primes.
		for (int k = 2; k < arr.length; k++) {
			if (!arr[k])
				primes.add(k);
		}
		
		// output array list with all primes
		return primes;
	}
}






























