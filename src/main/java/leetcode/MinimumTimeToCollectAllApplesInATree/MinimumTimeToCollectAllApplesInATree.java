package leetcode.MinimumTimeToCollectAllApplesInATree;

import java.util.ArrayList;
import java.util.List;

/**
 * Issue 1443 medium "Minimum Time To Collect All Apples In A Tree"
 * https://leetcode.com/problems/minimum-time-to-collect-all-apples-in-a-tree/description/
 * 
 * Given an undirected tree consisting of n vertices numbered from 0 to n-1, 
 * which has some apples in their vertices. You spend 1 second to walk over one edge of the tree. 
 * Return the minimum time in seconds you have to spend to collect all apples in the tree, 
 * starting at vertex 0 and coming back to this vertex.
 * The edges of the undirected tree are given in the array edges, 
 * where edges[i] = [ai, bi] means that exists an edge connecting the vertices 
 * ai and bi. Additionally, there is a boolean array hasApple, where hasApple[i] = true means 
 * that vertex i has an apple; otherwise, it does not have any apple.
 * 
 * Example 1:
 * 
 * Input: n = 7, edges = [[0,1],[0,2],[1,4],[1,5],[2,3],[2,6]], 
 * hasApple = [false,false,true,false,true,true,false]
 * Output: 8 
 * Explanation: The figure above represents the given tree where 
 * red vertices have an apple. One optimal path to collect all apples 
 * is shown by the green arrows.
 * 
 * Example 2:
 * Input: n = 7, edges = [[0,1],[0,2],[1,4],[1,5],[2,3],[2,6]], 
 * hasApple = [false,false,true,false,false,true,false]
 * Output: 6
 * Explanation: The figure above represents the given tree where red vertices 
 * have an apple. One optimal path to collect all apples is shown by the green arrows.  
 * 
 * T.C.: O(n);
 * S.C.: O(n);
 */

public class MinimumTimeToCollectAllApplesInATree {
	public int minTime(int n, int[][] edges, List<Boolean> hasApple) {

		// we need map to know visited nodes
		List<List<Integer>> map = new ArrayList<>();

		// add null values
		for (int i = 0; i < n; i++) {
			map.add(new ArrayList<Integer>(0));
		}

		boolean visited[] = new boolean[n];

		for (int[] e : edges) {
			map.get(e[0]).add(e[1]);
			map.get(e[1]).add(e[0]);
		}
		// use handler to calculate our steps 1 step = 1 second by default
		return dfs(map, visited, hasApple, 0);
	}

	// helper - DFS
	private int dfs(List<List<Integer>> map, boolean[] visited, List<Boolean> hasApple, int index) {

		int result = 0;
		visited[index] = true;

		for (int i : map.get(index)) {
			if (!visited[i]) {
				result += dfs(map, visited, hasApple, i);
			}
		}

		if (index == 0) {
			return result;
		}

		return result += (hasApple.get(index) || result > 0) ? 2 : 0;
	}
}
