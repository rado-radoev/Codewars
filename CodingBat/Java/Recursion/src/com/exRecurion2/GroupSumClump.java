package com.exRecurion2;

/*
 * Given an array of ints, is it possible to choose 
 * a group of some of the ints, such that the group 
 * sums to the given target, with this additional constraint: 
 * if there are numbers in the array that are adjacent and 
 * the identical value, they must either all be chosen, 
 * or none of them chosen. For example, with the array 
 * {1, 2, 2, 2, 5, 2}, either all three 2's in the middle 
 * must be chosen or not, all as a group. (one loop can be used
 *  to find the extent of the identical values).
 */

public class GroupSumClump {

	static String indent = "";
	static final boolean debugging = true;
	
	public static void main(String[] args) {
		int[] arr = {2, 4, 4, 8};
		System.out.println(groupSumClump(0, arr, 14));
		
	}
	
	
	public static void enter(int start, int[] nums, int target) {
		if (debugging) {
		System.out.println(indent + "Entering at index: " + start +
				", nums = " + (start == nums.length ? "_" : nums[start]) + 
				", target is: " + target);
		indent = indent + "| ";
		}
	}
	
	public static boolean yes(int start, int[] nums, int target) {
		if (debugging) {
		indent = indent.substring(3);
		System.out.println(indent + "Index: " + start +
				", nums = " + (start == nums.length ? "_" : nums[start]) + 
				", target is: " + target+  
				" --> returns true");
		}
		return true;
	}
	
	public static boolean no(int start, int[] nums, int target) {
		if (debugging) {
		indent = indent.substring(3);
		System.out.println(indent + "Index: " + start +
				", nums = " + (start == nums.length ? "_" : nums[start]) + 
				", and target: " + target +  
				" --> returns false");
		}
		return false;
	}

	public static boolean groupSumClump(int start, int[] nums, int target) {
		enter(start, nums, target);
		
		if(start >= nums.length) {
			if(target == 0) {
				return yes(start, nums, target);
			}
		return no(start, nums, target);
	 	}
		
	 	int i = start + 1;
	 	for(;  i < nums.length && nums[start] == nums[i]; i++);
	 	
	 	if(groupSumClump(i, nums, target - ((i - start) * nums[start])))
	 		return yes(start, nums, target);
	 	
	 	return groupSumClump(i, nums, target);
	}
}
