package linkedList;

public class ReverseListUsingRecursion {

	Node head;

	public Node reverse(Node current, Node prev) {

		if (current.next == null) {
			head = current;
			current.next = prev;
			return null;
		}

		Node temp = current.next;
		current.next = prev;
		reverse(temp, current);

		return head;
	}

	public void print(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " --> ");
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		ReverseListUsingRecursion llist = new ReverseListUsingRecursion();
		llist.head = new Node(1);
		llist.head.next = new Node(2);
		llist.head.next.next = new Node(3);
		llist.head.next.next.next = new Node(4);
		llist.head.next.next.next.next = new Node(5);

		System.out.println("Before reversing: ");
		llist.print(llist.head);

		Node node = llist.reverse(llist.head, null);
		System.out.println("\nAfter reversing: ");
		llist.print(node);
	}

}
