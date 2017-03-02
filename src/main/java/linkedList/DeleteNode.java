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

	}

	public void print() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " --> ");
			temp = temp.next;
		}
	}

	public static void main(String[] args) {

	}

}
