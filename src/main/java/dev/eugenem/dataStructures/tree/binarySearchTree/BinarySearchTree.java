package dev.eugenem.dataStructures.tree.binarySearchTree;


public class BinarySearchTree {

	public TreeNode root;
	public String out;

	public BinarySearchTree() {
		root = null;
		out = "";
	}

	/**
	 * insert new value in to BST
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

	public boolean find(int data){
		
		
		return false;
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
