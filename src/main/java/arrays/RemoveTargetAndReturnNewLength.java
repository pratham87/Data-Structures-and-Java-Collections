package arrays;

/**
 * Given an array and a value, remove all instances of that value in place and
 * return the new length.
 * 
 * Do not allocate extra space for another array, you must do this in place with
 * constant memory.
 * 
 * The order of elements can be changed. It doesn't matter what you leave beyond
 * the new length.
 * 
 * Example: Given input array nums = [3,2,2,3], val = 3
 * 
 * Your function should return length = 2, with the first two elements of nums
 * being 2.
 ***/
public class RemoveTargetAndReturnNewLength {

	public static int removeElement(int[] nums, int val) {
		int i = 0, j = nums.length - 1;
		if (nums.length == 0 || nums.length == 1 && nums[0] == val) {
			return 0;
		}

		while (i < j) {

			if (nums[i] == val && nums[j] != val) {
				if (nums[i] == val) {
					nums[i] = nums[j];
					nums[j--] = val;
				}
			}
			if (nums[i] == val && nums[j] == val) {
				j--;
			} else {
				i++;
			}

		}

		return j;

	}

	public static int removeElementT(int[] nums, int val) {
		if (nums.length == 0)
			return 0;
		int length = nums.length;
		int i = 0;
		while (i < length) {
			if (nums[i] == val && nums[length - 1] != val) {
				nums[i] = nums[length - 1];
				nums[length - 1] = val;
			} else if (nums[i] == val && nums[length - 1] == val) {
				length -= 1;
			} else {
				i += 1;
			}
		}
		return length;
	}

	public static void main(String[] args) {
		int[] nums = { 3 };
		System.out.println(removeElementT(nums, 2));

		System.out.println("Printing array");

		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]);
		}
	}

}
