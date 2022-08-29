package leetcode.BalancedBinaryTree;

/***
 * easy 110 (was medium)
 * DFS Tree
 * 
 * Given a binary tree, determine if it is height-balanced.
 * 
 * For this problem, a height-balanced binary tree is defined as:
 * a binary tree in which the left and right subtrees of every node differ in
 * height by no more than 1.
 * 
 * Example 1:
 * Input: root = [3,9,20,null,null,15,7]
 * Output: true
 * 
 * Example 2:
 * Input: root = [1,2,2,3,3,null,null,4,4]
 * Output: false
 * 
 * Example 3:
 * Input: root = []
 * Output: true
 */

public class BalancedBinaryTree {

	private static boolean ans = true;

	public static int height(TreeNode root) {
		if (root == null)
			return 0;

		int left = height(root.left);
		int right = height(root.right);

		if (Math.abs(left - right) > 1)
			ans = false;

		return 1 + Math.max(left, right);

	}

	public static boolean isBalanced(TreeNode root) {

		height(root);

		return ans;
	}

	public static void main(String[] args) {
		TreeNode a1 = new TreeNode(3);
		TreeNode a2 = new TreeNode(9);
		TreeNode a3 = new TreeNode(20);
		TreeNode a4 = null;
		TreeNode a5 = null;
		TreeNode a6 = new TreeNode(15);
		TreeNode a7 = new TreeNode(7);

		a2.left = a4;
		a2.right = a5;
		a3.left = a6;
		a3.right = a7;
		a1.left = a2;
		a1.right = a3;

		System.out.println(isBalanced(a1));

	}
}

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