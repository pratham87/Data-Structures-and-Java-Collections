package arrays;

/**
 * Given an array of integers that is already sorted in ascending order, find
 * two numbers such that they add up to a specific target number.
 * 
 * The function twoSum should return indices of the two numbers such that they
 * add up to the target, where index1 must be less than index2. Please note that
 * your returned answers (both index1 and index2) are not zero-based.
 * 
 * You may assume that each input would have exactly one solution.
 * 
 * Input: numbers={2, 7, 11, 15}, target=9 Output: index1=1, index2=2
 **/
public class FindNumbersSummingToTarget {

	// Using 2 pointer technique
	public static int[] twoSum(int[] numbers, int target) {
		int i = 0;
		int j = numbers.length - 1;

		while (i < j) {
			if (numbers[i] + numbers[j] == target) {
				return new int[] { i + 1, j + 1 };
			}

			if (numbers[i] + numbers[j] < target) {
				i++;
			} else {
				j--;
			}
		}
		return new int[2];
	}

	// https://discuss.leetcode.com/topic/7465/a-less-efficient-way-binary-search
	public static int[] twoSumTest(int[] numbers, int target) {
		for (int i = 0; i < numbers.length; i++) {
			int l = i + 1, r = numbers.length - 1;
			int gap = target - numbers[i];

			while (l <= r) {
				int m = l + (r - l) / 2;
				if (numbers[m] == gap) {
					return new int[] { i + 1, m + 1 };
				}
				if (gap < numbers[m]) {
					r = m - 1;

				} else {
					l = m + 1;
				}
			}
		}
		return new int[2];
	}

	public static void main(String[] args) {
		int[] numbers = { 2, 4, 6, 8, 10, 11 };

		System.out.println(twoSum(numbers, 12)[0]);
		System.out.println(twoSum(numbers, 12)[1]);

		System.out.println(twoSumTest(numbers, 12)[0]);
		System.out.println(twoSumTest(numbers, 12)[1]);

	}

}
