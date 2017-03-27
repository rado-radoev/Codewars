//https://www.codewars.com/kata/multiples-of-3-and-5/train/java
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Multiples {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = input.nextInt();
		
		System.out.println(solution(num));

	}
	
	public static int solution(int number) {
		HashSet<Integer> numList = new HashSet<Integer>();
		
		for (int i = 1; i < number; i++) {
			if (i % 3 == 0 || i % 5 == 0 ) {
				numList.add(i);
			}
		}
		
		int sum = 0;
		Iterator<Integer> hashIterator = numList.iterator();
		while (hashIterator.hasNext()) {
			sum += hashIterator.next();
		}
		
		return sum;
	}

}
