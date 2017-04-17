package arrays;

public class ReverseWords {

	public static void reverseWords(char[] a) {
		reverseChars(a, 0, a.length - 1);

		int i = 0, j = 0;
		while (i < a.length - 1) {

			while (a[i] != ' ') {
				if (i != a.length - 1) {
					i++;
				} else {
					break;
				}

			}

			if (i == a.length - 1) {
				reverseChars(a, j, i);
				i++;
				j = i;
			}

			reverseChars(a, j, i - 1);
			i++;
			j = i;

		}

	}

	public static void reverseChars(char[] a, int i, int j) {
		while (i < j) {
			char temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i++;
			j--;
		}
	}

	public static void print(char[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static void main(String[] s) {
		char[] a = { 'h', 'i', ' ', 't', 'h', 'e', 'r', 'e', ' ', 'y', 'o', 'u' };
		System.out.println("Before reverse:");
		print(a);

		System.out.println("\n\nAfter reverse:");
		reverseWords(a);
		print(a);

	}

}
