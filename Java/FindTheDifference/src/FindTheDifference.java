//https://leetcode.com/problems/find-the-difference/#/description
public class FindTheDifference {

	public static void main(String[] args) {
		String s = "abcd";
		String t = "abced";
		
		int charCode = t.charAt(s.length());
        // Iterate through both strings and char codes
        for (int i = 0; i < s.length(); ++i) {
              charCode -= (int)s.charAt(i);
              charCode += (int)t.charAt(i); 
        }
       System.out.println((char)charCode);
		
	}
}
