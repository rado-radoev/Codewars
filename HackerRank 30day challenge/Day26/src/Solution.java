import java.util.Comparator;
import java.util.Scanner;

public class Solution implements Comparator<Integer> {

	private static int hackos;
	
	public static void main(String[] args) {
		Solution s = new Solution();

		Scanner in = new Scanner(System.in);
		
		int returnDay = 0;
		int returnMonth = 0;
		int returnYear = 0;
		
		int expectedDay = 0;
		int expectedMonth = 0;
		int expectedYear = 0;
	
		returnDay = in.nextInt();
		returnMonth = in.nextInt();
		returnYear = in.nextInt();
	
		expectedDay = in.nextInt();
		expectedMonth = in.nextInt();
		expectedYear = in.nextInt();
		
		in.close();
		
		if (s.calculateLate(returnYear, expectedYear) == 1)
			hackos = 10000;
		else if (s.calculateLate(returnYear, expectedYear) == 0 && 
				s.calculateLate(returnMonth, expectedMonth) == 1) {
			hackos = 500 * (returnMonth - expectedMonth);
		}
		else if (s.calculateLate(returnYear, expectedYear) == 0 && 
				s.calculateLate(returnMonth, expectedMonth) == 0 &&
				s.calculateLate(returnDay, expectedDay) == 1) {
			hackos = 15 * (returnDay - expectedMonth);
		} else if (s.calculateLate(returnYear, expectedYear) <= 0 &&
					s.calculateLate(returnMonth, expectedMonth) <= 0 &&
					s.calculateLate(returnDay, expectedDay) <= 0) {
			hackos = 0;
		}
		
		System.out.println(hackos);
		
	}
	
	public int calculateLate(int returned, int expected) {
		int result = compare(returned, expected);
		
		if (result == 0)
			return 0;
		else if (result < 1)
			return -1;
		else
			return 1;
	}
	
	public int compare(Integer returned, Integer expected) {
		return returned.compareTo(expected);
	}
}
