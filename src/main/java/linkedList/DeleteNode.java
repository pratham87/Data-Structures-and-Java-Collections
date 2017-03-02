package linkedList;

public class DeleteNode {

	Node head;
	Node temp = head;

	public void deleteNode(int position) {

		if (head == null) {
			return;
		}

		// Position 0 is head
		if (position == 0) {
			head = temp.next;
			return;
		}

		for (int i = 0; i < position; i++) {
			temp = temp.next;
		}

		if (temp == null || temp.next == null) {
			return;
		}
		
		Node next = temp.next.next;
		temp.next = next; 

	}

	public void print() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " --> ");
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		DeleteNode list = new DeleteNode();
		list.head = new Node(1);
		list.head.next = new Node(2);
		list.head.next.next = new Node(3);
		list.head.next.next.next = new Node(4);
		
		System.out.println("Before deleting the Node:");
		list.print();
		
		list.deleteNode(3);
		
		System.out.println("After deleting the Node:");
		list.print();
	}

}
