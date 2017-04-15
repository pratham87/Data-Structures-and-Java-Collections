package linkedList;

import java.util.HashMap;

/*
 Time Complexity: O(n)
 Space Complexity: O(n) 
 
 Algorithm:
 1. Using Two pointers, insert node's value in HashMap.
 2. If HashMap contains the node then delete the node. 
 
*/

public class RemoveDuplicateNodesUsingHashMap {

	Node head;

	public void removeDuplicate() {
		HashMap<Integer, Integer> map = new HashMap<>();

		Node prev = head;
		Node current = prev.next;

		map.put(head.data, 1);

		while (current != null) {

			if (!map.containsKey(current.data)) {
				map.put(current.data, 1);
				prev = current;
				current = current.next;
			} else {
				prev.next = current.next;
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
		RemoveDuplicateNodesUsingHashMap list = new RemoveDuplicateNodesUsingHashMap();
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
