package com.meugenom.leetcode.DiameterOfBinaryTree;

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

public class DiameterOfBinaryTree {

	int res;

	public int diameterOfBinaryTree(TreeNode root) {
		res = Integer.MIN_VALUE;
		height(root);
		return res - 1; // is about 'edges' not 'nodes'
	}

	private int height(TreeNode node) {
		if (node == null) {
			return 0;
		}

		int left = height(node.left);
		int right = height(node.right);

		res = Math.max(res, 1 + left + right);

		return 1 + Math.max(left, right);
	}
}
