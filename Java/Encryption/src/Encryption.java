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
	
	public static String mainEncrypt(String text) {
	    char[] textToArray = text.toCharArray();
	    StringBuilder sbEven = new StringBuilder();
	    StringBuilder sbOdd = new StringBuilder();
	    String output = null;
	    
	    for (int i = 0; i < textToArray.length; i++) {
	    	if ((i + 1) % 2 == 0) {
	    		sbEven.append(textToArray[i]);
	    	}
	    	else {
	    		sbOdd.append(textToArray[i]);
	    	}
	    }
	    output = String.format("%s%s", sbEven.toString(), sbOdd.toString());
	    return output;
	}
	
	public static String encrypt(final String text, final int n) {

		    if (n <= 0)
		    	return text;
		    
		   String output = text;
		   for (int i = n; i > 0; i--) {
			  output = mainEncrypt(output);
		   }
		   return output;
	  }

	  
	  public static String mainDecrypt(String text) {
		    char[] textToArray = text.toCharArray();
		    StringBuilder output = new StringBuilder();
		    
		    int middle = (textToArray.length - 1) / 2;
		    for (int i = 0; i < middle; i++) {
		    	output.append(textToArray[i]);
		    }
		    
		    int insertCounter = 0;
		    for (int i = middle; i < textToArray.length - 1; i++) {
		    	output.insert(insertCounter, textToArray[i]);
		    	insertCounter += 2;
		    }
		    return output.toString();
	  }
	  
	  public static String decrypt(final String encryptedText, final int n) {
		    if (n <= 0)
		    	return encryptedText;
		    
		   String output = encryptedText;
		   for (int i = n; i > 0; i--) {
			  output = mainDecrypt(output);
		   }
		   return output;
	  }
	  
	  public static void main(String[] args) {
		  String text = "hsi  etTi sats!!";
		  System.out.println(mainDecrypt(text));
	  }
}
