package binaryTree;

/*
Inorder: Print leftmost, node then right node (Slide down) - LNR
Preorder: Node, left and right (First Parent then child) - NLR
Postorder: leftmost, right , node (First child then parent) - LRN
**/

public class Traversals {

	Node root;

	Traversals() {
		root = null;
	}

	public void inorder(Node node) {
		if (node == null) {
			return;
		}
		inorder(node.left);
		System.out.print(node.key + " ");
		inorder(node.right);
	}

	void preorder(Node node) {
		if (node == null) {
			return;
		}
		System.out.print(node.key + " ");
		preorder(node.left);
		preorder(node.right);
	}

	public void postorder(Node node) {
		if (node == null) {
			return;
		}
		postorder(node.left);
		postorder(node.right);
		System.out.print(node.key + " ");
	}

	void printPostorder() {
		postorder(root);
	}

	void printInorder() {
		inorder(root);
	}

	void printPreorder() {
		preorder(root);
	}

	public static void main(String[] args) {
		Traversals tree = new Traversals();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.left.left = new Node(6);
		tree.root.left.right = new Node(8);
		tree.root.right = new Node(3);
		tree.root.right.left = new Node(7);
		tree.root.right.right = new Node(4);
		tree.root.right.right.left = new Node(9);
		tree.root.right.right.right = new Node(5);

		System.out.println("Preorder traversal of binary tree is ");
		tree.printPreorder();

		System.out.println("\nInorder traversal of binary tree is ");
		tree.printInorder();

		System.out.println("\nPostorder traversal of binary tree is ");
		tree.printPostorder();

	}
}
