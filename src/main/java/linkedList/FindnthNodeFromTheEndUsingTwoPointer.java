package linkedList;

/***
 * First move current pointer to n nodes from head. Now move both pointers one
 * by one until current pointer reaches end. Now prev pointer will point to nth
 * node from the end. Return prev pointer.
 * 
 * Main idea: Create the gap between two pointers and then move that window from
 * the start to get the nth node.
 * 
 */

public class FindnthNodeFromTheEndUsingTwoPointer {

	Node head;

	public void findNode(int n) {
		Node prev = head;
		Node current = head;
		int count = 0;

		if (n < 1 || head == null) {
			System.out.println("Not a valid Node");
			return;
		}

		while (count < n) {
			if (current == null) {
				System.out.println("Not a valid Node");
				return;
			}
			current = current.next;
			count++;
		}

		while (current != null) {
			prev = prev.next;
			current = current.next;
		}

		System.out.println(prev.data);
	}

	public void print() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " --> ");
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		int n = 4;

		FindnthNodeFromTheEndUsingTwoPointer list = new FindnthNodeFromTheEndUsingTwoPointer();
		list.head = new Node(1);
		list.head.next = new Node(2);
		list.head.next.next = new Node(3);
		list.head.next.next.next = new Node(4);
		list.head.next.next.next.next = new Node(5);

		list.print();

		System.out.println("\n\nNode " + n + " from the end of the list is:");

		list.findNode(n);
	}

}
