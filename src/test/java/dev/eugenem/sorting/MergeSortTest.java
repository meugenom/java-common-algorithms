package dev.eugenem.sorting;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MergeSortTest {
	
	@Test
	@DisplayName(" mergesort")
	void testMergeSort() {

		MergeSort ms = new MergeSort();

		int[] actualArr = new int[] { 99, 85, 1, 25, 20, 7, 65, 11, 13, 14, 7, 0, 87 };
		ms.mergeSort(actualArr);
		String actual = ms.display(actualArr);

		String expected = "[ 0, 1, 7, 7, 11, 13, 14, 20, 25, 65, 85, 87, 99]";

		assertEquals(expected, actual, "mergesorting should work");
		System.out.println("Test - MergeSort: mergeSort() - passed ok");

	}
}
