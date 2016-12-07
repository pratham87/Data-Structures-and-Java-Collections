package arrays;

import java.util.Arrays;

//Given a list of unordered numbers, what would be the best algorithm to find the n largest numbers.
public class FindLargestNumber {

	public static void main(String[] args) {
		int[] numbers = { 4, 1, 8, 5, 0, 4, 2 };
		Arrays.sort(numbers);

		System.out.println(numbers[numbers.length - 1]);
	}
}
