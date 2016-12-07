package arrays;

import java.util.Arrays;

public class Basic {
	public static void main(String s[]) {

		int[] array = { 1, 2, 3, 4 };
		int[] array2 = new int[4];
		int[] array3 = new int[] { 1, 2, 3, 4, 5, 6, 7 };

		int arr[] = new int[2];
		System.out.println(arr[0]);
		System.out.println(arr[1]);

		change(array);

		System.out.println("Printing array:");
		Arrays.stream(array).forEach(e -> System.out.print(e));
		System.out.println("\n" + array[1]);

		int i = 0;
		while (i < array3.length) {
			System.out.print(array3[i++]);
		}

	}

	public static void change(int[] z) {
		z = null;
	}
}
