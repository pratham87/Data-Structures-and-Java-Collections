package binaryTree;

public class LCA {

	Node root;

	public Node findLCA(int n1, int n2) {

		return findLCA(root, n1, n2);
	}

	public Node findLCA(Node root, int n1, int n2) {

		if (root == null) {
			return null;
		}

		if (root.key == n1 || root.key == n2) {
			return root;
		}

		Node left = findLCA(root.left, n1, n2);
		Node right = findLCA(root.right, n1, n2);

		if (left != null && right != null) {
			return root;
		}

		return (left != null) ? left : right; //return the node itself (as root) if other node is null
	}

	public static void main(String args[]) {
		LCA tree = new LCA();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);
		System.out.println("LCA(4, 5) = " + tree.findLCA(4, 5).key);
		System.out.println("LCA(4, 6) = " + tree.findLCA(4, 6).key);
		System.out.println("LCA(3, 4) = " + tree.findLCA(3, 4).key);
		System.out.println("LCA(2, 4) = " + tree.findLCA(2, 4).key);
	}

}
