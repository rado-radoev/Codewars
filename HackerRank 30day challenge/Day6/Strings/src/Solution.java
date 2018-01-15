import java.util.Scanner;
import java.lang.StringBuffer;

public class Solution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
				
		while (scan.hasNext()) {
			input = scan.next();	
			StringBuffer even = new StringBuffer();
			StringBuffer odd = new StringBuffer();
			
			for (int i = 0; i < input.length(); i++) {
				if (i % 2 == 0) {
					even.append(input.charAt(i));
				} else {
					odd.append(input.charAt(i));
				}
			}
			
			System.out.printf("%s %s%n", even.toString(), odd.toString());
		}
		
		scan.close(); 
		
	}
	
}
