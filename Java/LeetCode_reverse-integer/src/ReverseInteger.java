// https://leetcode.com/problems/reverse-integer/description/	
public class ReverseInteger {

	public static void main(String[] args) {
		String s = "9646324351";
		System.out.print(reverse(10));

	}
	
	public static int reverse(int x) {
		StringBuffer tempNumHolder = new StringBuffer();
		
		try {
			if (x < 0) {
				tempNumHolder.append("-");
			}
			else if (x == 0) {
				return 0;
			}
			
			while (x != 0) {
				tempNumHolder.append(String.valueOf(Math.abs(x % 10)));
				x /= 10;
			}
		} catch (NumberFormatException nfe) {
			return 0;
		}
		
		int num = Integer.valueOf(tempNumHolder.toString());
		return num > Integer.MAX_VALUE ? 0 : num;
	}

}
