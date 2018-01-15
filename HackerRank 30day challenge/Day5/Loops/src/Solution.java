import java.util.Scanner;

public class Solution {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result = 0;
        
        for (int i = 1; i <= 10; i++) {
        		result = i * n;
        		System.out.printf("%d x %d = %d%n", n, i, result);
        }
    }
}
