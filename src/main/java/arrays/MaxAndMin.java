package arrays;

public class MaxAndMin {
	static int max;
	static int index;

	public static int findMax(int[] array) {
		max = array[0];

		for (int i = 0; i < array.length - 1; i++) {
			if (max < array[i + 1]) {
				max = array[i + 1];
				index = i+2;
			}
		}
		return max;
	}

	public static void main(String s[]) {
		int[] array = new int[] { 5, 4, 99, 110, 8, 9, 109, 10 };

		System.out.println(findMax(array));
		System.out.println("Index of the max element is: " + index);
	}
}
