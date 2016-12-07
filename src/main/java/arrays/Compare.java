package arrays;

import java.util.Arrays;

public class Compare {

	public static String test(int[] arr1, int[] arr2) {
		if (arr1 == arr2) {
			return "Same";
		} else {
			return "Not Same";
		}
	}

	public static String compare(int[] arr1, int[] arr2) {
		if (Arrays.equals(arr1, arr2)) {
			return "Same";
		} else {
			return "Not Same";
		}
	}

	public static void main(String s[]) {
		int arr1[] = { 1, 2, 3 };
		int arr2[] = { 1, 2, 3 };

		System.out.println(arr1.equals(arr2));

		System.out.println(test(arr1, arr2));
		System.out.println(compare(arr1, arr2));

	}

}
