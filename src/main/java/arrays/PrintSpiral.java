package arrays;

public class PrintSpiral {
	static void spiralPrint(int re, int ce, int[][] a) {
		int i, rs = 0, cs = 0;

		while (rs < re && cs < ce) {
			/* Print the first row from the remaining rows */
			for (i = cs; i < ce; ++i) {
				System.out.print(a[rs][i]);
			}
			rs++;

			/* Print the last column from the remaining columns */
			for (i = rs; i < re; ++i) {
				System.out.print(a[i][ce - 1]);
			}
			ce--;

			/* Print the last row from the remaining rows */
			if (rs < re) {
				for (i = ce - 1; i >= cs; --i) {
					System.out.print(a[re - 1][i]);
				}
				re--;
			}

			/* Print the first column from the remaining columns */
			if (cs < ce) {
				for (i = re - 1; i >= rs; --i) {
					System.out.print(a[i][cs]);
				}
				cs++;
			}
		}
	}

	public static void main(String[] args) {
		int[][] nums = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 1, 2, 3 } };

		spiralPrint(3, 4, nums);

	}

}
