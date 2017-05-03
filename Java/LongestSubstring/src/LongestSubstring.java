// https://leetcode.com/problems/longest-substring-without-repeating-characters/#/description
import java.util.HashSet;
import java.util.Set;


public class LongestSubstring {

	public static void main(String[] args) {
		// Given a string, find the length of the longest substring without repeating character
		System.out.println(lengthOfLongestSubstring("abcabcbb"));

	}
	
	public static int lengthOfLongestSubstring(String s) {
	    int i = 0, j = 0, max = 0;
	    Set<Character> set = new HashSet<>();
	    
	    while (j < s.length()) {
	        if (!set.contains(s.charAt(j))) {
	            set.add(s.charAt(j));
	            max = Math.max(max, set.size());
	            j++;
	        } else {
	            set.remove(s.charAt(i));
	            i++;
	        }
	    }
	    
	    return max;
	}
}
