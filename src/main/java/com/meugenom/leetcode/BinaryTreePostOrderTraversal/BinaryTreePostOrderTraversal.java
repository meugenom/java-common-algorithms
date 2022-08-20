package com.meugenom.leetcode.BinaryTreePostOrderTraversal;

import java.util.ArrayList;
import java.util.List;

/***
 * 145 easy
 * Given the root of a binary tree, return the postorder traversal of its nodes'
 * values.
 * 
 * Input: root = [1,null,2,3]
 * Output: [3,2,1]
 * Example 2:
 * 
 * Input: root = []
 * Output: []
 * Example 3:
 * 
 * Input: root = [1]
 * Output: [1]
 * 
 * T.C - O(N)
 * S.C -O(N) [recursive stack space]
 */

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

	@Override
	public String toString() {

		return this.left + "<-(" + this.val + ")->" + this.right;
	}
}

public class BinaryTreePostOrderTraversal {

	private static List<Integer> postorderTraversal(TreeNode root) {
		List<Integer> res = new ArrayList<>();
		return helper(root, res);
	}

	private static List<Integer> helper(TreeNode root, List<Integer> res) {

		// base case
		if (root == null)
			return res;

		if (root.left != null) {
			helper(root.left, res);
		}

		if (root.right != null) {
			helper(root.right, res);
		}

		res.add(root.val);

		return res;
	}

	public static void main(String[] args) {
		TreeNode a = new TreeNode(1);
		TreeNode b = new TreeNode(2);
		TreeNode c = new TreeNode(3);

		b.left = c;
		a.right = b;

		System.out.println(a.toString());
		System.out.println(postorderTraversal(a));

	}
}
