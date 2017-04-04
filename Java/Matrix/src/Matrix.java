import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Matrix {
	
	private static ArrayList<String> rows = new ArrayList<String>();
	private static ArrayList<String> columns = new ArrayList<String>();
	
	public Matrix(String matrixAsString) {
		calculateColumn(matrixAsString);
		calculateRow(matrixAsString);
	}


	public static int getRowsCount() {
		return rows.size();
	}
	
	
	public static int getColumnsCount() {
		return columns.size();
	}
	
	public static int getRow(int row) {
		int rowToInt = Integer.parseInt(rows.get(row));
		return rowToInt;
	}
	
	public static int getColumn(int column) {
		int columnToInt = Integer.parseInt(columns.get(column));
		return columnToInt;
		
	}
	
	public static ArrayList<String> calculateColumn(String matrixAsString) {
		int rowLength = rows.get(0).length();	// get the length of a row
		for (int i = 0; i < rowLength;  i++) { // loop through every column
			StringBuilder sb = new StringBuilder(); // Create empty string to hold the individual chars (digit on each row)
			for (int j = 0; j < rows.size(); j++) { // loop through every row
				char c = rows.get(j).charAt(i); // get the digit on the specified index 0,1,2 ...
				sb.append(c); // Append to string
			}
			columns.add(sb.toString()); // Add to array
		}
		return columns;
	}
	
	
	public static ArrayList<String> calculateRow(String matrixAsString) {
		Pattern p = Pattern.compile(".*.");
		Matcher m = p.matcher(matrixAsString);
		
		while (m.find()) {
			String trimmed = m.group().replaceAll("\\s", "");
			rows.add(trimmed);
		}	
		return rows;
	}

	public static void main(String[] args) {
		Matrix matrix = new Matrix("9 8 7\n5 3 2\n6 6 7");
		System.out.println(matrix.getRowsCount());
	}

}

//ArrayList<String> rows = new ArrayList<String>();
//ArrayList<String> columns = new ArrayList<String>();
//
//String matrix = "9 8 7\n5 3 2\n6 6 7";
//
//Pattern p = Pattern.compile(".*.");
//Matcher m = p.matcher(matrix);
//
//while (m.find()) {
//	String trimmed = m.group().replaceAll("\\s", "");
//	rows.add(trimmed);
//}
//
///*
// * line 0 char at 0
// * line 1 char at 0
// * line 2 char at 0
// * 
// * line 0 char at 1
// * line 1 char at 1
// * line 2 char at 1
// * 
// * line 0 char at 2
// * line 1 char at 2
// * line 2 char at 2
// */
//
//int rowLength = rows.get(0).length();	// get the length of a row
//for (int i = 0; i <= rowLength - 1;  i++) { // loop through every column
//	StringBuilder sb = new StringBuilder(); // Create empty string to hold the individual chars (digit on each row)
//	for (int j = 0; j <= rows.size() - 1; j++) { // loop through every row
//		char c = rows.get(j).charAt(i); // get the digit on the specified index 0,1,2 ...
//		sb.append(c); // Append to string
//	}
//	columns.add(sb.toString()); // Add to array
//}
//
//for (String r : rows) {
//	System.out.println(r);
//}
//System.out.println("-------------");
//
//for (String c : columns) {
//	System.out.println(c);
//}
