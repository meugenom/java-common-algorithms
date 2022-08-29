package leetcode.MaxDepthOfBinaryTree;

/***
 * 104 easy
 * 
 * Given the root of a binary tree, return its maximum depth.
 * A binary tree's maximum depth is the number of nodes along the longest path
 * from the root node down to the farthest leaf node.
 * 
 * Example 1:
 * Input: root = [3,9,20,null,null,15,7]
 * Output: 3
 * 
 * Example 2:
 * Input: root = [1,null,2]
 * Output: 2
 * 
 */

public class MaxDepthOfBinaryTree {

	public static int depth;

	public static int maxDepth(TreeNode root) {
		depth = 0;
		return helper(root, depth);
	}

	public static int helper(TreeNode root, int depth) {
		if (root == null)
			return depth;

		return Math.max(helper(root.left, depth + 1), helper(root.right, depth + 1));
	}

	public static void main(String[] args) {
		TreeNode a1 = new TreeNode(1);
		TreeNode a2 = null;
		TreeNode a3 = new TreeNode(2);

		a1.left = a2;
		a1.right = a3;

		System.out.println(maxDepth(a1));

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
