package com.meugenom.leetcode.InvertBinaryTree;


import java.util.LinkedList;
import java.util.Queue;

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

public class InvertBinaryTree {

	private static TreeNode current;

	public TreeNode invertTree(TreeNode root) {
        
		//private cases
        if(root == null) return root;
        
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        
		q.add(root);
        
		while(!q.isEmpty()) {

            current = q.poll();
            
			TreeNode tmp = new TreeNode();
            
			tmp = current.left;
            
			current.left = current.right;
            current.right = tmp;
            
            if(current.left != null){
                q.add(current.left);
            }
            
			if(current.right != null){
                q.add(current.right);
            }

        }
        
		return root;

    }
}
