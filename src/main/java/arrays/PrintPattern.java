package arrays;

import java.util.Arrays;
import java.util.List;

/*
 Question: list: a b c d e f g. colums: x
 
 Correct:   Wrong:   Wrong:
 a d f      a b c    a d g 
 b e g      d e f    b e   
 c          g        c f   

 Algorithm:
 1. For even number chars: Print in alternate pattern.
 2. For odd number chars: Decide how many chars should be written to last row.
 */

public class PrintPattern {

	public static void print(int cols, List<Character> list) {
		int size = list.size();
		int rows = size % cols == 0 ? size / cols : (size / cols) + 1;
		char[][] result = new char[rows][cols];
		int i = 0, j = 0, count = 0, end = 0;
		while (j < result[0].length && count < size) {
			while (i < result.length && count < size) {

				// Below if block decides how many chars to print in last row.
				if (size % cols != 0 && i == result.length - 1) {
					
					//7 % 3 = 1, 8 % 3 = 2. end keeps track of how many times to write to last row.
					if (end++ < size % cols) {
						result[i][j] = list.get(count++);
					}
					i++;
				} else {
					result[i++][j] = list.get(count++);
				}
			}
			j++;
			i = 0;
		}

		for (int k = 0; k < result.length; k++) {
			for (int k2 = 0; k2 < result[0].length; k2++) {
				System.out.print(result[k][k2] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		print(3, Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'));

	}

}
