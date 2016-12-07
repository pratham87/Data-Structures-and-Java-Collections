package arrays;

public class FindDuplicateNumber {

	// O(1)
	public static int findDuplicate(int[] a) {
		int n = a.length - 1;

		int sum = n * (n + 1) / 2;

		return getSum(a) - sum;

	}

	// O(n)
	public static int getSum(int[] a) {

		int sum = 0;
		for (int num : a) {
			sum += num;
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 2 };
		System.out.println(findDuplicate(a));
	}

}
