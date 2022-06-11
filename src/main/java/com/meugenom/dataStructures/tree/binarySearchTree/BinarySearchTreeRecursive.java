package com.meugenom.dataStructures.tree.binarySearchTree;

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

	/**
	 * it's a recursive helper for insertation new value
	 * 
	 * @param node
	 * @param data
	 * @return node
	 */
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
	 * 
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

	/**
	 * find value
	 * 
	 * @param data
	 * @return true then value exists in the BST, return false then doesn't exist
	 */
	public boolean find(int data) {

		Boolean found = this.find(root, data);

		if (found)
			return true;

		return false;
	}

	/**
	 * recursive helper for finding value in the BST
	 * 
	 * @param node
	 * @param data
	 * @return true then exists and false then doesn't exist
	 */
	public boolean find(TreeNode node, int data) {

		if (node == null) {
			return false;

		} else if (node.data == data) {
			return true;

		} else if (node.data > data) {
			return find(node.left, data);

		} else {
			return find(node.right, data);
		}
	}

	/**
	 * delete node from the tree
	 * @param root
	 * @param target
	 * @return
	 */
	public TreeNode delete(TreeNode root, int target) {
		
		if (root == null)
			return root;
		
		if (target < root.data){
			root.left = delete(root.left, target);
		} else if (target > root.data) {
			root.right = delete(root.right, target);
		} else {
			if (root.left == null){
				return root.right;
			}

			if (root.right == null) {
				return root.left;
			}
				
			root.data = min(root.right);
			root.right = delete(root.right, root.data);
		}
		return root;
	}

	/**
	 * 
	 * @param root
	 * @return
	 */
	public int min(TreeNode root) {

		if (root.left == null){
			return root.data;
		
		} else {			
			return min(root.left);
		}
	}
}