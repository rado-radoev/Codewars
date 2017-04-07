public class StringSplitter {
	private int[][] matrix;
	private int rowsCount;
	private int columnsCount;
	private int[] rows;
	private int[] columns;
	
	public int[][] calculatedMatrix(String s) {
		String[] lines = s.split("\\r?\\n"); // splitting the string into lines
		matrix = new int[lines.length][]; // creating first dimension of the array to be equal to the number of lines - rows
		
		for (int i = 0; i < lines.length; i++) {  // Iterating through every row
			lines[i] = lines[i].trim();	// Trimming empty spaces 
			String[] digits = lines[i].split(" "); // New array that will hold the digits
			matrix[i] = new int[digits.length];	// create second dimension of the array - columns
			
			for (int j = 0; j < digits.length; j++) {	// loop through the digits array
				matrix[i][j] = Integer.parseInt(digits[j]); // add each digit to the columns array
			}
		}
		return matrix;
	}

	/**
	 * @return the rowsCount
	 */
	public int getRowsCount() {
		return rowsCount;
	}

	/**
	 * @param rowsCount the rowsCount to set
	 */
	public void setRowsCount(int rowsCount) {
		this.rowsCount = rowsCount;
	}

	/**
	 * @return the columnsCount
	 */
	public int getColumnsCount() {
		return columnsCount;
	}

	/**
	 * @param columnsCount the columnsCount to set
	 */
	public void setColumnsCount(int columnsCount) {
		this.columnsCount = columnsCount;
	}

	/**
	 * @return the rows
	 */
	public int[] getRows() {
		return rows;
	}

	/**
	 * @param rows the rows to set
	 */
	public void setRows(int[] rows) {
		this.rows = rows;
	}

	/**
	 * @return the columns
	 */
	public int[] getColumns() {
		return columns;
	}

	/**
	 * @param columns the columns to set
	 */
	public void setColumns(int[] columns) {
		this.columns = columns;
	}
}
