import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Matrix {

	public static void main(String[] args) {
		ArrayList<String> rows = new ArrayList<String>();
		ArrayList<String> columns = new ArrayList<String>();
		
		String matrix = "9 8 7\n5 3 2\n6 6 7";

		Pattern p = Pattern.compile(".*.");
		Matcher m = p.matcher(matrix);
		
		while (m.find()) {
			String trimmed = m.group().replaceAll("\\s", "");
			rows.add(trimmed);
		}
		
		/*
		 * line 0 char at 0
		 * line 1 char at 0
		 * line 2 char at 0
		 * 
		 * line 0 char at 1
		 * line 1 char at 1
		 * line 2 char at 1
		 * 
		 * line 0 char at 2
		 * line 1 char at 2
		 * line 2 char at 2
		 */
		
		for (int i = 0; i < rows.size(); i++) {
			// loop through row 0
			// get the lenght of the row - 1
			for (int j = 0; j < rows.get(i).length() - 1; j++) {
				int index = rows.get(i).length() - rows.get(i).length() + i;
				char col = rows.get(i).charAt(index);
				System.out.println(col);
				break;
			}
		}

	}

}
