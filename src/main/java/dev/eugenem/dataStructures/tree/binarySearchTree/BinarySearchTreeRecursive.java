package dev.eugenem.dataStructures.tree.binarySearchTree;

public class BinarySearchTreeRecursive {

	public TreeNode root;
	public String out;

	public BinarySearchTreeRecursive() {
		root = null;
		out = "";
	}

	/**
	 * insert new value in to BST
	 * 
	 * @param data
	 */
	public void insert(int data) {
		this.root = this.insert(root, data);
	}

	private TreeNode insert(TreeNode node, int data) {

		if (node == null) {
			node = new TreeNode(data);
		} else if (node.data > data) {
			node.left = insert(node.left, data);
		} else if (node.data < data) {
			node.right = insert(node.right, data);
		}
		return node;
	}

	public boolean find(int data) {

		return false;
	}

	/**
	 * nlr print or preOrder print
	 * 
	 * @param node
	 */
	public void preOrderPrintRecursive(TreeNode node) {

		System.out.print(" " + node.data); // record root

		if (node.left != null)
			this.preOrderPrintRecursive(node.left); // traverse left

		if (node.right != null)
			this.preOrderPrintRecursive(node.right); // traverse right
	}

	/**
	 * lnr print or inOrder print
	 * 
	 * @param node
	 */
	public void inOrderPrintRecursive(TreeNode node) {

		if (node.left != null) {
			this.inOrderPrintRecursive(node.left); // traverse left
		}

		System.out.print(" " + node.data); // record root

		if (node.right != null) {
			this.inOrderPrintRecursive(node.right); // traverse right
		}

	}

	/**
	 * lrn print or postOrder print
	 * 
	 * @param node
	 */
	public void postOrderPrintRecursive(TreeNode node) {

		if (node.left != null) {
			this.postOrderPrintRecursive(node.left); // traverse left
		}

		if (node.right != null) {
			this.postOrderPrintRecursive(node.right); // traverse right
		}

		System.out.print(" " + node.data); // record root
	}

	/**
	 * print parent-childs nodes
	 * @param parent TreeNode
	 */
	public void print(TreeNode parent) {

		TreeNode tree = parent;

		String left = tree.left != null ? String.valueOf(tree.left.data) : "null";
		String right = tree.right != null ? String.valueOf(tree.right.data) : "null";

		if (tree.left != null) {

			out = out + "[" + parent.data + "->(" + left + ")]";
			print(tree.left);
		}
		if (tree.right != null) {

			out = out + "[" + parent.data + "->(" + right + ")]";
			print(tree.right);
		}
	}
}
