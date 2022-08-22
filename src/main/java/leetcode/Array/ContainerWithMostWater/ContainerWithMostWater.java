package leetcode.Array.ContainerWithMostWater;

/***
 * medium 11
 * 
 * Example 1
 * Input: height = [1,8,6,2,5,4,8,3,7]
 * Output: 49
 * Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. 
 * In this case, the max area of water (blue section) the container can contain is 49.
 * 
 * 
 * Example 2:
 * Input: height = [1,1]
 * Output: 1
 * 
 * T.C.: O(n);
 * S.C.: O(1);
 */

public class ContainerWithMostWater {

	public static int maxArea(int[] height) {

		int left = 0;
		int right = height.length - 1;
		int max = 0;

		while (left < height.length - 1 && right >= 0) {

			int current;

			// System.out.println("left = " + left + " | right = " + right);

			System.out.println("height[" + left + "]=" + height[left] + "  height[" + right + "]=" + height[right]);

			if (height[left] >= height[right] && right != left) {

				// System.out.println("height["+left+"]=" + height[left] + " height[" + right +
				// "]=" + height[right]);

				current = Math.abs(height[right] * (right - left));

				if (current > max)
					max = current;

			} else if (height[left] <= height[right] && right != left) {

				// System.out.println("height["+left+"]=" + height[left] + " height[" + right +
				// "]=" + height[right]);

				current = Math.abs(height[left] * (right - left));

				if (current > max)
					max = current;

			}

			if (height[left + 1] >= height[left]) {

				if (height[left] >= height[right]) {
					right--;
					// left++;
				} else {
					// right--;
					left++;
				}

			} else if (height[left + 1] < height[left]) {
				if (height[left] >= height[right]) {
					right--;
				} else {
					left++;
				}
			}
		}

		return max;
	}

	public static void main(String[] args) {

		// int[] height = new int[]{2,3,4,5,18,17,6}; //17

		// int[] height = new int[]{1,2,3,4,5,25,24,3,4}; //24

		// int[] height = new int[]{1,8,100,2,100,4,8,3,7}; //200

		// int[] height = new int[]{1,8,6,2,5,4,8,3,7}; //49

		int[] height = new int[] { 5, 2, 12, 1, 5, 3, 4, 11, 9, 4 }; // 55

		System.out.println("-----");
		System.out.println(maxArea(height));
	}
}
