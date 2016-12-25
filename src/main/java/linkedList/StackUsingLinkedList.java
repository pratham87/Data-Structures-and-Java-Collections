package linkedList;

public class StackUsingLinkedList {

	Node head;
	int size = 0;

	public void push(Node node) {
		if (head == null) {
			head = node;
			size++;
		} else {
			node.next = head;
			head = node;
			size++;
		}
	}

	public void pop() {
		if (head == null) {
			System.out.println("Stack is empty");
		} else {
			head = head.next;
			size--;
		}
	}

	public void displayStack() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " --> ");
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		StackUsingLinkedList stack = new StackUsingLinkedList();

		System.out.println("Stack Push: ");
		stack.push(new Node(7));
		stack.displayStack();

		System.out.println("\n\nStack Push: ");
		stack.push(new Node(8));
		stack.displayStack();

		System.out.println("\n\nStack Pop: ");
		stack.pop();
		stack.displayStack();

		System.out.println("\n\nStack size: " + stack.size);

	}

}
