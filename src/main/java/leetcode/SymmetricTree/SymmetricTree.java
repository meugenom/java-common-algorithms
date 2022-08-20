package leetcode.SymmetricTree;

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

public class SymmetricTree {

	
	public static boolean isSymmetric(TreeNode root) {
		
		if (root == null) return false;
		
		return tree(root.left, root.right);
    }

	public static boolean tree(TreeNode p, TreeNode q){

		if(p == null || q == null) return p == q;

		return p.val == q.val && tree(p.left, q.right) && tree(p.right, q.left);
	}

	public static void main(String[] args) {
		//root = [1,2,2,3,4,4,3]
		TreeNode a = new TreeNode(1);
		TreeNode b = new TreeNode(2);
		TreeNode c = new TreeNode(2);
		TreeNode d = new TreeNode(3);
		TreeNode e = new TreeNode(4);
		TreeNode f = new TreeNode(4);
		TreeNode g = new TreeNode(3);
		
		c.right = g;
		c.left = f;
		
		b.right = e;
		b.left = d;
		
		a.right = c;
		a.left = b;

		System.out.println(isSymmetric(a));

	}
}
