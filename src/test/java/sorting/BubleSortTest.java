package sorting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;



public class BubleSortTest {
	
	@Test
	@DisplayName("buble sorting with Integers")
	public void testSortIntegerArray() {

		Integer[] actualArray = new Integer[] { 7, 10, 8, 9, 2, 5, 3, 1, 0, -1, 4 };

		BubleSort<Integer[]> bs = new BubleSort<Integer[]>();
		
		bs.set(actualArray);
		bs.sort();

		String actual = bs.display();
		String expected = "[ -1, 0, 1, 2, 3, 4, 5, 7, 8, 9, 10]";
		
		assertEquals(expected, actual, "buble sorting with Integers should work");
		System.out.println("Test - Sorting : Buble sort()  - passed ok");

	}


	@Test
	@DisplayName("buble sorting with Strings")
	public void testSortStringArray() {

		String[] actualArray = new String[] { "h", "a", "v", "c", "t", "i", "r" };

		BubleSort<String[]> bs = new BubleSort<String[]>();
		
		bs.set(actualArray);
		bs.sort();
		String actual = bs.display();
		String expected = "[ a, c, h, i, r, t, v]";
		
		assertEquals(expected, actual, "buble sorting with Strings should work");

		System.out.println("Test - Sorting : Buble sort()  - passed ok");

	}
}
