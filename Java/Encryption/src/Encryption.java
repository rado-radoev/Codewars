///https://www.codewars.com/kata/simple-encryption-number-1-alternating-split/train/java
public class Encryption {
	
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
		    
		    int middle = (textToArray.length) / 2;
		    for (int i = 0; i < middle; i++) {
		    	output.append(textToArray[i]);
		    }
		    
		    int insertCounter = 0;
		    for (int i = middle; i < textToArray.length; i++) {
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
	  
	  public static void main (String[] args) {
		  String text = "hskt svr neetn!Ti aai eyitrsig";
		  System.out.println(decrypt(text, 1));
		  
	  }
}
