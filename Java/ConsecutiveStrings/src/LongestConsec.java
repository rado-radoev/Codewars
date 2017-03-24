//https://www.codewars.com/kata/consecutive-strings/train/java
import java.util.HashMap;
public class LongestConsec {

	public static void main(String[] args) {
		String[] s = {"it","wkppv","ixoyx", "3452", "zzzzzzzzzzzz"};
		System.out.println(longestConsec(s, 3));

	}
	
	public static String longestConsec (String[] s, int k) {
		
		final int n = s.length;
		if (n == 0 || k > n ||k <=0) {
			return "";
		}
		
		
		HashMap<Integer, String> myHashMap = new HashMap<Integer, String>();
		StringBuilder tempStr = new StringBuilder();
		int longestStrLenght = Integer.MIN_VALUE;
		String longestString = null;
		
		for (int i = 0; i < s.length; i++) {
			if (s[i].length() > longestStrLenght) {
				longestStrLenght = s[i].length();
				longestString = s[i];
			}
			
			
			int counter = 0;
			while (counter < k ) {
				if (i + counter < n) {
					tempStr.append(s[i + counter]);
				}
				
				counter++;
			}
			
			if (!myHashMap.containsKey(tempStr.length())) {
				myHashMap.put(tempStr.length(), tempStr.toString());
			}
			tempStr.delete(0, tempStr.length());
		}
		
		if (k == 1) {
			return longestString;
		}
		
		
		int concatenatedStringMaxLenght = Integer.MIN_VALUE;
		String longestConcatenatedString = null;
		for (Integer key : myHashMap.keySet()) {
			if (key > concatenatedStringMaxLenght) {
				concatenatedStringMaxLenght = key;
				longestConcatenatedString = myHashMap.get(key);
			}
		}
			return longestConcatenatedString;	
	}
}
