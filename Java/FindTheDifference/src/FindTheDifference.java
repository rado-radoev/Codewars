//https://leetcode.com/problems/find-the-difference/#/description
public class FindTheDifference {

	public static void main(String[] args) {
		String s = "abcd";
		String t = "abcde";
		
		boolean notFound = true;
		int i = s.length();
//		for (int i = 0; i < s.length();i++) {
//			if (s.charAt(i) == t.charAt(i)) {
//				found = true;
//			}
//		}
		
		while (notFound) {
			if (s.charAt(i) == t.charAt(i)) {
				notFound = false;
			}
			i++;
		}
                          
	}

}
