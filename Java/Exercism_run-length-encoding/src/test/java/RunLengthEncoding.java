import org.junit.Assert;

public class RunLengthEncoding {
	/*
	 * Create HashMap<Character, Integer>
	 * Loop through each character
	 * Add character to HashMap if it doesn't exist already
	 * if character exists increment Integer
	 * if not add the character to Map
	 */

	Assert.assertEquals(
            "12WB12W3B24WB",
            runLengthEncoding.encode(
                    "WWWWWWWWWWWWBWWWWWWWWWWWWBBBWWWWWWWWWWWWWWWWWWWWWWWWB"));
	
	
	public String encode(String str) {
	
		return "";
	}
	
	public String decode(String str) {
		
		return "";
	}
	
	/**
	 * Method to check if a character is digit
	 * @param character character to check
	 * @return true/false if character is digit or not
	 */
	private boolean isDitig(char character) {
		if (isInRange((int) character, 48, 57))
			return true;
		
		return false;
	}
	
	/**
	 * Method to check if int value is in range
	 * @return
	 */
	private boolean isInRange(int valueToCheck, int minRange, int maxRange) {
		if (valueToCheck > maxRange || valueToCheck < minRange)
			return false;
		
		return true;
	}
}
