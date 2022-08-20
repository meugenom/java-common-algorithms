package leetcode.LongestUnivaluePath;

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

	@Override
	public String toString() {
		return "(" + this.left + ")<-(" + this.val + ")->(" + this.right + ")";
	}
}

public class LongestUnivaluePath {

	private static int ans;

	public static int longestUnivaluePath(TreeNode root) {

		ans = 0;
		arrowLength(root);

		return ans;
	}

	private static int arrowLength(TreeNode node) {

		if (node == null)
			return 0;

		int left = arrowLength(node.left);
		int right = arrowLength(node.right);

		int arrowLeft = 0, arrowRight = 0;

		if (node.left != null && node.left.val == node.val) {
			arrowLeft += left + 1;
		}

		if (node.right != null && node.right.val == node.val) {
			arrowRight += right + 1;
		}

		ans = Math.max(ans, arrowLeft + arrowRight);

		return Math.max(arrowLeft, arrowRight);

	}

	public static void main(String[] args) {

		TreeNode a = new TreeNode(5);
		TreeNode b = new TreeNode(4);
		TreeNode c = new TreeNode(5);
		TreeNode d = new TreeNode(1);
		TreeNode e = new TreeNode(1);
		TreeNode f = new TreeNode(5);

		b.left = d;
		b.right = e;
		c.left = null;
		c.right = f;
		a.left = b;
		a.right = c;
		System.out.println(a.toString());
		System.out.println(longestUnivaluePath(a));

	}
}
