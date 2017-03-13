import java.util.HashMap;

// http://exercism.io/exercises/java/scrabble-score/readme
public class Scrabble {
	
	private static String word;
	
	public Scrabble (String word) {
		this.word = word;
	}
	
	public static int getScore() {
		HashMap<Character, Integer> letterScores = new HashMap<Character, Integer>();
		letterScores.put('A', 1);
		letterScores.put('E', 1);
		letterScores.put('I', 1);
		letterScores.put('O', 1);
		letterScores.put('U', 1);
		letterScores.put('L', 1);
		letterScores.put('N', 1);
		letterScores.put('R', 1);
		letterScores.put('S', 1);
		letterScores.put('T', 1);
		letterScores.put('D', 2);
		letterScores.put('G', 2);
		letterScores.put('B', 3);
		letterScores.put('C', 3);
		letterScores.put('P', 3);
		letterScores.put('M', 3);
		letterScores.put('F', 4);
		letterScores.put('H', 4);
		letterScores.put('V', 4);
		letterScores.put('W', 4);
		letterScores.put('Y', 4);
		letterScores.put('K', 5);
		letterScores.put('J', 8);
		letterScores.put('X', 8);
		letterScores.put('Q', 10);
		letterScores.put('Z', 10);
		
		int totalScore = 0;
		if (word == null || word.isEmpty()) {
			return totalScore;
		}
		else {
			word = word.toUpperCase();
			for (int i = 0; i < word.length(); i++) {
				char c = word.charAt(i);
				if (letterScores.containsKey(c)) {
					totalScore += letterScores.get(c);
				}
			}
			return totalScore;
		}
	}
}
