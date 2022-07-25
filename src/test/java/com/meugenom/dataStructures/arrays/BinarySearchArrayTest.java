package com.meugenom.dataStructures.arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchArrayTest {
	
	private BinarySearchArray bs = new BinarySearchArray();

	@Test
	@DisplayName("Find number in the array by iterative binary search method")
	public void testFindNumberBSIterative() {
		
		int[] nums = new int[]{ 1, 4, 7, 15, 67, 89, 90, 234, 678, 876, 901, 1020};
		int target = 234;
		int actual = bs.searchIterative(nums, target);
		int expected = 7;

		assertEquals(expected, actual, "Find number by Binary Search Iterative method should work");
		System.out.println("Test - Arrays Binary Search Iterative  : searchIterative() - passed ok");
	}

	@Test
	@DisplayName("Find number in the array by recursive binary search method")
	public void testFindNumberBSRecursive() {
		
		int[] nums = new int[]{ 0, 2, 5, 22, 67, 89, 91, 145, 234, 678, 876, 901, 1020};
		int target = 234;
		int actual = bs.searchRecursive(nums, target, 0, nums.length - 1);
		int expected = 8;

		assertEquals(expected, actual, "Find number by Binary Search Recursive method should work");
		System.out.println("Test - Arrays Binary Search Recursive  : searchRecursive() - passed ok");
	}
}
