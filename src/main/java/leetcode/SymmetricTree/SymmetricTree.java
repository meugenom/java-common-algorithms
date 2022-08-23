package leetcode.SymmetricTree;

/***
 * easy 101
 * 
 * Given the root of a binary tree, check whether it is a mirror of itself
 * (i.e., symmetric around its center).
 * 
 * Example 1:
 * Input: root = [1,2,2,3,4,4,3]
 * Output: true
 * 
 * Example 2:
 * Input: root = [1,2,2,null,3,null,3]
 * Output: false
 * 
 * 
 * T.C.: O(n^2);
 * S.C.: O(1).
 * //Tree Recursion
 */

class TreeNode {
	public int val;
	public TreeNode left;
	public TreeNode right;

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
		return String.format("[%s, %s, %s]", val, left == null ? "null" : left.toString(),
				right == null ? "null" : right.toString());
	}
}

public class SymmetricTree {

	public static boolean isSymmetric(TreeNode root) {

		if (root == null)
			return false;

		return tree(root.left, root.right);
	}

	public static boolean tree(TreeNode left, TreeNode right) {

		if (left == null || right == null)
			return left == right;

		return left.val == left.val && tree(left.left, right.right) && tree(left.right, right.left);
	}

	public static void main(String[] args) {
		// root = [1,2,2,3,4,4,3]
		TreeNode a = new TreeNode(1);
		TreeNode b = new TreeNode(2);
		TreeNode c = new TreeNode(2);
		TreeNode d = new TreeNode(3);
		TreeNode e = new TreeNode(4);
		TreeNode f = new TreeNode(4);
		TreeNode g = new TreeNode(3);

		c.right = g;
		c.left = f;

		b.right = e;
		b.left = d;

		a.right = c;
		a.left = b;

		System.out.println(isSymmetric(a));

	}
}
