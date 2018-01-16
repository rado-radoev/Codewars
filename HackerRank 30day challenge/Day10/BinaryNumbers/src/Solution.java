import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    		Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    
	    String result = "";
	    while (n > 0) {
	    		result += String.valueOf(n % 2);
	    		n /= 2;
	    }
	    
	    System.out.println(result);
	    
	    int max = 0;
	    int sum = 0;
	    int i = result.indexOf("1");
	        
	    for (; i < result.length() ;i++) {
	    		
	    		if (result.charAt(i) ==  '1') {
	    			sum++;
	    			if (sum > max) max = sum;
	    		}
	    		else {
	    			sum = 0;
	    		}
	    }
	    
	    System.out.println(max);
    }
}
