import java.util.ArrayList;

// http://exercism.io/exercises/java/sieve/readme

public class Sieve {
	
	private int maxNumber;
	private boolean[] arr;
	
	public Sieve(int maxNumber) throws IndexOutOfBoundsException {
		// Check if passed number is postive
		if (maxNumber <= 0) {
			throw new IndexOutOfBoundsException("Only positive number can be prime");
		}
		
		this.maxNumber = maxNumber;
		this.arr = new boolean[maxNumber + 1];	// Create boolean array of length maxNumber. We want our array to start always from 2. 0 and 1 are not primes
		// Create the array 
		setArrayToTrue();
	}
	
	// Setting array to true, means that all the numbers are unchecked by default
	private final void setArrayToTrue() {
		for (int i = 2; i < arr.length; i++) {
			arr[i] = true;
		}
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
		for (int i = 2; i <= nSqrt; i++) {
			if (arr[i]) {
				for (int j = i + i; j <= maxNumber; j += i) {
					if (arr[j])
						arr[j] = false;
				}
			}
		}
	
		// ArrayList to hold all primes
		ArrayList<Integer> primes = new ArrayList<Integer>();
		
		// loop the array one more time and assign all indexes of true value
		// to arraylist and output. This list contains all the primes.
		for (int k = 2; k < arr.length; k++) {
			if (arr[k])
				primes.add(k);
		}
		
		// output array list with all primes
		return primes;
	}
}






























