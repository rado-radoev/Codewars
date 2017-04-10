//SIngleElementInSortedArray
//https://leetcode.com/submissions/detail/99705385/

public class SingleElementInSortedArray {

	public static void main(String[] args) {
		int[] nums = {3,3,7,7,10,11,11};
		singleNonDuplicate(nums);
	}
	
	public static int singleNonDuplicate(int[] nums) {
		return search3(nums, 0, nums.length - 1);
	}
	
	private static int search3(int[] nums, int low, int high) {
		if (low > high)
			return -1;
		
		if (low == high)
			return nums[low];
		
		int middle = (low + high) / 2;
		
		if (middle % 2 == 0) {
			if (nums[middle] == nums[middle + 1])
				return search3(nums, middle + 2, high);
			else
				return search3(nums, low, middle);
		}
		else {
			if (nums[middle] == nums[middle - 1])
				return search3(nums, middle + 1, high);
			else
				return search3(nums, low, middle -1);
		}
			
	}
	
	private static int search2(int[] nums, int low, int high) {
		// base check. If no single element is found
		if (low > high) {
			return -1; // no single elemnt was found
		}
		
		// if element was found
		if (low == high) {
			return nums[low];
		}
		
		
		// get the middle elemnt as a pivot point
		int mid = (low + high) / 2;
		
		// check if the middle element is even
		// if it is even then check the next element 
		// if the next elemnt is same as the middle the number is to the right
		// else the number is to the left;
		if (mid % 2 == 0) {	// if number is even
			if (nums[mid] == nums[mid + 1]) { // evaluate if mid and next number are the same
				return search2(nums, mid + 2, high); // if both number are the same, the number we are looking for is to the right. start from the next next number
			}
			else {
				return search2(nums, low, mid);	// else the number is to the left
			}
		}
		else {		// if the number is odd
			if (nums[mid] == nums[mid - 1]) {	// if number is equal to the preceding number
				return search2(nums, mid + 1, high);
			}
			else {
				return search2(nums, low, mid - 1);
			}
		}
	}
	
	private static int search(int[] nums, int low, int high) {
		// not found
		if (low > high) {
			return -1;
		}
		
		// single digit found
		if (low == high) {
			System.out.println(nums[low]);
			return nums[low];
		}

		// find middle of array as starting point
		int mid = (low + high) / 2;
		
		// if mid is even and next element is same as mid
		// the single digit lies on the right, else
		// the single digit lies on the left
		if (mid % 2 == 0) {
			if (nums[mid] == nums[mid + 1]) {	// checks if the element next to mid is the same
				return search(nums, mid + 2, high);	// if the element is the same the digit is to the right
			}
			else {
				return search(nums,low, mid);		// if the digit is not the same the digit is to the left
			}
		}
		else {		// if the mid is odd
			if (nums[mid] == nums[mid - 1])  {	// check if the element to the left is the same as the mid
				return search(nums, mid + 1 , high);	// starts to check from the previous element
			}
			else {
				return search(nums, low, mid - 1);
			}
		}
	}
		

}
