//SIngleElementInSortedArray
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SingleElementInSortedArray {

	public static void main(String[] args) {
		int[] nums = {1,1,2};
		System.out.println(singleNonDuplicate(nums));
	}
	
	public static int singleNonDuplicate(int[] nums) {
		HashMap<Integer, Boolean> myHash = new HashMap<Integer, Boolean>();
		Set<Map.Entry<Integer, Boolean>> entrySet = myHash.entrySet();
		
		for (int i = 0; i < nums.length; i++) {
			if (!myHash.containsKey(nums[i])) {
				myHash.put(nums[i], false);
			}
			else {
					
			}
		}
		
		for (Entry entry : entrySet) {
			if (!(boolean)entry.getValue()) {
				return (int)entry.getKey();
			}
		}
		return 0;
	}

}
