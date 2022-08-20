package leetcode.ConstructBinaryTreeFromPreorderAndInorderTraversal;

import java.util.HashMap;
import java.util.Map;

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

public class ConstructBinaryTreeFromPreorderAndInorderTraversal {

	public static int index;

	public static Map<Integer, Integer> inorderIndexMap;

	public static TreeNode buildTree(int[] preorder, int[] inorder) {

		index = 0;

		// build a hashmap to store value -> its index relations
		inorderIndexMap = new HashMap<>();

		for (int i = 0; i < inorder.length; i++) {

			inorderIndexMap.put(inorder[i], i);

		}

		// for (int i = 0; i < inorder.length; i++) {
		// System.out.println(inorderIndexMap.toString());
		// }

		return helper(preorder, 0, preorder.length - 1);
	}

	public static TreeNode helper(int[] preorder, int left, int right) {

		if (left > right)
			return null;

		int val = preorder[index++];
		TreeNode parent = new TreeNode(val);

		// build left and right subtree
		// preorder with left subtree
		parent.left = helper(preorder, left, inorderIndexMap.get(val) - 1);

		// inorder with right subtree
		parent.right = helper(preorder, inorderIndexMap.get(val) + 1, right);

		return parent;
	}

	public static void main(String[] args) {

		int[] preorder = new int[] { 3, 9, 20, 15, 7 };
		int[] inorder = new int[] { 9, 3, 15, 20, 7 };

		System.out.println(buildTree(preorder, inorder));

	}

}
