import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Solution {
	
	private static int numberOfSwaps;
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        
        sort(a);
        printArray(a);
    }
	
	private static void printArray(int[] a) {
        System.out.printf("Array is sorted in %d swaps.%n", numberOfSwaps);
        System.out.printf("First Element: %d%n", a[0]);
        System.out.printf("Last Element: %d%n", a[a.length - 1]);
	}
	
	private static void sort (int[] a) {
		for (int i = 0; i < a.length; i++ ) {
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] =  a[j + 1];
					a[j + 1] = temp;
					numberOfSwaps++;
				}
			}
		}

	}
	
	
}
