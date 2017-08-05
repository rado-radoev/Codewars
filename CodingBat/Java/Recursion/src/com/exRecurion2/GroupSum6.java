package com.exRecurion2;

/*
 * 	Given an array of ints, is it possible to choose
 *  a group of some of the ints, 
 *  beginning at the start index, such that the group sums to the given target?
 *  However, with the additional constraint
 *  that all 6's must be chosen. (No loops needed.)
 */

public class GroupSum6 {

	public static void main(String[] args) {
		int[] arr = {5, 2, 4, 6};
		System.out.println(groupSum6(0, arr, 9));
	}
	
	public static boolean groupSum6(int start, int[] nums, int target) {
		
		//if (target == 0) return true;
		
		if (start >= nums.length) {
			if (target == 0) return true;
			return false;
		}
		
		if (nums[start] == 6) { 
			target -= nums[start];
			return groupSum6(start + 1, nums, target);
		}
		
		if(groupSum6(start + 1, nums, target - nums[start]))
			return true;
		
		
		return groupSum6(start + 1, nums, target);
	}

}
