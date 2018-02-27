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




 //***********************
 // Alternative Solution *
 // **********************

class BookReturnDate{
    public int day;
    public int month; 
    public int year;
    
    BookReturnDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
}

class Solution2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BookReturnDate actual = new BookReturnDate(scan.nextInt(), scan.nextInt(),scan.nextInt());
        BookReturnDate expected = new BookReturnDate(scan.nextInt(), scan.nextInt(),scan.nextInt());
        scan.close();
        
        int fine = 0;
        
        // Returned within the current year:
        if(expected.year == actual.year){
            // Returned 1+ months late in current year
            if(expected.month < actual.month){
                fine = (actual.month - expected.month) * 500;
            }
            // Returned 1+ days late within the current month
            else if( (expected.month == actual.month) 
                    && (expected.day < actual.day) ){
                fine = (actual.day - expected.day) * 15;
            }
            // Else it is implied that the book was returned early
        }
        else if(expected.year < actual.year){
            // Returned 1+ years late
            fine = 10000;
        }
        // Else it is implied that the book was returned 1+ years early

        System.out.println(fine);
        
    }
}
