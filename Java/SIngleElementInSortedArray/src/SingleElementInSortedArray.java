import javax.naming.directory.SearchControls;

//SIngleElementInSortedArray

public class SingleElementInSortedArray {

	public static void main(String[] args) {
		int[] nums = {1,1,2};
		System.out.println(singleNonDuplicate(nums));
	}
	
	public static int singleNonDuplicate(int[] nums) {
		int low = 0;
		int high = nums.length - 1;
		search(nums, low, high);
		return 0;
	}
	
	private static void search(int[] arr, int low, int high) {
		if (low > high) 
			return;
		
		if (low == high) {
			System.out.printf("The required elemnt is %d",arr[low] );
			return;
		}
		
		int mid = (low + high) / 2;
		
		if (mid % 2 == 0) {
			if (arr[mid] == arr[mid+1]){
				search(arr, mid + 2, high);
			}
			else {
				search(arr, low, mid);
			}
		}
		else {
			if (arr[mid] == arr[mid-1]) {
				search(arr, mid - 2, high);
			}
			else {
				search(arr, low, mid - 1);
			}
		}
	}

}
