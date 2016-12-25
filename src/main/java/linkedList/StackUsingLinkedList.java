package linkedList;

public class StackUsingLinkedList {

	Node head;

	public void push(Node node) {
		if (head == null) {
			head = node;
		} else {
			node.next = head;
			head = node;
		}
	}

	public void pop() {

	}

	public void getSize() {

	}

	public void displayStack() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " --> ");
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		StackUsingLinkedList list = new StackUsingLinkedList();
		list.head = new Node(1);
		list.head.next = new Node(2);
		list.head.next.next = new Node(3);
		list.head.next.next.next = new Node(4);
		list.head.next.next.next.next = new Node(5);

		System.out.println("Original List: ");
		list.displayStack();

		System.out.println("\n\nModified List: ");
		list.push(new Node(7));
		list.displayStack();
		
		System.out.println("\n\nModified List: ");
		list.push(new Node(8));
		list.displayStack();

	}

}
