package dev.eugenem.dataStructures.search.binarySearch;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BinarySearchTest {

	@Test
	@DisplayName("binary search test")
	public void testSearch() {

		BinarySearch bs = new BinarySearch();

		int[] nums = new int[] { -1, 0, 3, 4, 5, 6, 7, 12, 19, 21 };
		int target = 12;

		int expected = 7; // index in the array
		int actual = bs.search(nums, target);

		assertEquals(expected, actual, "binary search should work");

		System.out.println("Test - Binary Search : search() - passed ok");

	}
}
