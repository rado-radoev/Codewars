import java.io.*;
import java.util.*;

class Calculator implements AdvancedArithmetic {

	private int divisor;
	
	
	public int divisorSum1(int n) {
		
		divisor = n; 
		int sum = 0;
		
		
		while (divisor >= 1) {
			if (n % divisor == 0) 
				sum += divisor;
			
			divisor--;
		}
		
		return sum;
	}


	
	
	
	@Override
	public int divisorSum(int n) {

		return divisorSum(n, n, 0);
	}
	
	private int divisorSum(int n, int divisor, int sum) {
		if (divisor < 1) return sum;

		sum += (n % divisor == 0) ? divisor: 0;
		divisor--;
		
		return divisorSum(n, divisor, sum);
		
	}
	
}


class Solution {
	
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        
      	AdvancedArithmetic myCalculator = new Calculator(); 
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}
