package com.exRecurion2;

/*
 * Given an array of ints, is it possible to choose
 * a group of some of the ints, such that the group sums 
 * to the given target with this additional constraint: 
 * If a value in the array is chosen to be in the group, 
 * the value immediately following it in the array must 
 * not be chosen. (No loops needed.)
 */

public class GroupNoAdj {
	
	static String indent = "";
	static final boolean debugging = true;

	public static void main(String[] args) {
		int[] arr = {2, 5, 10, 4};
		System.out.println(groupNoAdj(0, arr, 14));
	}
	
	public static void enter(int start, int[] nums, int target) {
		if (debugging) {
		System.out.println(indent + "Entering at index: " + start +
				", nums = " + (start >= nums.length ? "_" : nums[start]) + 
				", target is: " + target);
		indent = indent + "| ";
		}
	}
	
	public static boolean yes(int start, int[] nums, int target) {
		if (debugging) {
		indent = indent.substring(3);
		System.out.println(indent + "Index: " + start +
				", nums = " + (start >= nums.length ? "_" : nums[start]) + 
				", target is: " + target+  
				" --> returns true");
		}
		return true;
	}
	
	public static boolean no(int start, int[] nums, int target) {
		if (debugging) {
		indent = indent.substring(3);
		System.out.println(indent + "Index: " + start +
				", nums = " + (start >= nums.length ? "_" : nums[start]) + 
				", and target: " + target +  
				" --> returns false");
		}
		return false;
	}

	public static boolean groupNoAdj(int start, int[] nums, int target) {
		enter(start, nums, target);
		
		if(target == 0)
		  	return yes(start, nums, target);
		
		if(start >= nums.length)
			return no(start, nums, target);
		
		if(groupNoAdj(start + 2, nums, target - nums[start]))
			return yes(start, nums, target);
		
		return groupNoAdj(start + 1, nums, target);

	}
}
