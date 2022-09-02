package leetcode.AverageLevelsInBinaryTree;

import java.util.ArrayList;
import java.util.List;

/***
 * easy 637
 * Given the root of a binary tree, return the average value of the nodes on
 * each level in the form of an array. Answers within 10-5 of the actual answer
 * will be accepted.
 * 
 * Example 1:
 * Input: root = [3,9,20,null,null,15,7]
 * Output: [3.00000,14.50000,11.00000]
 * Explanation: The average value of nodes on level 0 is 3, on level 1 is 14.5,
 * and on level 2 is 11.
 * Hence return [3, 14.5, 11].
 * 
 * Example 2:
 * Input: root = [3,9,20,15,7]
 * Output: [3.00000,14.50000,11.00000]
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

public class AverageLevelsInBinaryTree {

	public static List<Double> averageOfLevels(TreeNode root) {
		List<Integer> count = new ArrayList<>();
		List<Double> res = new ArrayList<>();
		average(root, 0, res, count);
		for (int i = 0; i < res.size(); i++)
			res.set(i, res.get(i) / count.get(i));
		return res;
	}

	public static void average(TreeNode root, int level, List<Double> sum, List<Integer> count) {
		if (root == null)
			return;

		if (level < sum.size()) {
			sum.set(level, sum.get(level) + root.val);
			count.set(level, count.get(level) + 1);
		} else {
			sum.add(1.0 * root.val);
			count.add(1);
		}
		average(root.left, level + 1, sum, count);
		average(root.right, level + 1, sum, count);
	}

	public static void main(String[] args) {
		TreeNode a1 = new TreeNode(3);
		TreeNode a2 = new TreeNode(9);
		TreeNode a3 = new TreeNode(20);
		TreeNode a4 = null;
		TreeNode a5 = null;
		TreeNode a6 = new TreeNode(15);
		TreeNode a7 = new TreeNode(7);

		a3.left = a6;
		a3.right = a7;
		a2.right = a4;
		a2.left = a5;
		a1.left = a2;
		a1.right = a3;

		System.out.println(averageOfLevels(a1).toString());

	}
}
