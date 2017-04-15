package linkedList;

/*
Reverse in groups. Example: k = 3
Input:  1 --> 2 --> 3 --> 4 --> 5 --> 6 --> 7 --> 8 --> NULL
Output: 3 --> 2 --> 1 --> 6 --> 5 --> 4 --> 8 --> 7 --> NULL 

Algorithm:
 
 1. Reverse using recursion.
 2. Reverse list until k.
 3. Then check if there are more nodes (if (next != null)).
 3. Then link the end of the current sublist to start of next sublist.
 4. In the end, method returns prev of 1st reversed list which is the new head. 
 */

public class ReverseListInGroups {

	Node head;

	public Node reverse(Node head, int k) {
		Node temp = head;
		Node current = head;
		Node next = null;
		Node prev = null;

		int count = 0;

		while (count < k && current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
			count++;
		}

		if (next != null) {
			temp.next = reverse(next, k);
		}

		return prev;
	}

	public void print(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " --> ");
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		ReverseListInGroups llist = new ReverseListInGroups();

		llist.head = new Node(1);
		llist.head.next = new Node(2);
		llist.head.next.next = new Node(3);
		llist.head.next.next.next = new Node(4);
		llist.head.next.next.next.next = new Node(5);
		llist.head.next.next.next.next.next = new Node(6);
		llist.head.next.next.next.next.next.next = new Node(7);
		llist.head.next.next.next.next.next.next.next = new Node(8);

		System.out.println("Before reversing: ");
		llist.print(llist.head);

		Node node = llist.reverse(llist.head, 3);
		System.out.println("\nAfter reversing: ");
		llist.print(node);
	}

}
