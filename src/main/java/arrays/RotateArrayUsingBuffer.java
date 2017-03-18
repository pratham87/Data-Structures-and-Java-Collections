package arrays;

/*

Time Complexity: O(n)
Space Complexity: O(n)

* */

public class RotateArrayUsingBuffer {

	// Clockwise rotation
	public static void rotateClockwise(int[] array, int k) {
		int[] buffer = new int[array.length];
		int size = array.length;

		if (k > size) {
			System.out.println("Invalid rotation");
			return;
		}

		int j = 0;
		for (int i = k; i < size; i++) {
			buffer[j++] = array[i];
		}

		for (int i = 0; i < k; i++) {
			buffer[size - k + i] = array[i];
		}

		printArray(buffer);

	}

	// AntiClockwise rotation
	public static void rotateAntiClockwise(int[] array, int k) {
		int size = array.length;

		if (k > size) {
			System.out.println("Invalid rotation");
			return;
		}

		int[] result = new int[size];

		for (int i = 0; i < k; i++) {
			result[i] = array[size - k + i];
		}

		int j = 0;
		for (int i = k; i < size; i++) {
			result[i] = array[j];
			j++;
		}

		System.arraycopy(result, 0, array, 0, size);

		printArray(array);

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

		System.out.println("\n\nClockwise rotation:");

		rotateClockwise(array, k);

		System.out.println("\n\nAntiClockwise rotation:");

		rotateAntiClockwise(array, k);
	}

}
