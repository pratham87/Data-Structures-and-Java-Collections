package linkedList;

public class FindnthNodeFromTheEndUsingLength {

	Node head;

	// len - n + 1
	public void findNode(int n) {
		int len = 0;
		Node temp = head;

		while (temp != null) {
			temp = temp.next;
			len++;
		}

		if (n > len || n < 0) {
			System.out.println("Not a valid Node");
			return;
		}

		temp = head;
		int i = 1;

		while (i < (len - n + 1)) {
			temp = temp.next;
			i++;
		}

		System.out.println(temp.data);
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

		FindnthNodeFromTheEndUsingLength list = new FindnthNodeFromTheEndUsingLength();
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
