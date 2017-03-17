///https://www.codewars.com/kata/simple-encryption-number-1-alternating-split/train/java
public class Encryption {
	
	// Get the string
	// for every even character 
	// add to string
	// if int n <= 0 return the string as it is
	// if n == 1 return the string modified once
	// if n == 2 iterate through the modifed string again
	// if n == 3 iterate throught the modified string 2 again
	// etc.
	
	  public static String encrypt(final String text, final int n) {
		    char[] textToArray = text.toCharArray();
		    StringBuilder sbEven = new StringBuilder();
		    StringBuilder sbOdd = new StringBuilder();
		    StringBuilder output = new StringBuilder();
		    
		    for (int i = 0; i < textToArray.length; i++) {
		    	if (i % 2 == 0) {
		    		sbEven.append(textToArray[i]);
		    	}
		    	else {
		    		sbOdd.append(textToArray[i]);
		    	}
		    }
		    
		    output = String.format("%s%s", sbEven.toString() + sbOdd.toString());
		    
		    return null;   
		  }
		  
		  public static String decrypt(final String encryptedText, final int n) {
		    // Your code here
		    return null;
		  }
}
