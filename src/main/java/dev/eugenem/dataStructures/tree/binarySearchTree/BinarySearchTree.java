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
	public void insertation(int data) {

		if (root == null) {
			TreeNode newNode = new TreeNode(data, null, null);
			root = newNode;
		} else {
			this.helper(root, data);
		}

	}

	public void helper(TreeNode parent, int target) {

		TreeNode tree = parent;
		//if parent has left and right
		if (tree.left != null && tree.right != null) {
			if (target > parent.data) {
				helper(tree.right, target);
			} else {
				helper(tree.left, target);
			}
		// if parent has only left
		} else if (tree.left != null && tree.right == null) {
			if (target > tree.left.data) {
				TreeNode newNode = new TreeNode(target);
				tree.right = newNode;
			} else {
				helper(tree.left, target);
			}
		//if parent has only right
		} else if (tree.right != null && tree.left == null) {
			if (target < tree.right.data) {
				TreeNode newNode = new TreeNode(target);
				tree.left = newNode;
			} else {
				helper(tree.right, target);
			}
		//the parent is leaf with no left and no right
		} else {

			TreeNode newNode = new TreeNode(target);
			if (parent.data < target) {
				tree.right = newNode;
			} else {
				tree.left = newNode;
			}

		}
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
