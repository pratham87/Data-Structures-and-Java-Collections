package linkedList;

/*
    Algorithm:
   1. Keep pushing the temp pointer to find the position to insert x in the list
   2. Add the node outside the while loop
 */

public class AddNodeSortedList {
    Node head;

    public void addNode(int x) {
        Node node = head;
        Node newNode = new Node(x);
        if (head == null || head.data >= x) {
            newNode.next = head;
            head = newNode;
        } else {
            while (node.next != null && node.next.data < x) {
                node = node.next;
            }
            newNode.next = node.next;
            node.next = newNode;
        }
    }

    public void print() {
        Node node = head;
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        AddNodeSortedList list = new AddNodeSortedList();
        list.head = new Node(1);
        list.head.next = new Node(3);
        list.head.next.next = new Node(5);

        list.addNode(2);
        list.addNode(6);

        list.print();

    }
}
