package linkedList;

/*
 Algorithm:
 
 1. Reverse the direction of the pointers. (1 <-- 2 <-- 3)
 2. current and next keeps track of the nodes, prev reverses the pointer to previous node.
 */

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
		llist.head.next.next.next = new Node(4);
		llist.head.next.next.next.next = new Node(5);

		llist.reverse();

		llist.print();

	}
}