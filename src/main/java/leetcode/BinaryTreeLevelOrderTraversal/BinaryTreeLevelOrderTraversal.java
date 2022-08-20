package leetcode.BinaryTreeLevelOrderTraversal;

import java.util.ArrayList;
import java.util.List;

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

public class BinaryTreeLevelOrderTraversal {

	public static List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		int level = 0;

		// private case
		if (root == null)
			return res;

		helper(res, level, root);
		
		return res;
	}

	public static void helper(List<List<Integer>> res, int level, TreeNode root) {

		// add null array
		if (res.size() < level + 1 || level == 0) {
			List<Integer> l = new ArrayList<Integer>();
			res.add(l);
		}
		// System.out.println("level: " + level + " val: " + root.val);

		List<Integer> tmp = res.get(level);
		tmp.add(root.val);

		if (root.left != null) {
			helper(res, level + 1, root.left);
		}

		if (root.right != null) {
			helper(res, level + 1, root.right);
		}
	}

	public static void main(String[] args) {
		TreeNode a = new TreeNode(3);
		TreeNode b = new TreeNode(9);
		TreeNode c = new TreeNode(20);
		TreeNode d = new TreeNode(15);
		TreeNode e = new TreeNode(7);
		c.left = d;
		c.right = e;
		b.left = null;
		b.right = null;
		a.left = b;
		a.right = c;

		System.out.println(levelOrder(a).toString());

	}
}
