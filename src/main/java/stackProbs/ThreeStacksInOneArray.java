package stackProbs;

/*
 Question: Implements 3 stacks in one Array.
 
 Algorithm: Divide the array in 3 parts for each stack.
 */

public class ThreeStacksInOneArray {
	int top1;
	int top2;
	int top3;
	int[] arr;
	int n;

	public ThreeStacksInOneArray(int[] arr) {
		this.arr = arr;
		this.n = arr.length;
		top1 = -1;
		top2 = (n / 3) - 1;
		top3 = (2 * n / 3) - 1;
	}

	public void push(int stackNum, int value) {
		if (stackNum == 1) {
			pushData(++top1, n / 3 - 1, value, stackNum);
		} else if (stackNum == 2) {
			pushData(++top2, 2 * n / 3 - 1, value, stackNum);
		} else if (stackNum == 3 && top3 <= n - 1) {
			pushData(++top3, n - 1, value, stackNum);
		}
	}

	public void pushData(int top, int high, int value, int stackNum) {
		if (top <= high) {
			arr[top] = value;
		} else if (top > high) {
			System.out.println("Stack " + stackNum + " Overflow");
		}
	}

	public void pop(int stackNum) {
		if (stackNum == 1) {
			popData(top1--, 0, stackNum);
		} else if (stackNum == 2) {
			popData(top2--, n / 3, stackNum);
		} else if (stackNum == 3) {
			popData(top3--, 2 * n / 3, stackNum);
		}
	}

	public void popData(int top, int low, int stackNum) {
		if (top >= low) {
			arr[top] = 0;
		} else if (top < low) {
			System.out.println("Stack " + stackNum + " Underflow");
		}
	}

	public void print() {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		int[] arr = new int[6];
		ThreeStacksInOneArray stack = new ThreeStacksInOneArray(arr);
		stack.push(1, 4);
		stack.push(1, 5);
		stack.pop(1);

		stack.push(2, 6);
		stack.push(2, 7);
		stack.pop(2);

		stack.push(3, 8);
		stack.push(3, 9);
		stack.pop(3);

		stack.print();
	}
}
