package leetcode.MaxDepthOfBinaryTree;

// Definition for a binary tree node.
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

public class MaxDepthOfBinaryTree {

	public static int depth;

	public int maxDepth(TreeNode root) {
		depth = 0;
		return tree(root, depth);
	}

	public static int tree(TreeNode root, int depth) {

		if (root == null) {
			return depth;
		}

		return Math.max(tree(root.left, depth + 1), tree(root.right, depth + 1));

	}

}
