package linkedList;

public class RemoveDuplicatesUsingTwoPointer {

	Node head;

	public void removeDuplicate() {
		Node prev = head;
		Node current = prev;

		while (prev != null) {
			if (current.next != null) {
				if (current.next.data == prev.data) {
					current.next = current.next.next;
					current = current.next;
				}
			}

			if (current != null) {
				current = current.next;
			}

			if (current == null) {
				prev = prev.next;
				current = prev;
			}

		}
	}

	public void print() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " --> ");
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		RemoveDuplicatesUsingTwoPointer list = new RemoveDuplicatesUsingTwoPointer();
		list.head = new Node(1);
		list.head.next = new Node(2);
		list.head.next.next = new Node(3);
		list.head.next.next.next = new Node(2);
		list.head.next.next.next.next = new Node(3);

		System.out.println("Before removing duplicates: ");

		list.print();

		list.removeDuplicate();

		System.out.println("\n\nAfter removing duplicates: ");

		list.print();
	}

}
