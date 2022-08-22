package leetcode.Array.HouseRobber;

/***
 * medium 198
 * 
 * You are a professional robber planning to rob houses along a street. Each
 * house has a certain amount of money stashed, the only constraint stopping you
 * from robbing each of them is that adjacent houses have security systems
 * connected and it will automatically contact the police if two adjacent houses
 * were broken into on the same night.
 * 
 * Given an integer array nums representing the amount of money of each house,
 * return the maximum amount of money you can rob tonight without alerting the
 * police.
 * 
 * 
 * Example 1:
 * Input: nums = [1,2,3,1]
 * Output: 4
 * Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
 * Total amount you can rob = 1 + 3 = 4.
 * 
 * Example 2:
 * Input: nums = [2,7,9,3,1]
 * Output: 12
 * Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5
 * (money = 1).
 * Total amount you can rob = 2 + 9 + 1 = 12.
 * 
 * T.C.: O(n);
 * S.C.: O(1).
 */

public class HouseRobber {

	public int rob(int[] nums) {

		if (nums.length == 0) {
			return 0;
		}

		if (nums.length == 1) {
			return 0;
		}

		int sumEven = 0;
		int sumOdd = 0;
		int index = 1;

		while (index < nums.length) {

			// 1,3,5,7...
			sumOdd = sumOdd + nums[index - 1];

			// 0,2,4,6...
			sumEven = sumEven + nums[index];

			if (index + 2 < nums.length) {
				index = index + 2;
			} else if (index + 1 < nums.length) {
				sumOdd = sumOdd + nums[index + 1];
				break;
			} else {
				index++;
			}
		}
		return sumOdd > sumEven ? sumOdd : sumEven;
	}

	public static void main(String[] args) {
		HouseRobber h = new HouseRobber();
		int[] nums1 = new int[] { 2, 7, 9, 3, 1, 0, 7, 8, 12, 5, 888, 999, 0, 0 };
		System.out.println(h.rob(nums1));
	}
}
