package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 Time Complexity: O(n)
 Space Complexity: O(m)
 
  Algorithm: Using hashMap
  
  1. Put all the elements in hashMap.
  2.If hashMap contains the value then add to the list.
  3. Return the list with all duplicate values.
 */

public class FindIntersectionUsingMap {

	public static List<Integer> findDups(int[] arr1, int[] arr2) {
		int i = 0, len2 = arr2.length;
		List<Integer> list = new ArrayList<>();

		Map<Integer, Integer> map = new HashMap<>();

		if (arr1 == null || arr2 == null || arr1.length == 0 || arr2.length == 0) {
			return null;
		}

		for (int j : arr1) {
			map.put(i++, j);
		}

		i = 0;
		while (i <= len2 - 1) {
			if (map.containsValue(arr2[i])) {
				list.add(arr2[i]);
			}
			i++;
		}

		return list;

	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4 };
		int[] arr2 = { 2, 3, 4, 5 };

		List<Integer> list = findDups(arr1, arr2);

		list.forEach(System.out::println);
	}

}
