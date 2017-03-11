package linkedList;

public class RemoveDuplicatesUsingTwoPointer {

	Node head;

	public void removeDuplicate() {
		if (head == null) {
			return;
		}

		Node prev = head;
		Node current = prev.next;

		while (current != null) {

			Node runner = head;

			// For consecutive 3 duplicate Nodes (1 -> 2 -> 2 -> 2)
			while (runner != current) {

				if (runner.data == current.data) {
					System.out.println("\nPrev is:" + prev.data);
					prev.next = current.next;
					current = current.next;
					break;
				}
				runner = runner.next;
			}

			if (runner == current) {
				prev = current;
				current = current.next;
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
		list.head.next.next = new Node(2);
		list.head.next.next.next = new Node(2);
		list.head.next.next.next.next = new Node(2);
		list.head.next.next.next.next.next = new Node(1);

		System.out.println("Before removing duplicates: ");

		list.print();

		list.removeDuplicate();

		System.out.println("\n\nAfter removing duplicates: ");

		list.print();
	}

}
