package arrays;

import java.util.Arrays;
import java.util.Random;

public class RandomShuffle {

	public static void shuffle(int[] arr) {
		Random r = new Random();
		for (int i = arr.length - 1; i > 0; i--) {
			int j = r.nextInt(i);

			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}

		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		shuffle(new int[] { 4, 6, 3, 7, 1 });
	}

}
