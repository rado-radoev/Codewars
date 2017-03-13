// http://exercism.io/exercises/java/acronym/readme
// Help generate some jargon by writing a program that converts a long name like Portable Network Graphics to its acronym (PNG).
public class Acronym {
	
	public static String generate(String text) {
		StringBuilder acronym = new StringBuilder();
		
		String[] words = text.split("\\W");

		for (String s : words) {
			if (!s.isEmpty())
			{
				
				if (s.matches("^[A-Z \\d\\W]+$")) {
					acronym.append(s.substring(0, 1));
					continue;
				}
				
				int charIndex = 0;
				
				for (int i = 0; i < s.length();i++) {
					char currentChar = s.charAt(i);
					if (Character.isUpperCase(currentChar)) {
						charIndex = i;
						
						if (charIndex >= 0) {
							acronym.append(s.substring(charIndex, charIndex + 1));
						}
					}
				}
				

				
			} // End IF
		}
		return acronym.toString().toUpperCase();
	}
	
	public static void main (String[] args) {
		System.out.println(Acronym.generate("Cat in a Hat"));
		System.out.println(Acronym.generate("Ruby on Rails"));
	}
}
