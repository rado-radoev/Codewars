import java.util.Scanner;

public class Solution {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int length = scan.nextInt();
		
		Integer[] arr = new Integer[length];

		scan.nextLine();
		
		 String s = scan.nextLine();
		 String[] splitted = s.split(" ");
		 
		 //System.out.println(Arrays.toString(splitted));
		 
		 for (int i = splitted.length - 1; i >= 0; i--) {
			 arr[i] = Integer.valueOf(splitted[i]);
			 System.out.print(arr[i] + " ");
		 }
		 
		 
	}

}
