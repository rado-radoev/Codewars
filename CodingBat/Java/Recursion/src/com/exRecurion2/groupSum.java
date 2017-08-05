package com.exRecurion2;

/*
 * http://codingbat.com/prob/p145416
 * Given an array of ints, is it possible to choose a group of some of the ints, 
 * such that the group sums to the given target? 
 * This is a classic backtracking recursion problem. 
 * Once you understand the recursive backtracking strategy in this problem, 
 * you can use the same pattern for many problems to search a space of choices. 
 * Rather than looking at the whole array, 
 * our convention is to consider the part of the array starting at index start 
 * and continuing to the end of the array. The caller can specify the whole array 
 * simply by passing start as 0. No loops are needed -- the recursive calls progress down the array.
 */

public class groupSum {
	
	static String indent = "";
	static final boolean debugging = true;

	public static void main(String[] args) {
		int[] arr = {2,4,8};
		System.out.println(groupSum(0, arr, 10));
	}
	
	public static void enter(int start, int[] nums, int target) {
		if (debugging) {
		System.out.println(indent + " Entering at index: " + start +
				", nums = " + (start == nums.length ? "_" : nums[start]) + 
				", target is: " + target);
		indent = indent + " | ";
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

	public static boolean groupSum(int start, int[] nums, int target) {

		enter(start, nums, target);
		
		if (target == 0) return yes(start, nums, target);
		
		if (start == nums.length) return no(start, nums, target);

		if (groupSum(start + 1, nums, target - nums[start]))
			return yes(start, nums, target);
		
		return groupSum(start + 1, nums, target);

	}
}


/*
  // Base case: if there are no numbers left, then there is a
  // solution only if target is 0.
  if (start >= nums.length) return (target == 0);
  
  // Key idea: nums[start] is chosen or it is not.
  // Deal with nums[start], letting recursion
  // deal with all the rest of the array.
  
  // Recursive call trying the case that nums[start] is chosen --
  // subtract it from target in the call.
  if (groupSum(start + 1, nums, target - nums[start])) return true;
  
  // Recursive call trying the case that nums[start] is not chosen.
  if (groupSum(start + 1, nums, target)) return true;
  
  // If neither of the above worked, it's not possible.
  return false;		
*/
