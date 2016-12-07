package arrays;

public class FindMissingNumber {

	public static int missingNumber(int[] nums) {
		int n = nums.length;
		int sum = n * (n + 1) / 2;
		for (int num : nums) {
			sum -= num;
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] a = { 1, 3, 4 };

		System.out.println("Missing number is: " + missingNumber(a));

	}

}
