package linkedList;

class ReverseLinkedList {
	Node head;

	public void reverse() {
		Node prev = null;
		Node current = head;
		Node next = null;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
	}

	public void print() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " --> ");
			temp = temp.next;
		}
	}

	public static void main(String args[]) {
		ReverseLinkedList llist = new ReverseLinkedList();

		llist.head = new Node(1);
		llist.head.next = new Node(2);
		llist.head.next.next = new Node(3);

		llist.reverse();

		llist.print();

	}
}