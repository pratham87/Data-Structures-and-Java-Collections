package arrays;

//Find from a list of numbers where each number is repeating even number of times except one. Find that number ?
public class FindNonRepeatingNumber {

	public static void main(String s[]) {

		int[] array = { 1, 1, 5, 5, 6, 7, 7 };
		int t = array[1];

		for (int i = 1; i < array.length; i++) {
			t = t ^ array[i];
		}

		System.out.println(t);
	}

}
