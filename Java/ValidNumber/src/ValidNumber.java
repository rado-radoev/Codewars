//https://leetcode.com/problems/valid-number/#/description
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidNumber {
	
	public static boolean isNumber(String s) {
		String pattern = "^[+-]?([0-9]*\\.?[0-9]+|[0-9]+\\.?[0-9]*)([eE][+-]?[0-9]+)?|([0-9]*\\s)$";
		Pattern p = Pattern.compile(pattern);
		
		Matcher m = p.matcher(s);
		if (m.find()) {
			if (m.equals(' ')) {
				return false;
			}
			return true;
		} else {
			return false;
		}
    }
}
