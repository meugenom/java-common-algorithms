package leetcode.BinaryTreeInorderTraversal;

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


public class BinaryTreeInorderTraversal {
	
	private  List<Integer> arr = new ArrayList<Integer>();

	public  List<Integer> inorderTraversal(TreeNode root) {
		
		if (root == null) return arr;
		
		if(root.left == null && root.right == null){
			arr.add(root.val);
			return arr;
		}
		
		inorderTraversal(root.left);
				
		arr.add(root.val);

		inorderTraversal(root.right);
		
		
		return arr;
    }


	public static void main(String[] args) {
		TreeNode a = new TreeNode(1);
		TreeNode b = new TreeNode(2);
		TreeNode c = new TreeNode(3);

		b.left = c;
		a.right = b;

		BinaryTreeInorderTraversal tr = new BinaryTreeInorderTraversal();
		System.out.println(tr.inorderTraversal(a).toString());
	}
}
