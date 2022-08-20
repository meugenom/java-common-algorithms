package leetcode.ConvertSortedArrayToBinarySearchTree;

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
		return left + "<-(" + val + ")->" + right;
	}

}

public class ConvertSortedArrayToBinarySearchTree {

	public TreeNode sortedArrayToBST(int[] nums) {

		return createTree(0, nums.length - 1, nums);

	}

	public TreeNode createTree(int left, int right, int[] nums) {

		if (left > right)
			return null;

		int mid = (left + right) / 2;
		TreeNode root = new TreeNode(nums[mid]);

		root.left = createTree(left, mid - 1, nums);
		root.right = createTree(mid + 1, right, nums);

		return root;
	}

	public static void main(String[] args) {
		// nums = [-10,-3,0,5,9]
		int[] nums = new int[] { -10, -3, 0, 5, 9 };
		ConvertSortedArrayToBinarySearchTree convertTree = new ConvertSortedArrayToBinarySearchTree();
		System.out.println(convertTree.sortedArrayToBST(nums).toString());
	}
}
