package binaryTree;

/*
 Time Complexity: O(n)
 Space Complexity: O(1)

 Algorithm:
 
 1. In BST, left node can have (root - 1) as max and right node can have (root + 1) as min in order to be a BST. 
 2. Pass the min and max to every node and check if any node violates the condition.
  
 */

public class CheckBinaryTreeForBST {

	Node root;

	public boolean isBST(Node node, int min, int max) {
		if (node == null) {
			return true;
		}

		if (node.key < min || node.key > max) {
			return false;
		}

		return isBST(node.left, min, node.key - 1) && isBST(node.right, node.key + 1, max);

	}

	public static void main(String[] args) {
		CheckBinaryTreeForBST tree = new CheckBinaryTreeForBST();
		tree.root = new Node(4);
		tree.root.left = new Node(3);
		tree.root.right = new Node(5);
		tree.root.right.right = new Node(6);
		tree.root.right.right.right = new Node(7);

		System.out.println(tree.isBST(tree.root, Integer.MIN_VALUE, Integer.MAX_VALUE));

	}

}
