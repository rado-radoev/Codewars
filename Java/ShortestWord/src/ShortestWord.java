
public class ShortestWord {
	
	public static int findShort(String text) {
		String[] words = text.split(" ");
		int maxLength = Integer.MAX_VALUE;
		
		for (int i = 0; i < words.length; i++) {
			if (words[i].length() < maxLength) {
				maxLength = words[i].length();
			}
		}
		return maxLength;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
