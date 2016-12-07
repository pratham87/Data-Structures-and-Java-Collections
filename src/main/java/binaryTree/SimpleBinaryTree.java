package binaryTree;

public class SimpleBinaryTree {
	Node root;

	public SimpleBinaryTree() {
		this.root = null;
	}

	public SimpleBinaryTree(int key) {
		this.root = new Node(key);
	}

	void inorderRec(Node root) {
		if (root != null) {
			inorderRec(root.left);
			System.out.print(root.key + " ");
			inorderRec(root.right);
		}
	}

	// Iterative method
	public void insert(int value) {
		Node temp = root;
		if (root == null) {
			root = new Node(value);
		}
		while (temp != null) {

			if (temp.key > value && temp.left == null) {
				temp.left = new Node(value);
				return;

			}

			if (temp.key < value && temp.right == null) {
				temp.right = new Node(value);
				return;

			}

			if (temp.key < value && temp.right != null) {
				temp = temp.right;

			} else {
				if (temp.key > value && temp.left != null) {
					temp = temp.left;

				}
			}
		}

	}

	// Recursion
	public void insertR(Node node, int value) {
		if (node == null) {
			node = new Node(value);
			return;
		}
		if (value < node.key) {
			insertR(node.left, value);
		} else {
			insertR(node.right, value);
		}

	}

	public static void main(String s[]) {
		SimpleBinaryTree tree = new SimpleBinaryTree();

		tree.root = new Node(2);
		tree.root.left = new Node(5);
		tree.root.right = new Node(3);

		tree.insert(1);
		tree.insert(7);

		tree.insertR(tree.root, 8);

		tree.inorderRec(tree.root);
	}
}
