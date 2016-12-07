package arrays;

//O(n + m)
public class CountNegativesInRowwiseColumnwiseSortedMatrix {

	public static int count(int[][] m) {
		int i = 0, j = m[0].length - 1, count = 0;

		while (j >= 0 && i < m.length - 1) {
			if (m[i][j] < 0) {
				count = count + j + 1;
				i++;
			} else {
				j--;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[][] arr = { { -3, -2, -1, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		System.out.println(count(arr));

	}

}
