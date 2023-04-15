package dataStructures.tree.binaryTree;

import java.util.Stack;

public class BinaryTreeIterative {

	public TreeNode root;

	public BinaryTreeIterative() {
		root = null;
	}

	/**
	 * add new value iterative into BST
	 * @param data
	 */
	public void insert(int data) {

		TreeNode parent = null;
		TreeNode current = this.root;

		// Finds a place for new node
		while (current != null) {
			if (current.data > data) {
				parent = current;
				current = parent.left;
			} else if (current.data < data) {
				parent = current;
				current = parent.right;
			} else {
				System.out.println(data + " is present in the tree");
				return;
			}
		}

		// add new node to the founded parent
		TreeNode newNode = new TreeNode(data);

		if (parent == null) {
			this.root = newNode;
		} else {
			if (parent.data > newNode.data) {
				parent.left = newNode;
			} else {
				parent.right = newNode;
			}
		}
	}

	/**
	 * preOder NLR print BST iterative
	 */
	public void preOrderPrintIterative() {

		if (this.root == null) {
			System.out.println("Tree is empty.");
			return;
		}

		Stack<TreeNode> stack = new Stack<TreeNode>();

		stack.push(root);

		while (!stack.isEmpty()) {

			TreeNode temp = stack.pop();

			System.out.print(temp.data + " ");

			if (temp.right != null) {
				stack.push(temp.right);
			}

			if (temp.left != null) {
				stack.push(temp.left);
			}
		}
	}

	/**
	 * inOrder LNR print BST iterative
	 */
	public void inOrderPrintIterative() {

		if (this.root == null) {
			System.out.println("Tree is empty.");
			return;
		}

		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode current = this.root;

		while (current != null || !stack.empty()) {

			while (current != null) {

				stack.push(current);
				current = current.left;
			}

			current = stack.pop();
			System.out.print(current.data + " ");
			current = current.right;
		}
	}

	/**
	 * postOrder LRN print BST iterative
	 */
	public void postOrderPrintIterative() {

		if (this.root == null) {
			System.out.println("This Tree is empty.");
			return;
		}

		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode current = this.root;
		TreeNode temp;

		while (current != null || !stack.empty()) {
			if (current != null) {

				stack.push(current);
				current = current.left;
			} else {

				temp = stack.peek();
				if (temp.right != null) {

					current = temp.right;
				} else {

					stack.pop();

					while (!stack.empty() && stack.peek().right == temp) {

						System.out.print(temp.data + " ");
						temp = stack.pop();
					}

					System.out.print(temp.data + " ");
				}
			}
		}
	}
}
