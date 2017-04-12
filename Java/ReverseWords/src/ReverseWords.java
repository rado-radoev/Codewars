
public class ReverseWords {

	public static void main(String[] args) {

	}
	
	public static String invertWords(String s) {
		String str = "Let's take LeetCode contest";
		String[] strArray = str.split(" ");
		StringBuilder tempStr = new StringBuilder();
		StringBuilder output = new StringBuilder();
		
		for (int i = 0; i < strArray.length; i++) {
			for (int j = strArray[i].length() - 1; j >= 0;j--) {
				tempStr.append(strArray[i].charAt(j));
			}
			output.append(tempStr + " ");
			tempStr.setLength(0);
		}
		return output.toString().trim();
	}
}
