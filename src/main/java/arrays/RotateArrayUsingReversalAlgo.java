package arrays;

/*

Time Complexity: O(n)
Space Complexity: O(1)

Algorithm:
1. Divide the array two parts: 1,2,3,4 and 5, 6
2. Reverse first part: 4,3,2,1,5,6
3. Reverse second part: 4,3,2,1,6,5
4. Reverse the whole array: 5,6,1,2,3,4

* */
public class RotateArrayUsingReversalAlgo {

	public static void rotate(int[] array, int k) {

		int size = array.length;

		if (array == null || size == 0 || k < 0) {
			throw new IllegalArgumentException("Illegal argument");
		}

		// length of first part
		int a = size - k;

		reverse(array, 0, a - 1);
		reverse(array, a, array.length - 1);
		reverse(array, 0, array.length - 1);

	}

	public static void reverse(int[] array, int left, int right) {
		if (array == null || array.length == 1)
			return;

		while (left < right) {
			int temp = array[left];
			array[left] = array[right];
			array[right] = temp;
			left++;
			right--;
		}
	}

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6 };
		int k = 2;

		System.out.println("Original Array:");

		printArray(array);

		System.out.println("\n\nAfter rotation:");

		rotate(array, k);
		printArray(array);
	}
}
