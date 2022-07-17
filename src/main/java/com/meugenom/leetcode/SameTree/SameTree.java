package com.meugenom.leetcode.SameTree;

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

public class SameTree {

	public static boolean isSameTree(TreeNode p, TreeNode q) {
		if (p == null || q == null)
			return p == q;
		if (p.val != q.val)
			return false;

		return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);

	}

	public static void main(String[] args) {

		TreeNode a = new TreeNode(1);
		TreeNode b = new TreeNode(2);
		TreeNode c = new TreeNode(3);

		a.left = b;
		a.right = c;

		TreeNode a1 = new TreeNode(1);
		TreeNode b1 = new TreeNode(4);
		TreeNode c1 = new TreeNode(3);

		a1.left = b1;
		a1.right = c1;

		System.out.println(isSameTree(a, a1)); //out false

	}
}
