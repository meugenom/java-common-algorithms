package leetcode.Array.MinimumNumberOfArrowsToBurstBalloons;

import java.util.Arrays;

/**
 * 452 medium "Minimum NUmber of Arrows To Burst Balloons"
 * 
 * There are some spherical balloons taped onto a flat wall that represents the XY-plane.
 * The balloons are represented as a 2D integer array 
 * points where points[i] = [xstart, xend] denotes a balloon whose horizontal diameter 
 * stretches between xstart and xend. You do not know the exact y-coordinates of the balloons.
 * Arrows can be shot up directly vertically (in the positive y-direction) from 
 * different points along the x-axis. A balloon with xstart and xend is burst by 
 * an arrow shot at x if xstart <= x <= xend. There is no limit to the number 
 * of arrows that can be shot. A shot arrow keeps traveling up infinitely, 
 * bursting any balloons in its path.
 * Given the array points, return the minimum number of arrows that must be shot to burst 
 * all balloons.
 * 
 * Example 1:
 * Input: points = [[10,16],[2,8],[1,6],[7,12]]
 * Output: 2
 * Explanation: The balloons can be burst by 2 arrows:
 * - Shoot an arrow at x = 6, bursting the balloons [2,8] and [1,6].
 * - Shoot an arrow at x = 11, bursting the balloons [10,16] and [7,12].
 * 
 * Example 2:
 * Input: points = [[1,2],[3,4],[5,6],[7,8]]
 * Output: 4
 * Explanation: One arrow needs to be shot for each balloon for a total of 4 arrows.
 * 
 * Example 3:
 * Input: points = [[1,2],[2,3],[3,4],[4,5]]
 * Output: 2
 * Explanation: The balloons can be burst by 2 arrows:
 * - Shoot an arrow at x = 2, bursting the balloons [1,2] and [2,3].
 * - Shoot an arrow at x = 4, bursting the balloons [3,4] and [4,5].
 * 
 * T.C.: O(n);
 * S.C.: O(2n);
 * 
 */

public class MinimumNumberOfArrowsToBurstBalloons {
	public int findMinArrowShots(int[][] arr) {
		int n = arr.length; // extract size

		// intially arrow will be 1 (see constraint 1 <= points.length <= 10^5)
		// atleast 1 ballon will be required so, arrow = 1

		int arrow = 1; // we will require atleast 1 arrow to burst the ballons

		// as we said, sort it on the basis of starting point
		Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

		// intially start and end position will be of zero index
		int start = arr[0][0];
		int end = arr[0][1];

		// Run the loop i.e from (1 to n)
		for (int i = 1; i < n; i++) {
			if (arr[i][0] > end) // active set and ith index interval does not overlap
			{
				// so we have to create new active set
				start = arr[i][0];
				end = arr[i][1];

				arrow++; // and also now we need one more arrow
			} else // if active set and ith index interval does overlap
			{
				// we just rearranging our active set
				start = Math.max(start, arr[i][0]);
				end = Math.min(end, arr[i][1]);
			}
		}

		return arrow; // finally, loop ends return count of arrow
	}
}
