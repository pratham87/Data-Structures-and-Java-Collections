package arrays;

public class SearchKeyInRowwiseColumnwiseSortedMatrix {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		System.out.println(traverseAll(arr, 5));
		System.out.println(find(arr, 5));
	}

	public static int find(int[][] a, int key) {
		int i = 0, j = a[0].length - 1;
		while (i < a.length && j >= 0) {
			if (a[i][j] == key) {
				System.out.println("Key found at location " + i + " " + j);
				return 1;
			}

			if (key > a[i][j]) {
				i++;
			} else {
				j--;
			}

		}
		return -1;
	}

	public static int traverseAll(int[][] a, int key) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i][j] == key) {
					return 1;
				}
			}

		}
		return -1;
	}

}
