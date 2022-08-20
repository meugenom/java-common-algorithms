package leetcode.BinaryTreeRightSideView;

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

public class BinaryTreeRightSideView {

	public static List<Integer> rightSideView(TreeNode root) {

		List<List<Integer>> res = new ArrayList<List<Integer>>();
		List<Integer> result = new ArrayList<Integer>();
		int level = 0;

		// private case
		if (root == null)
			return result;

		helper(res, level, root);

		level = 0;
		while (level < res.size()) {
			int length = res.get(level).size();
			result.add(res.get(level).get(length - 1));

			level++;
		}

		return result;

	}

	public static void helper(List<List<Integer>> res, int level, TreeNode root) {

		// add null array
		if (res.size() < level + 1 || level == 0) {
			List<Integer> l = new ArrayList<Integer>();
			res.add(l);
		}

		System.out.println("level: " + level + " val: " + root.val);

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

		TreeNode a = new TreeNode(1);
		TreeNode b = new TreeNode(2);
		TreeNode c = new TreeNode(3);
		TreeNode d = new TreeNode(5);
		TreeNode e = new TreeNode(4);
		c.right = e;
		b.right = d;
		a.left = b;
		a.right = c;

		// System.out.println(rightSideView(a).toString());

		TreeNode a1 = new TreeNode(1);
		TreeNode b1 = new TreeNode(2);
		TreeNode c1 = new TreeNode(3);
		TreeNode d1 = new TreeNode(4);

		b1.left = d1;
		a1.left = b1;
		a1.right = c1;

		System.out.println(rightSideView(a1).toString());

	}

}
