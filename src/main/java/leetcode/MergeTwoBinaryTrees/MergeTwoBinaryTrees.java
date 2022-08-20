package leetcode.MergeTwoBinaryTrees;

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

public class MergeTwoBinaryTrees {

	public static TreeNode mergeTrees(TreeNode root1, TreeNode root2) {

		// private cases
		if (root1 == null)
			return root2;
		if (root2 == null)
			return root1;

		// sum
		root1.val = root1.val + root2.val;

		// recursion
		root1.left = mergeTrees(root1.left, root2.left);
		root1.right = mergeTrees(root1.right, root2.right);

		return root1;
	}

	public static void main(String[] args) {
		TreeNode a1 = new TreeNode(1);
		TreeNode a2 = new TreeNode(3);
		TreeNode a3 = new TreeNode(2);
		TreeNode a4 = new TreeNode(5);

		a1.left = a2;
		a1.right = a3;
		a2.left = a4;

		TreeNode b1 = new TreeNode(2);
		TreeNode b2 = new TreeNode(1);
		TreeNode b3 = new TreeNode(3);
		TreeNode b4 = new TreeNode(4);
		TreeNode b5 = new TreeNode(7);

		b1.left = b2;
		b1.right = b3;
		b2.right = b4;
		b3.right = b5;

		System.out.println(a1);
		System.out.println(b1);

		System.out.println(mergeTrees(a1, b1).toString());
		// out : [3, [4, [5, null, null], [4, null, null]], [5, null, [7, null, null]]]

		/*
		 * Input: root1 = [1,3,2,5], root2 = [2,1,3,null,4,null,7]
		 * Output: [3,4,5,5,4,null,7]
		 */
	}
}
