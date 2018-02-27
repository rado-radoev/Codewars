import java.util.Scanner;

/*
 * FindPrimes.java
 */

/**
 *
 * @author Radoslav Radoev
 */
public class Solution {
       
    public static void main(String[] args) {
    
    		Scanner in = new Scanner(System.in);
    		int numbers = in.nextInt();
    	
        for (int i = 0; i < numbers;i++) {
        		if (isPrime(in.nextInt())) {
	        		System.out.println("Prime"); // print only prime numbers
	        	} else {
	        		System.out.println("Not prime"); // print only prime numbers
	        	}
        }
    }
    
    public static boolean isPrime(int num) {
    	if (num < 2) {
			return false; // 1, 0 and negative numbers are not prime
    	}
    	
    	int numSqrt = (int)Math.sqrt((double)num);	// find the square root of the number
    	for (int i = 2; i <= numSqrt; i++) {
    		if (num % i == 0) {
    			return false;	// num is not prime
    		}
    	}
    	
    	return true;	// the number is prime
    }    
}
