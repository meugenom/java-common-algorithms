package com.meugenom.leetcode.PopulatingNextRightPointersEachNode;

import java.util.LinkedList;
import java.util.Queue;

class Node {
	public int val;
	public Node left;
	public Node right;
	public Node next;

	Node(int val) {
		this.val = val;
		this.left = null;
		this.right = null;
		this.next = null;
	}

	Node(int val, Node left, Node right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
	/*
	 * @Override
	 * public String toString() {
	 * return String.format("[%s, %s, %s, %s]", val, left == null ? "null" :
	 * left.toString(),
	 * right == null ? "null" : right.toString(), next == null ? "null" :
	 * next.toString());
	 * }
	 */
}

public class PopulatingNextRightPointersEachNode {

	public static void preOrderPrintRecursive(Node node) {

		String next = (node.next == null) ? null : "";
		System.out.print(" " + node.val + ", " + next); // record root

		if (node.left != null)
			preOrderPrintRecursive(node.left); // traverse left

		if (node.right != null)
			preOrderPrintRecursive(node.right); // traverse right

	}

	public static Node connect(Node root) {

		Node n = root;

		// private case
		if (root == null)
			return root;

		Queue<Node> q = new LinkedList<>();

		q.add(n);

		while (!q.isEmpty()) {

			int l = q.size();

			Node prev = null;

			for (int i = 0; i < l; i++) {

				Node temp = q.poll();

				if (i == 0) {

					prev = temp;

				} else {

					prev.next = temp;
					prev = temp;
				}

				if (temp.left != null)
					q.add(temp.left);
				if (temp.right != null)
					q.add(temp.right);
			}
		}

		return root;
	}

	public static void main(String[] args) {
		Node a1 = new Node(1);
		Node a2 = new Node(2);
		Node a3 = new Node(3);
		Node a4 = new Node(4);
		Node a5 = new Node(5);
		Node a6 = new Node(6);
		Node a7 = new Node(7);

		a1.left = a2;
		a1.right = a3;
		a2.left = a4;
		a2.right = a5;
		a3.left = a6;
		a3.right = a7;

		// System.out.println(a1);
		// preOrderPrintRecursive(a1); // 1 2 4 5 3 6 7%
		preOrderPrintRecursive(connect(a1)); // 1 2 4 5 3 6 7 1 2 4 5 3 6 7%

	}

}
