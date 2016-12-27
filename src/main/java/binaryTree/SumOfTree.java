package binaryTree;

public class SumOfTree {
	static Node root;
	static int sum = 0;

	public static int sum(Node node) {

		if (node == null) {
			return 0;
		}

		if (node.left == null && node.right == null) {
			return sum + node.key;
		}

		if (node.left != null || node.right != null) {
			return sum + sum(node.left) + sum(node.right) + node.key;
		}

		return sum;

	}

	public static void main(String[] args) {
		root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.right.right = new Node(4);

		System.out.println("Sum is: " + sum(root));

	}

}
