package leetcode.Array.MinimumRoundsToCompleteAllTasks;

import java.util.HashMap;
import java.util.Map;

/**
 * Issue 2244 medium "Minimum Rounds To Complete All Tasks"
 * 
 * You are given a 0-indexed integer array tasks,
 * where tasks[i] represents the difficulty level of a task.
 * In each round, you can complete either 2 or 3 tasks of the same difficulty
 * level.
 * Return the minimum rounds required to complete all the tasks,
 * or -1 if it is not possible to complete all the tasks.
 * 
 * Example 1:
 * Input: tasks = [2,2,3,3,2,4,4,4,4,4]
 * Output: 4
 * Explanation: To complete all the tasks, a possible plan is:
 * - In the first round, you complete 3 tasks of difficulty level 2.
 * - In the second round, you complete 2 tasks of difficulty level 3.
 * - In the third round, you complete 3 tasks of difficulty level 4.
 * - In the fourth round, you complete 2 tasks of difficulty level 4.
 * It can be shown that all the tasks cannot be completed in fewer than 4
 * rounds,
 * so the answer is 4.
 * 
 * Example 2:
 * Input: tasks = [2,3,3]
 * Output: -1
 * Explanation: There is only 1 task of difficulty level 2, but in each round,
 * you can only complete either 2 or 3 tasks of the same difficulty level.
 * Hence, you cannot complete all the tasks, and the answer is -1.
 * 
 * * 
 * T.C.: O(n);
 * S.C.: O(n);
 */

public class MinimumRoundsToCompleteAllTasks {
	public int minimumRounds(int[] tasks) {

		// Using a hashMap to store the frequency
		Map<Integer, Integer> m = new HashMap<>();

		for (int task : tasks) {
			// storing the frequency using getOrDefault (it's a function from Property class
			// )
			m.put(task, m.getOrDefault(task, 0) + 1);
		}

		// to maintain the total round count taking one variable
		int rounds = 0;

		for (int value : m.values()) {
			// if the frequency is 1 then we can't group( Ref. Example 2)

			// private case
			if (value == 1)
				return -1;
			// else we are trying to complete 3 tasks at a time because
			// maximum we can solve 3 tasks
			rounds += (value / 3);

			// anything is remaining that should be 2 or 1
			// If it's 2 then we can solve 2 tasks at a time
			// so simply we can do rounds++

			// If it's 1 then we will backtrack and we should
			// have 1+3 = 4 tasks , we can solve it by 2-->2 i.e
			// rounds +=2 but we had backtracked once so
			// rounds+=(2-1) again that it rounds++;
			if (value % 3 > 0)
				rounds++;
		}

		return rounds;
	}
}
