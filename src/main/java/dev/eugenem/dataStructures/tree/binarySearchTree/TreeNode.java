package dev.eugenem.dataStructures.tree.binarySearchTree;

public class TreeNode {
	public int data;
	public TreeNode left;
	public TreeNode right;

	public TreeNode(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}

	public TreeNode(int data, TreeNode left, TreeNode right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}

	@Override
	public String toString() {
		return String.format("[%s, %s, %s]", data, left == null ? "null" : left.toString(),
				right == null ? "null" : right.toString());
	}
}
