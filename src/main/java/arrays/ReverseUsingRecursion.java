package arrays;

import java.util.Arrays;

public class ReverseUsingRecursion {

	static int[] array;

	public static void reverse(int i, int j) {

		if (i <= j) {
			int temp = array[i];
			array[i] = array[j];
			array[j] = temp;
			reverse(++i, --j);
		}
		return;
	}

	public static void main(String[] args) {
		array = new int[] { 1, 2, 3, 4, 5 };
		System.out.println("Original Array: " + Arrays.toString(array));
		reverse(0, array.length - 1);
		System.out.println("Reversed Array: " + Arrays.toString(array));
	}

}
