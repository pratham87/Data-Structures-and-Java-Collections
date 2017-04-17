package arrays;

/*
 Rotate Matrix Anticlockwise.
 
 Algorithm:
 
 1. Rotate the outer layer first and then move inwards.
 2. Copy the first element in temp and then copy the rest on new positions.
 3. Solve for 2x2 first, then modify the code to solve 3x3 and then 4x4.
 */

public class RotateMatrix {

	public static void rotateMat(int[][] a) {
		int n = a.length;
		for (int i = 0; i < n / 2; i++) {
			for (int j = i; j < n - 1 - i; j++) {

				int temp = a[i][j];

				a[i][j] = a[j][n - 1 - i];

				a[j][n - 1 - i] = a[n - 1 - i][n - 1 - j];

				a[n - 1 - i][n - 1 - j] = a[n - 1 - j][i];

				a[n - 1 - j][i] = temp;
			}
		}
	}

	public static void print(int[][] nums) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();

		}
	}

	public static void main(String[] args) {
		int[][] array = { { 1, 0, 3, 4 }, { 5, 6, 7, 8 }, { 9, 1, 2, 3 }, { 5, 7, 6, 4 } };
		// int[][] array = { { 1, 2 }, { 3, 4 } };
		// int[][] array = { { 1, 2, 3 }, { 5, 3, 4 }, { 7, 8, 9 } };

		System.out.println("Before rotating:");
		print(array);

		System.out.println("\nAfter rotating:");
		rotateMat(array);
		print(array);

	}

}
