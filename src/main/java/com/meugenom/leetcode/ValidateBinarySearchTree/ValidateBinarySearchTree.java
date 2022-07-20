package com.meugenom.leetcode.ValidateBinarySearchTree;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode() {
	}

	TreeNode(int val) {
		this.val = val;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}

class Node {
	long max, min;
	boolean bst;

	Node() {
	}

	Node(boolean bst, long min, long max) {
		this.bst = bst;
		this.min = min;
		this.max = max;
	}
}

public class ValidateBinarySearchTree {

	public static boolean isValidBST(TreeNode root) {
		Node temp = ValidBST(root);
		return temp.bst;
	}

	public static Node ValidBST(TreeNode root) {
		if (root == null) {
			return new Node(true, Long.MAX_VALUE, Long.MIN_VALUE);
		}

		Node left = ValidBST(root.left);
		Node right = ValidBST(root.right);

		Node temp = new Node();
		if (left.bst == true && right.bst == true && left.max < root.val && right.min > root.val)
			temp.bst = true;

		temp.min = left.min > root.val ? root.val : left.min;
		temp.max = right.max < root.val ? root.val : right.max;

		return temp;
	}

	public static void main(String[] args) {

		// TreeNode a = new TreeNode(2);
		// TreeNode b = new TreeNode(1);
		// TreeNode c = new TreeNode(3);

		// a.left = b;
		// a.right = c;

		// System.out.println(isValidBST(a)); //true

		// [5,4,6,null,null,3,7]
		TreeNode a = new TreeNode(5);
		TreeNode b = new TreeNode(4);
		TreeNode c = new TreeNode(6);
		TreeNode d = new TreeNode(3);
		TreeNode e = new TreeNode(7);

		c.left = d;
		c.right = e;
		a.left = b;
		a.right = c;

		System.out.println(isValidBST(a)); // false

	}
}
