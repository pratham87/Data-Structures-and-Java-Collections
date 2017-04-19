package arrays;

import java.util.ArrayList;
import java.util.List;

/*
 Time Complexity: O(n*m)
 Space Complexity: O(1)
 
  Algorithm: Brute force
  
  1. Take two pointers to both arrays.
  2. Since arrays are sorted, move both the pointers simultaneously.
  3. Copy the elements that are equal. 
 */

public class FindIntersectionInPlace {

	public static List<Integer> findDup(int[] arr1, int[] arr2) {
		List<Integer> dups = new ArrayList<>();

		int i = 0, j = 0, len1 = arr1.length, len2 = arr2.length;

		while (i < len1 && j < len2) {

			if (arr1[i] == arr2[j]) {
				dups.add(arr1[i]);
				i++;
				j++;
			} else if (arr2[j] > arr1[i]) {
				i++;
			} else {
				j++;
			}
		}

		return dups;

	}

	public static void main(String[] s) {
		int[] arr1 = { 1, 2, 3, 4 };
		int[] arr2 = { 2, 3, 4, 6 };

		List<Integer> list = findDup(arr1, arr2);

		list.forEach(System.out::println);
	}

}
