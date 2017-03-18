package arrays;

public class RotateArrayUsingBubbleRotate {

	public static void rotate(int[] array, int k) {
		int size = array.length;

		if (k > size) {
			System.out.println("Invalid rotation");
			return;
		}

		for (int i = 0; i < k; i++) {

			for (int j = size - 1; j > 0; j--) {
				int temp = array[j];
				array[j] = array[j - 1];
				array[j - 1] = temp;
			}
		}
	}

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		int k = 2;

		System.out.println("Original Array:");

		printArray(array);

		System.out.println("\n\nAfter rotation:");

		rotate(array, k);
		printArray(array);
	}
}
