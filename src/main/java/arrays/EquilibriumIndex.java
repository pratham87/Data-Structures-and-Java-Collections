package arrays;

/***
 * Equilibrium index of an array. Find index in an array such that sum of all
 * elements on its left is equal to sum of all elements to its right. Time
 * complexity is O(n)
 ***/
public class EquilibriumIndex {

	public static int equilibrium(int[] array) {
		int leftsum = array[0];
		int j = 0, sum = 0;
		int i = 1;

		while (j < array.length) {
			sum = sum + array[j++];
		}

		while (i < array.length - 1) {
			if ((sum - array[i]) / 2 == leftsum) {
				return i;
			}
			leftsum = leftsum + array[i++];
		}
		return -1;

	}

	public static void main(String[] args) {
		int[] array = { 1, 3, 0, 2, 2 };

		System.out.println(equilibrium(array));

	}

}
