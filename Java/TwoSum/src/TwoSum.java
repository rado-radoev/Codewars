//https://leetcode.com/problems/two-sum/#/description

import java.util.HashMap;


public class TwoSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] nums = {3,3};
		for (Integer i : calculateSum(nums, 6)) {
			System.out.println(i);
		}

	}
	
	public static int[] calculateSum(int[] nums, int target) {
		HashMap<Integer,Integer> myHash = new HashMap<Integer,Integer>();
		int result;
		int[] output = new int[2];
		
		for (int i = 0; i < nums.length; i++) {
			result = target - nums[i];
			
			if (!myHash.containsKey(nums[i])) {
				myHash.put(nums[i], i);	
			}

			if (myHash.containsKey(result)) {
				output[0] = myHash.get(result);
				output[1] = i;
			}
		}
		return output;
	}
	

}
