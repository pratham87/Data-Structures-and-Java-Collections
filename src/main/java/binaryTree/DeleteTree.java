package binaryTree;

public class DeleteTree {

	public static Node delete(Node node) {
		if (node != null) {
			Node left = delete(node.left);
			Node right = delete(node.right);

			if (left == null && right == null) {
				System.out.println("Deleting node: " + node.key);
				node = null;
				return node;
			}
		}

		return null;

	}

	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.right.left = new Node(5);
		root.right.right = new Node(6);

		delete(root);
	}

}
