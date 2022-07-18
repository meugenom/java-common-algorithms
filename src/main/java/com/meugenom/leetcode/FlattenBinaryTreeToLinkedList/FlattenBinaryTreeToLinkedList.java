package com.meugenom.leetcode.FlattenBinaryTreeToLinkedList;

import java.util.ArrayList;
import java.util.List;

// Definition for a binary tree node.
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


public class FlattenBinaryTreeToLinkedList {
	
	public static List<TreeNode> arr;
	
	public static void flatten(TreeNode root) {
        
        if (root == null) return;
        if(root.left == null && root.right == null) return;
        
		arr = new ArrayList<TreeNode>();
		
        readTree(root);

		TreeNode current = arr.get(0);
		current.left = null;

		int step = 0;
		
		while(step < arr.size()){
            
			current = arr.get(step);
			current.left = null;
			
            root.right = current;
			root = root.right;
			
			step++;
		}
		
    }

	public static void readTree(TreeNode root){
		
		arr.add(root);

		if(root.left != null){
			readTree(root.left);
		}

		if(root.right != null){
			readTree(root.right);
		}

	}

	public static void main(String[] args) {
		TreeNode a = new TreeNode(1);
		TreeNode b = new TreeNode(2);
		TreeNode c = new TreeNode(3);
		TreeNode d = new TreeNode(4);
		TreeNode e = new TreeNode(5);
		TreeNode f = new TreeNode(6);

		e.right = f;
		a.right = e;
		b.right = d;
		b.left = c;
		a.left = b;

		flatten(a);
	

	}
}
