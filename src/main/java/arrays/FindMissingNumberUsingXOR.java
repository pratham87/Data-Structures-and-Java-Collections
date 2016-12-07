package arrays;

public class FindMissingNumberUsingXOR {

	public static int find(int[] a) {
		int x1 = a[0];
		int x2 = 1;

		for (int i = 1; i < a.length; i++) {
			x1 = x1 ^ a[i];
		}

		for (int i = 2; i < a.length; i++) {
			x2 = x2 ^ i;
		}

		return x1 ^ x2;
	}

	public static void main(String[] args) {
		int[] a = { 5, 7, 8 };

		System.out.println(find(a));
	}

}
