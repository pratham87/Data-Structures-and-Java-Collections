package stackProbs;

public class TwoStacksInOneArray {

	int[] array;
	int top1;
	int top2;

	public TwoStacksInOneArray(int n) {
		array = new int[n];
		top1 = -1;
		top2 = n;
	}

	public void push1(int x) {
		if (top2 - top1 > 1) {
			array[++top1] = x;
		} else {
			System.out.println("Stack1 Overflow");
			return;
		}
	}

	public void push2(int x) {
		if (top2 - top1 > 1) {
			array[--top2] = x;
		} else {
			System.out.println("Stack2 Overflow");
			return;
		}
	}

	public void pop1() {
		if (top1 >= 0) {
			System.out.println(array[top1] + " is popped");
			array[top1] = 0;
			top1--;
		} else {
			System.out.println("Stack Underflow");
			return;
		}
	}

	public void pop2() {
		if (top2 < array.length) {
			System.out.println(array[top2] + " is popped");
			array[top2] = 0;
			top2++;
		} else {
			System.out.println("Stack Underflow");
			return;
		}
	}

	public void printArray() {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	public static void main(String[] args) {
		TwoStacksInOneArray t = new TwoStacksInOneArray(6);
		t.push1(10);
		t.push2(20);
		t.push1(30);
		t.push2(40);

		System.out.println("After push:");

		t.printArray();

		System.out.println("\n\nAfter pop:");

		t.pop1();
		t.pop2();
		t.printArray();

	}

}
