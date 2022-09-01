package leetcode.CountGoodNodesInBinaryTree;

/***
 * 1448 medium
 * 
 * Given a binary tree root, a node X in the tree is named good if in the path
 * from root to X there are no nodes with a value greater than X.
 * Return the number of good nodes in the binary tree.
 * 
 * Example 1:
 * Input: root = [3,1,4,3,null,1,5]
 * Output: 4
 * Explanation: Nodes in blue are good.
 * Root Node (3) is always a good node.
 * Node 4 -> (3,4) is the maximum value in the path starting from the root.
 * Node 5 -> (3,4,5) is the maximum value in the path
 * Node 3 -> (3,1,3) is the maximum value in the path.
 * 
 * Example 2:
 * Input: root = [3,3,null,4,2]
 * Output: 3
 * Explanation: Node 2 -> (3, 3, 2) is not good, because "3" is higher than it.
 * 
 * Example 3:
 * Input: root = [1]
 * Output: 1
 * Explanation: Root is considered as good.
 * 
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
}

public class CountGoodNodesInBinaryTree {

	public static int goodNodes(TreeNode root) {
		return helper(root, root);
	}

	public static int helper(TreeNode root, TreeNode parent) {
		if (root == null)
			return 0;

		int count = 0;

		if (root.val >= parent.val) {
			count = 1;
			parent = root;
		}

		return count + helper(root.left, parent) + helper(root.right, parent);
	}

	public static void main(String[] args) {

		TreeNode a1 = new TreeNode(3);
		TreeNode a2 = new TreeNode(1);
		TreeNode a3 = new TreeNode(4);
		TreeNode a4 = new TreeNode(3);
		TreeNode a5 = null;
		TreeNode a6 = new TreeNode(1);
		TreeNode a7 = new TreeNode(5);

		a2.left = a4;
		a2.right = a5;
		a3.right = a7;
		a3.left = a6;
		a1.left = a2;
		a1.right = a3;

		System.out.println("out = " + goodNodes(a1));

		TreeNode b1 = new TreeNode(3);
		TreeNode b2 = new TreeNode(3);
		TreeNode b3 = null;
		TreeNode b4 = new TreeNode(4);
		TreeNode b5 = new TreeNode(2);

		b2.left = b4;
		b2.right = b5;
		b1.left = b2;
		b1.right = b3;

		System.out.println("out = " + goodNodes(b1));

	}
}
