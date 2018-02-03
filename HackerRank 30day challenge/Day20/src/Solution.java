import java.io.*;
import java.util.*;

class Calculator implements AdvancedArithmetic {

	private int divisor;
	
	@Override
	public int divisorSum(int n) {
		
		divisor = n - 1; 
		int sum = 0;
		
		
		while (divisor >= 1) {
			if (n % divisor == 0) 
				sum += divisor;
			
			divisor--;
		}
		
		return sum;
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
