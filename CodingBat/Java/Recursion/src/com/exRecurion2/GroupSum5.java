package com.exRecurion2;

/*
Given an array of ints, is it possible to choose a group 
of some of the ints, such that the group sums to the given 
target with these additional constraints: all multiples of 5 
in the array must be included in the group. 
If the value immediately following a multiple of 5 is 1, 
it must not be chosen. (No loops needed.)
 */

public class GroupSum5 {

	public static void main(String[] args) {
		int[] nums = {2, 5, 10, 4};
		System.out.println(groupSum5(0, nums, 7));
	}

	public static boolean groupSum5(int start, int[] nums, int target) {
		
		if (start >= nums.length) {
			if (target == 0)
				return true;
			return false;
		}
		
		if (nums[start] % 5 == 0) {
			if (start + 1 < nums.length && nums[start + 1] == 1) {
				return groupSum5(start + 2, nums, target - nums[start]);
			}
			return groupSum5(start + 1, nums, target - nums[start]);
		}
		
		
		if (groupSum5(start + 1, nums, target - nums[start]))
			return true;
		
		return groupSum5(start + 1, nums, target);
		
	}
}
