package linkedList;

/*
Question: Partitioning a linked list around a given value and keeping the original order
Input : 1->4->3->2->5->2->3,
        x = 3
Output: 1->2->2->3->3->4->5

    Algorithm: O(3n) = O(n)

    1. Iteration-1: Look for data < x and write to new list
    2. Iteration-2: Look for data == x and write to new list
    3. Iteration-3: Look for data > x and write to new list

 */

public class Partition {
    Node head;
    Node newHead = null;

    public Node partition(int x) {
        Node temp2 = null;

        temp2 = getData(head, temp2, x, "less");

        temp2 = getData(head, temp2, x, "equal");

        getData(head, temp2, x, "greater");

        return newHead;
    }

    public Node getData(Node head, Node temp2, int x, String op) {
        Node temp = head;
        while (temp != null) {
            boolean v = getValue(temp.data, x, op);
            if (v && newHead == null) {
                newHead = new Node(temp.data);
                temp2 = newHead;
            } else if (v) {
                temp2.next = new Node(temp.data);
                temp2 = temp2.next;
            }
            temp = temp.next;
        }
        return temp2;
    }

    public boolean getValue(int x, int y, String op) {
        if (op == "less") {
            return x < y;
        } else if (op == "equal") {
            return x == y;
        } else if (op == "greater") {
            return x > y;
        }

        return true;
    }

    public void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }


    public static void main(String s[]) {
        Partition list = new Partition();
        list.head = new Node(1);
        list.head.next = new Node(4);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(2);
        list.head.next.next.next.next = new Node(5);
        list.head.next.next.next.next.next = new Node(2);
        list.head.next.next.next.next.next.next = new Node(3);

        Node newHead = list.partition(3);
        list.print(newHead);

    }
}
