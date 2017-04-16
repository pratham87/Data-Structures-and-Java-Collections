package arrays;

/*
 If an element in MxN matrix is 0 then set its entire row and col to 0.  
 
 Algorithm:
 
 1. Use row and col boolean array to find positions with 0's
 2. Then using those boolean arrays to set 0's in the matrix
 
 */

public class ZeroRowColumn {

	public static void findZeros(int[][] array) {
		boolean[] row = new boolean[array.length];
		boolean[] col = new boolean[array[0].length];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[i][j] == 0) {
					row[i] = true;
					col[j] = true;
				}
			}
		}

		for (int i = 0; i < row.length; i++) {
			if (row[i]) {
				for (int j = 0; j < array[i].length; j++) {
					array[i][j] = 0;
				}
			}
		}

		for (int i = 0; i < col.length; i++) {
			if (col[i]) {
				for (int j = 0; j < array.length; j++) {
					array[j][i] = 0;
				}
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
		findZeros(array);
		print(array);
	}

}
