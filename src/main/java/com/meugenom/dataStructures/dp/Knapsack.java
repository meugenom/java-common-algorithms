package com.meugenom.dataStructures.dp;

import java.util.Arrays;

/**
 * Problem details Suppose we have a knapsack which can hold int w = 10 weight
 * units. We have a total of int n = 4 items to choose from, whose values are
 * represented by an array int[] val = {10, 40, 30, 50} and weights represented
 * by an array int[] wt = {5, 4, 6, 3}. Since this is the 0–1 knapsack problem,
 * we can either include an item in our knapsack or exclude it, but not include
 * a fraction of it, or include it multiple times.
 */

public class Knapsack {

	public static void main(String args[]) {

		int sackWeight = 3;//10;

		int numberOfThings = 3;

		//int[] price = { 10, 40, 30 };
		int[] price = { 3, 4, 5};

		//int[] thingWeight = { 5, 4, 6};
		int[] thingWeight = { 1, 2, 3};

		// Populate base cases
		int[][] matrix = new int[numberOfThings + 1][sackWeight + 1];

		for (int j = 0; j < sackWeight + 1; j++) {
			matrix[0][j] = 0;
		}

		for (int i = 0; i < numberOfThings + 1; i++) {
			matrix[i][0] = 0;
		}

		// Main logic
		for (int item = 1; item <= numberOfThings; item++) {

			for (int capacity = 1; capacity <= sackWeight; capacity++) {

				int maxValWithoutCurr = matrix[item - 1][capacity]; // This is guaranteed to exist
				int maxValWithCurr = 0; // We initialize this value to 0
				int weightOfCurr = thingWeight[item - 1]; // We use item -1 to account for the extra row at the top
				
				if (capacity >= weightOfCurr) { // We check if the knapsack can fit the current item
					
					maxValWithCurr = price[item - 1]; // If so, maxValWithCurr is at least the value of the current item

					int remainingCapacity = capacity - weightOfCurr; // remainingCapacity must be at least 0
					
					maxValWithCurr += matrix[item - 1][remainingCapacity]; // Add the maximum value obtainable with the
																			// remaining capacity
				}

				matrix[item][capacity] = Math.max(maxValWithoutCurr, maxValWithCurr); // Pick the larger of the two
			}
		}

		System.out.println(matrix[numberOfThings][sackWeight]); // Final answer
		System.out.println(Arrays.deepToString(matrix)); // Visualization of the table

	}

}
