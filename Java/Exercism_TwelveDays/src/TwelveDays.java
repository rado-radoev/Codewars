// http://exercism.io/exercises/java/twelve-days/readme
	
public class TwelveDays {

	// Array that represents the number of days for the 1st, 2nd and 3rd day 
	private String[] Days = {"", "first", "second", "third", "", "fifth" , "" ,"", "eighth", "ninth", "" ,"", "twelfth"};
	
	// Array that represents the number of days and presents. If used as day > 3, 'th' is appended to the end
	private String[] Numbers = {"", "a", "two", "three",  "four",  "five",  "six",  "seven",  "eight",  "nine",  "ten",  "eleven",  "twelve"};
	
	// Array that represents the presents for each of the 12 days.
	private String[] gifts = {"", "Partridge", "Turtle Doves", "French Hens", "Calling Birds", "Gold Rings", "Geese-a-Laying", "Swans-a-Swimming", "Maids-a-Milking", "Ladies Dancing",
			 "Lords-a-Leaping", "Pipers Piping", "Drummers Drumming"};
	
	// Returns the verse for the specific day
	public String verse(int day) {
		// Variable to hold the string representation of the day
		String nthDay;
		
		switch (day) {
		case 1:
			nthDay = Days[1];	// Day 1 == first
			break;
		case 2:
			nthDay = Days[2];	// Day 2 == second
			break;
		case 3:
			nthDay = Days[3];	// Day 3 == third
			break;
		case 5:
			nthDay = Days[5];	// Day 5 == fifth
			break;
		case 8:
			nthDay = Days[8];	// Day 8 == eight
			break;
		case 9:
			nthDay = Days[9];	// Day 9 == ninth
			break;
		case 12:
			nthDay = Days[12];	// Day 12 == twelfth
			break;
		default:
			nthDay = Numbers[day] + "th";	// Any other day is looked up from the Numbers array and appended 'th' at the end
			break;
		}
		
		// String representing the complete verse for a specified day
		String verse = "On the " + nthDay + " day of Christmas my true love gave to me, " + getGifts(day) + " in a Pear Tree.\n";
		return verse;
	}
	
	// Display the range of verses
	public String verses(int start, int end) {
		String verses = "";
		for (int verse = start; verse <= end; verse++) {
			verses += verse(verse) + (verse == end ? "" : "\n");	// Add each verse to the verses string and add a additional blank line, except if 
		}															// it is the last line, Than do not add additional blank line
		return verses;
	}
	
	// Display the whole song
	public String sing() {
		return verses(1, 12);
	}
	
	
	private String getGifts(int day) {
		// return number of gifts string, depending on the day
		String presents = "";
		
		// Concatenates string holding the list of gifts
		if (day >= 1) {
			for (int gift =	 day; gift >= 1; gift--) {	// for each day a gift string is appended to the day before
				// Assign presents to the variable 
				// If it is the first day, then only add a as number of presents
				// AND if the gift number is just one, do not add 'and' in front of the present
				// Else if the day is not 1 then add the number of gifts (one, two, etc...)
				// AND if the gifts are more than 1 add 'and' in front of the last gift
				// add a space after the name of the gift and 
				// If the gift is only one do not add comma
				// ELSE if the gifts are more than one add comma after the gift.
				presents += (day == 1 ? Numbers[day] : (gift == 1 ? "and ": "") + Numbers[gift]) + " " + gifts[gift] + (gift == 1 ? "" : ", ");	
				
			}
		}
		return presents;
	}
	
	
	public static void main (String[] args) {
		
		TwelveDays td = new TwelveDays();
		//System.out.println(td.getGifts(2));
		System.out.println(td.verse(1));
		System.out.println(td.verse(2));
		System.out.println(td.verse(3));
		System.out.println(td.verse(4));
		System.out.println(td.verse(5));
		System.out.println(td.verse(6));
		System.out.println(td.verse(7));
		System.out.println(td.verse(8));
		System.out.println(td.verse(9));
		System.out.println(td.verse(10));
	}

}
