package dev.eugenem.sorting;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class QuickSortTest {

	@Test
	@DisplayName("quick sort")
	void testSort() {

		int[] actual = new int[] { 6, 7, 3, 8, 2, 9, 10, 4, 5 };

		QuickSort qs = new QuickSort();
		qs.sort(actual, 0, actual.length - 1);

		int[] expected = new int[] { 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		String actualOut = qs.display(actual);
		String expectedOut = qs.display(expected);

		assertEquals(expectedOut, actualOut, "quick sorting should work");
		System.out.println("Test - Quick Sort: sort() - passed ok");

	}
}
