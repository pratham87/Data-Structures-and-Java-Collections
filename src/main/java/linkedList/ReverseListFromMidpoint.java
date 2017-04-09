package linkedList;

/*
  Write code to reverse a linked list from its mid point. So 1->2->3->4->5->6->7 becomes 1->2->3->7->6->5->4
  
  Algorithm:
  
  1. Move current to mid point.
  2. Reverse the rest of the list (by reversing the pointers)
  3. Then using temp, link the middle node to the prev (which point to the last node)
  4. This will reverse the list after midpoint.
  
 */

public class ReverseListFromMidpoint {

	Node head;

	public void reverse() {
		Node current = head;
		Node next = null, prev = null;

		Node temp = head;
		int len = 0;
		while (temp != null) {
			temp = temp.next;
			len++;
		}
		temp = head;

		System.out.println("\nLenght is: " + len);

		int i = 1;
		while (i++ <= (len / 2)) {
			if (i <= len / 2) {
				temp = temp.next;
			}
			current = current.next;
		}

		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}

		temp.next = prev;
	}

	public void print() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " --> ");
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		ReverseListFromMidpoint list = new ReverseListFromMidpoint();
		list.head = new Node(1);
		list.head.next = new Node(2);
		list.head.next.next = new Node(3);
		list.head.next.next.next = new Node(4);
		list.head.next.next.next.next = new Node(5);
		list.head.next.next.next.next.next = new Node(6);
		list.head.next.next.next.next.next.next = new Node(7);

		System.out.println("Before reversing: ");
		list.print();

		list.reverse();
		System.out.println("\nAfter reversing: ");
		list.print();

	}

}
