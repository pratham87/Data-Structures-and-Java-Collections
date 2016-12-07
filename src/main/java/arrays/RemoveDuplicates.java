package arrays;

public class RemoveDuplicates {

	public static int removeDuplicates(int[] numbers) {
		int j = 1;
		for (int i = 1; i < numbers.length; i++) {
			if ((numbers[i] ^ numbers[i - 1]) != 0) {
				numbers[j] = numbers[i];
				j++;
			}
		}
		return j;
	}

	public static int removeDuplicatesT(int[] nums) {
		int i = 1;
		for (int j = 1; j < nums.length; ++j)
			if (nums[j] != nums[j - 1])
				nums[i++] = nums[j];
		return i;
	}

	public static void main(String[] args) {
		int[] array = { 1, 1, 1, 2, 2, 3 };

		System.out.println(removeDuplicates(array));

		System.out.println("Printing array:");

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}

	}

}
