package linkedList;

//Java program to detect loop in a linked list. Floyd’s Cycle detection algorithm
public class DetectLoopInSinglyList {

	Node head;

	public int detectLoop() {
		Node slow, fast;
		slow = head;
		fast = head;
		while (slow.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow.equals(fast)) {
				System.out.println("Loop found");
				return 1;
			}
		}
		System.out.println("No loop");
		return 0;
	}

	public static void main(String s[]) {
		DetectLoopInSinglyList list = new DetectLoopInSinglyList();
		list.head = new Node(1);
		list.head.next = new Node(2);
		list.head.next.next = new Node(3);
		
		list.head.next.next = list.head;

		list.detectLoop();
	}

}
