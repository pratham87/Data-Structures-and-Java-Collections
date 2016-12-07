package linkedList;

public class AddNode {

	Node head;

	public void add(Node node) {
		if (head == null || node.data < head.data) {
			node.next = head;
			head = node;
		}
		Node prev = head;

		while (prev.next != null && prev.data < node.data) {
			prev = prev.next;
		}

		node.next = prev.next;
		prev.next = node;

	}

	public void print() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " --> ");
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		AddNode list = new AddNode();
		list.head = new Node(1);
		list.head.next = new Node(4);

		list.add(new Node(2));

		list.print();

	}

}
