package arrays;

/*
  Find index in an array such that sum of all elements on its left is equal to sum of all elements to its right. 
  Time complexity is O(n).
   
   Algorithm:
   
   1. Calculate sum of all elements.
   2. (sum - array[i]) / 2 will give the rightSum.
   3. Compare rightSum to leftsum and then return the equilibrium index.
 */
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
