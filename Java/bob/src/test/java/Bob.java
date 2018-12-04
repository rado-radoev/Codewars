import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.concurrent.Callable; 
import java.util.concurrent.FutureTask; 

public class Bob implements Runnable, Callable {
	
	// Map containing possible answers
	private static final Map<String, String> ANSWERS = generateAnswers(); 
	private String message;
	
	public Bob() { }
	
	public Bob(String message) {
		this.message = message;
	}


	/**	
	 * Method to generate possible answers
	 * @return HashMap containing all approaches and answers
	 */
	private static Map<String, String> generateAnswers() {
		Map<String, String> answers = new HashMap<String, String>();
		
		answers.put("question", "Sure.");
		answers.put("yell", "Whoa, chill out!");
		answers.put("yell question", "Calm down, I know what I'm doing!");
		answers.put("empty", "Fine. Be that way!");
		answers.put("other", "Whatever.");
		
		return answers;
	}

		
	public synchronized String hey(String s) {
		
		return checkAddressMeaning(s);
	}
	
	private synchronized String checkAddressMeaning(String address) {

		// Bob's default answer will be Whatever. 
		// This answer will be outputted if nothing else applies
		String bobsAnswer = ANSWERS.get("other");
		
		// Trim spaces from string
		String new_address = address.trim();
		
		// Check if String is all upper case and last char is question mark
		if (isAddressUpper(new_address) && 
				isLastCharQuestionMark(new_address)) {
			bobsAnswer = ANSWERS.get("yell question");
		}
		else if (isAddressUpper(new_address)) {
			bobsAnswer = ANSWERS.get("yell");
		}
		else if (isLastCharQuestionMark(new_address)) {
			bobsAnswer = ANSWERS.get("question");
		}
		else if (isAddressEmpty(new_address)) {
			bobsAnswer = ANSWERS.get("empty");
		}
		
		return bobsAnswer;

	}
	
	private Boolean isAddressUpper(String address) {
		
		boolean hasAtLeastOneChar = false;
		boolean isAllUpperCase = true;
		
		for (char c : address.toCharArray()) {
			if (!Character.isAlphabetic(c)) continue;
			if (Character.isLetter(c)) hasAtLeastOneChar = true;
			if (Character.isLowerCase(c)) isAllUpperCase = false;;
		}
		return hasAtLeastOneChar && isAllUpperCase;
	}
	
	private Boolean isLastCharQuestionMark(String address) {
		if (address.length() > 0)
			return address.charAt(address.length() - 1) == '?';
		
		return false;
	}
	
	private Boolean isAddressEmpty(String address) {
		boolean isEmpty = false;
		String pattern = "\\s[^\\w\\?]";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(address);
		
		
		if (address.equals("") || m.find()) { 
			isEmpty = true; 
		}
		
		return isEmpty;
	}

	@Override
	public void run() {
		// Bobber test class
		Date d = new Date(); 
        SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss"); 
		System.out.println(hey(message));
		System.out.println(ft.format(d));
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public Object call() throws Exception {
		/*Bobber2 test class*/
		return hey(message);
	}

}	















