package linkedList;

//Java program to detect loop in a linked list. Floyd’s Cycle detection algorithm
/*
	Algorithm:
	1. Detect loop: Use slow pointer (1 node jump) and fast node (2 node jumps) until they meet

	Return the starting node of the loop:
	1. Once loop is detected, move slow pointer to head
	2. Keep moving the slow and fast pointer by single node until they meet.
	3. Reference: https://www.geeksforgeeks.org/detect-and-remove-loop-in-a-linked-list/
 */
public class DetectLoopInSinglyList {

	Node head;

	public Node detectLoop() {
		Node slow, fast;
		slow = head;
		fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow.equals(fast)) {
				System.out.println("Loop found");
				return loopNode(fast);
			}
		}
		System.out.println("No loop");
		return null;
	}

	public Node loopNode(Node fast){
		Node slow = head;
		while(slow.next != null && fast.next != null){
			slow = slow.next;
			fast = fast.next;
			if(slow.equals(fast)){
				return fast;
			}
		}
		return null;
	}


	public static void main(String s[]) {
		DetectLoopInSinglyList list = new DetectLoopInSinglyList();
		list.head = new Node(1);
		list.head.next = new Node(2);
		list.head.next.next = new Node(3);
		list.head.next.next.next = new Node(4);
		list.head.next.next.next.next = new Node(5);
		list.head.next.next.next.next.next = new Node(6);

		list.head.next.next.next.next.next = list.head.next.next; // Create the loop

		Node loopNode = list.detectLoop();
		System.out.println("Starting node is: " + loopNode.data);
	}

}
