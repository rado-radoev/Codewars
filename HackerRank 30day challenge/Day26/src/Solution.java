import java.util.Comparator;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Solution implements Comparator<Integer> {

	private int hackos;
	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int returnDay = 0;
		int returnMonth = 0;
		int returnYear = 0;
		
		int exepectedDay = 0;
		int expectedMonth = 0;
		int expectedYear = 0;
	
		returnDay = in.nextInt();
		returnMonth = in.nextInt();
		returnYear = in.nextInt();
	
		exepectedDay = in.nextInt();
		expectedMonth = in.nextInt();
		expectedYear = in.nextInt();
		
		
		
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
	
	@Override
	public int compare(Integer returned, Integer expected) {
		return returned.compareTo(expected);
	}
}
