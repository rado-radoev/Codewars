//https://www.codewars.com/kata/consecutive-strings/train/java
import java.util.HashMap;
public class LongestConsec {

	public static void main(String[] args) {
		String[] s = {"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"};
		String[] s2 = {"ejjjjmmtthh", "zxxuueeg", "aanlljrrrxx", "dqqqaaabbb", "oocccffuucccjjjkkkjyyyeehh"};
		String[] s3 = {"itvayloxrp","wkppqsztdkmvcuwvereiupccauycnjutlv","vweqilsfytihvrzlaodfixoyxvyuyvgpck"};
		longestConsec(s2, 1);

	}
	
	/*
	 * {"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"}, 2), "abigailtheta");
	 * int longestStrLenght = Integer.MinValue;
	 * String longestString = null;
	 * 
	 * for int i = arr.lenght
	 * if (arr[i].lenght > longestStrLenght)
	 * 		longestStrLenght == arr[i].lenght
	 * 		longestString = arr[i]
	 * 
	 * check string 0 + 1
	 * conatenate and get lenght
	 * store in hash map lenght > string
	 * check string 1 + 2
	 * concatenate and get lenght
	 * store in hash map lenght > string
	 * 
	 * loop through has map
	 * int maxValue = Integer.Min;
	 * String longestConcatStr = null;
	 * if hashmap key > maxValue
	 * 		maxvalue = hashmapkey
	 * 		longestConcatStr = hashmapkey.getvalue
	 * 
	 * 
   	 * {"ejjjjmmtthh", "zxxuueeg", "aanlljrrrxx", "dqqqaaabbb", "oocccffuucccjjjkkkjyyyeehh"}, 1), "oocccffuucccjjjkkkjyyyeehh");
   	 * testing(LongestConsec.longestConsec(new String[] {"itvayloxrp","wkppqsztdkmvcuwvereiupccauycnjutlv","vweqilsfytihvrzlaodfixoyxvyuyvgpck"}, 2), "wkppqsztdkmvcuwvereiupccauycnjutlvvweqilsfytihvrzlaodfixoyxvyuyvgpck");
        testing(LongestConsec.longestConsec(new String[] {"wlwsasphmxx","owiaxujylentrklctozmymu","wpgozvxxiu"}, 2), "wlwsasphmxxowiaxujylentrklctozmymu");
        testing(LongestConsec.longestConsec(new String[] {"zone", "abigail", "theta", "form", "libe", "zas"}, -2), "");
        testing(LongestConsec.longestConsec(new String[] {"it","wkppv","ixoyx", "3452", "zzzzzzzzzzzz"}, 3), "ixoyx3452zzzzzzzzzzzz");
        testing(LongestConsec.longestConsec(new String[] {"it","wkppv","ixoyx", "3452", "zzzzzzzzzzzz"}, 15), "");
        testing(LongestConsec.longestConsec(new String[] {"it","wkppv","ixoyx", "3452", "zzzzzzzzzzzz"}, 0), "");
	 * */ 

	public static void longestConsec (String[] s, int k) {
		HashMap<Integer, String> myHashMap = new HashMap<Integer, String>();
		StringBuilder tempStr = new StringBuilder();
		int longestStrLenght = Integer.MIN_VALUE;
		String longestString = null;
		
		for (int i = 0; i < s.length; i++) {
			if (s[i].length() > longestStrLenght) {
				longestStrLenght = s[i].length();
				longestString = s[i];
			}
			
			if (i < s.length - 1) {
				tempStr.append(s[i] + s[i + 1]);
			}
			else {
				tempStr.append(s[i]);
			}
			
			System.out.printf("String added to hashMap: %s%n", tempStr.toString());
			if (!myHashMap.containsKey(tempStr.length())) {
				myHashMap.put(tempStr.length(), tempStr.toString());
			}
			tempStr.delete(0, tempStr.length());
		}
		
		
		int concatenatedStringMaxLenght = Integer.MIN_VALUE;
		String longestConcatenatedString = null;
		for (Integer key : myHashMap.keySet()) {
			if (key > concatenatedStringMaxLenght) {
				concatenatedStringMaxLenght = key;
				longestConcatenatedString = myHashMap.get(key);
			}
		}
			System.out.println(longestConcatenatedString);	
	}
}
