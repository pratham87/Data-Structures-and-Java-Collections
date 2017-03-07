package stackProbs;

public class StackUsingArray {

	int top;
	int a[] = new int[10];

	public StackUsingArray() {
		top = -1;
	}

	public boolean isEmpty() {
		return (top < 0);
	}

	boolean push(int x) {
		if (top >= a.length) {
			System.out.println("Stack Overflow");
			return false;
		} else {
			a[++top] = x;
			return true;
		}
	}

	public int pop() {
		if (top < 0) {
			System.out.println("Stack Underflow");
			return 0;
		} else {
			return a[top--];
		}
	}

	public void printList() {
		System.out.println("List is:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static void main(String args[]) {
		StackUsingArray s = new StackUsingArray();

		s.push(20);
		s.push(30);

		System.out.println(s.pop() + " Popped from stack");

		s.push(10);
		s.push(50);

		s.printList();
	}

}
