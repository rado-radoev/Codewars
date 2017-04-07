public class Copied {
	private int[][] matrix;

	Copied(String str){
		String[] lines = str.split("\n");
		matrix = new int[lines.length][];
		for(int i=0;i<lines.length;i++) {
			String[] nums = lines[i].split(" ");
			matrix[i] = new int[nums.length];
			for(int j=0;j<nums.length;j++) {
				matrix[i][j] = Integer.parseInt(nums[j]);
			}
		}
	}

	int getRowsCount(){
		return matrix.length;
	}
	
	int getColumnsCount(){
		return matrix[0].length;
	}

	int[] getRow(int row){
		return matrix[row];
	}

	int[] getColumn(int col){
		int[] column = new int[getRowsCount()];
		for(int i=0;i<getRowsCount();i++){
			column[i] = matrix[i][col];
		}
		return column;
	}
}