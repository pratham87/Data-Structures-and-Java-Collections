package arrays;

import java.util.HashSet;
import java.util.Set;

/*
 Find if the array contains any duplicates. 
 
 Algorithm:
 
 1. Use Set to add elements.
 2. Set's add method will return false if the element already exists else it will return true and will add the element.
 */
public class ContainsAnyDuplicate {

	public static boolean containsDuplicate(int[] nums) {
		Set<Integer> set = new HashSet<Integer>();
		for (int num : nums) {
			if (!set.add(num)) {
				return true;
			}
		}

		return false;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 2 };
		System.out.println(containsDuplicate(nums));

	}

}
