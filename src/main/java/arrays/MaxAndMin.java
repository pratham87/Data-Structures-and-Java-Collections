package arrays;

import java.util.Arrays;
import java.util.List;

public class MaxAndMin {

	public static List<Integer> findMaxMin(int[] array) {
		int max = array[0];
		int min = array[0];

		for (int i = 1; i < array.length - 1; i++) {
			if (max < array[i]) {
				max = array[i];
			} else if (min > array[i]) {
				min = array[i];
			}
		}
		return Arrays.asList(min, max);
	}

	public static void main(String s[]) {
		int[] array = new int[] { 5, 4, 99, 110, 8, 9, 109, 10 };

		System.out.println("Min: " + findMaxMin(array).get(0));
		System.out.println("Max: " + findMaxMin(array).get(1));
	}
}
