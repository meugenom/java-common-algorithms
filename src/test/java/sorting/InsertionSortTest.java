package sorting;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class InsertionSortTest {

	@Test
	@DisplayName(" Insertion Sort")
	public void testInsertionSort() {

		InsertionSort inSort = new InsertionSort();

		int[] actualArr = new int[] { 99, 85, 1, 25, 20, 7, 65, 11, 13, 14, 7, 0, 87 };
		inSort.insertionSort(actualArr);
		String actual = inSort.print(actualArr);

		String expected = "[ 0, 1, 7, 7, 11, 13, 14, 20, 25, 65, 85, 87, 99]";

		assertEquals(expected, actual, "Insertion Sort should work");
		System.out.println("Test - Insertion Sort: insertionSort() - passed ok");

	}
}
