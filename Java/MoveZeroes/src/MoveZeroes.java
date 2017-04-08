// https://leetcode.com/problems/move-zeroes/#/description
public class MoveZeroes {


	public static void moveZeroes(int[] array) {
		if (array == null || array.length == 0) return;
		
		for (int i = 0; i < array.length;i++) {
 			if (array[i] == 0) {
				for (int j = i + 1; j < array.length; j++) {
					if (array[j] != 0) {
						int temp = array[i];
						array[i] =  array[j];
						array[j] = temp;
						break;
					}
				}
			}
		}
	}
	

	
	public static void main(String[] args) {
		int[] nums = {0, 0, 1};
		moveZeroes(nums);

	}
	
}
