package arrays;

import java.util.Stack;

/* 
Given a 2D array binaryMatrix of 0s and 1s, implement a function getNumberOfIslands that returns the number of islands of 1s in binaryMatrix.
An island is defined as a group of adjacent values that are all 1s. 
A cell in binaryMatrix is considered adjacent to another cell if they are next to each either on the same row or column. 
Note that two values of 1 are not part of the same island if they’re sharing only a mutual “corner” (i.e. they are diagonally neighbors).
 	0  1  0  1  0
        0  0  1  1  1
        1  0  0  1  0
        0  1  1  0  0
        1  0  1  0  1 
 */

public class FindIslandsUsingDFS {

	public static void islandCounter(int[][] a) {
		int m = a.length, n = a[0].length, islands = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i][j] == 1) {
					dfs(a, i, j, m, n);
					islands++;
				}
			}
		}

		System.out.println("Number of Islands are: " + islands);

	}

	public static void dfs(int[][] a, int i, int j, int m, int n) {
		Stack<int[]> s = new Stack<>();
		s.push(new int[] { i, j });

		while (!s.empty()) {
			int[] p = s.pop();
			int x = p[0], y = p[1];

			if (a[x][y] == 1) {
				a[x][y] = 2;

				pushValidPositions(s, x, y + 1, m, n);
				pushValidPositions(s, x - 1, y, m, n);
				pushValidPositions(s, x + 1, y, m, n);
				pushValidPositions(s, x, y - 1, m, n);

			}
		}

	}

	// Pushing positions manually
	public static void pushValidPositions(Stack<int[]> s, int x, int y, int m, int n) {
		if (x > 0 && x < m && y > 0 && y < n) {
			s.push(new int[] { x, y });
		}
	}

	public static void main(String[] args) {
		int[][] a = { { 0, 1, 0, 1, 0 }, { 0, 0, 1, 1, 1 }, { 1, 0, 0, 1, 0 }, { 0, 1, 1, 0, 0 }, { 1, 0, 1, 0, 1 } };
		islandCounter(a);

	}

}
