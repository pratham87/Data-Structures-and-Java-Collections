package arrays;

import java.util.HashMap;
import java.util.Map;

/*
Find if the array contains any duplicates. 

Algorithm:

1. Iterate through array and add elements to hashMap.
2. if (map.containsValue(nums[i])) before inserting the value, then return true. 
*/

public class ContainsAnyDuplicateUsingMap {
	public static boolean containsDuplicate(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		int len = nums.length;
		if (len == 0) {
			return false;
		}
		map.put(0, nums[0]);
		for (int i = 1; i < nums.length; i++) {
			if (map.containsValue(nums[i])) {
				return true;
			}
			map.put(i, nums[i]);
		}
		return false;

	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 1 };
		System.out.println(containsDuplicate(nums));

	}
}
