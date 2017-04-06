import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Logger;


public class StringSplitter {

	public static void main(String[] args) {
		String s = "9 8 7 \n 5 3 2 \n 6 6 7";
		
		//System.out.println(s);
		
		
		String[] lines = s.split("\\r?\\n");
		ArrayList<String[]> rows = new ArrayList<String[]>();
		ArrayList<String[]> cols = new ArrayList<String[]>();
		
		
		for (String i : lines) {
			i = i.trim();
			String row[] = i.split(" ");
			rows.add(row);
		}
		
		// return rows
		for (int i = 0; i < rows.size(); i++) {
			for (String str : rows.get(i)) {
				//System.out.print(str);
			}
			System.out.println();
		}

		//return columns
		for (int i = 0; i < rows.size(); i++) {
			for (int j = i; j < rows.get(i).length && j < i + 1; j++) {
				String str = rows.get(i)[j];
				System.out.println(str);
			}
		}
	}
}


// get the string
// split it by line
// remove empty spaces
// add each char to rows array

/*for (String[] arr : rows) {
	for (String x : arr) {
		System.out.println(x);
	}
}*/
