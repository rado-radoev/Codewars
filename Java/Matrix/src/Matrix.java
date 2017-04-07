public class Matrix {
	private int[][] matrix;
	
	public Matrix(String s) {
		calcMatrix(s);
	}

	int getRowsCount() {
		return matrix.length;
	}
	
	int getColumnsCount() {
		return matrix[0].length;
	}
	
	int[] getRow(int row) {
		return matrix[row];
	}
	
	int[] getColumn(int column) {
		int[] col = new int[getColumnsCount()];
		for (int i = 0; i < getColumnsCount(); i++) {
			col[i] = matrix[i][column];
		}
		return col;
	}
	
	public int[][] calcMatrix(String s) {
		String[] rows = s.split("\\r?\\n"); // splitting the string into lines
		matrix = new int[rows.length][]; // creating first dimension of the array to be equal to the number of lines - rows
		
		for (int i = 0; i < rows.length; i++) {  // Iterating through every row
			rows[i] = rows[i].trim();	// Trimming empty spaces 
			String[] columns = rows[i].split(" "); // New array that will hold the digits
			matrix[i] = new int[columns.length];	// create second dimension of the array - columns
			
			for (int j = 0; j < columns.length; j++) {	// loop through the digits array
				matrix[i][j] = Integer.parseInt(columns[j]); // add each digit to the columns array
			}
		}
		return matrix;
	}
}
