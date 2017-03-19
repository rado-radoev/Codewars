///https://www.codewars.com/kata/simple-encryption-number-1-alternating-split/train/java
public class Encryption {
	
	/**
	 * Encrypt a string of text - main encryption method
	 * @param text	String of text to encrypt
	 * @return	encrypted text as a String
	 */
	public static String mainEncrypt(String text) {
	    char[] textToArray = text.toCharArray();	// Converting the string to array of characters
	    StringBuilder sbEven = new StringBuilder();	// Create a string to hold all letter on even position
	    StringBuilder sbOdd = new StringBuilder();	// Create a string to hold all the letters on odd position
	    String output = null;	// String to be outputed
	    
	    for (int i = 0; i < textToArray.length; i++) {	// Loop throught the array
	    	if ((i + 1) % 2 == 0) {						// If string is on even position
	    		sbEven.append(textToArray[i]);			// Add to String that holds even positioned letters
	    	}
	    	else {
	    		sbOdd.append(textToArray[i]);			// Otherwise add to String that holds even positioned letters
	    	}
	    }
	    output = String.format("%s%s", sbEven.toString(), sbOdd.toString());	// Concatenate the even and odd outputted string and add to output
	    return output; // return ecnrypted string
	}
	
	/**
	 * String encryption
	 * @param text	String of text to encrypt
	 * @param n		How deep the encryption to be
	 * @return		Encrypted string
	 */
	public static String encrypt(final String text, final int n) {

		    if (n <= 0)	// If number of iterations is 0 or less 
		    	return text;	// return the string as is
		    
		   String output = text;	// Create a placeholder string that will be used to ecnrypt the string. Multiple time if n > 1.
		   for (int i = n; i > 0; i--) {
			  output = mainEncrypt(output);	// Ecnrypt the sting of text as many times as in n
		   }
		   return output;	// return the ecnrypted string
	  }


	/**
	 * Decrypt a string of text - main decryption method
	 * @param text	String of text to decrypt
	 * @return		Decrypted string
	 */
	  public static String mainDecrypt(String text) {
		    char[] textToArray = text.toCharArray();	// Convert string to array of characters
		    StringBuilder output = new StringBuilder(); // String to hold the output
		    
		    int middle = (textToArray.length) / 2; 	// Get the middle of the string
		    for (int i = 0; i < middle; i++) {		// Loop throught the 1st part of the char array
		    	output.append(textToArray[i]);	// and add it to the String to be outputted
		    }
		    
		    int insertCounter = 0;	// Insertion counter
		    for (int i = middle; i < textToArray.length; i++) {	// Loop through the second part of the char array
		    	output.insert(insertCounter, textToArray[i]);	// Add each string from the second part to an even position
		    	insertCounter += 2;	// Increase insertion counter by 2, so the next char can be added to an even position
		    }
		    return output.toString();	// return the string
	  }
	  
	  /**
	   * Decrypt a String of text
	   * @param encryptedText	Encrypted String of text
	   * @param n				How deep the decryption goes
	   * @return				Decrypted string
	   */
	  public static String decrypt(final String encryptedText, final int n) {
		    if (n <= 0)	// If the decryption depth is 0 or less
		    	return encryptedText;	// return the string as is
		    
		   String output = encryptedText;	// String to be otputted
		   for (int i = n; i > 0; i--) {	// Decrypt the string as many times as in parameter n
			  output = mainDecrypt(output);	// Execute the main decryption method multiple times if needs if n > 1 
		   }
		   return output;	// return the decrypted string
	  }
}
