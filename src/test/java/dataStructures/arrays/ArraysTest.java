package dataStructures.arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

public class ArraysTest {

	private Arrays arr = new Arrays();

	@Test
	@DisplayName("Find minimal value")
	public void testFindMin() {
		
		arr.autoFill();
		int actual = arr.findMin();
		int expected = -4;

		assertEquals(expected, actual, "Find minimum should work");
		System.out.println("Test - Arrays : findMin() - passed ok");
	}

	@Test
	@DisplayName("Remove element by index")
	public void testRemove() {
		
		int index  = 2;
		arr.autoFill();
		arr.remove(index);
		String actual =  arr.toString();

		int[] expectedArray = new int[]{1, 3, 8, 2, 4, 7, 11, 25, 63, 32, 0, -4};

		arr.set(expectedArray);
		String expected = arr.toString();

		assertEquals(expected, actual, "Remove element by index should work");
		System.out.println("Test - Arrays : remove(index) - passed ok");
	}

	@Test
	@DisplayName("Remove last element")
	public void testPop() {
		
		arr.autoFill();
		arr.pop();
		String actual =  arr.toString();

		int[] expectedArray = new int[]{1, 3, 6, 8, 2, 4, 7, 11, 25, 63, 32, 0};

		arr.set(expectedArray);
		String expected = arr.toString();

		assertEquals(expected, actual, "Remove last element should work");
		System.out.println("Test - Arrays : pop() - passed ok");
	}

	@Test
	@DisplayName("Add element to the end of the array")
	public void testPush() {
		
		arr.autoFill();
		arr.push(19);
		String actual =  arr.toString();

		int[] expectedArray = new int[]{1, 3, 6, 8, 2, 4, 7, 11, 25, 63, 32, 0, -4, 19};

		arr.set(expectedArray);
		String expected = arr.toString();

		assertEquals(expected, actual, "Add element to the end of the array should work");
		System.out.println("Test - Arrays : push(element) - passed ok");
	}

	@Test
	@DisplayName("Reverse all elements in the array")
	public void testReverse() {
		
		arr.autoFill();
		arr.reverse();
		String actual =  arr.toString();

		int[] expectedArray = new int[]{-4, 0, 32, 63, 25, 11, 7, 4, 2, 8, 6, 3, 1};

		arr.set(expectedArray);
		String expected = arr.toString();

		assertEquals(expected, actual, "Reverse array should work");
		System.out.println("Test - Arrays : reverse() - passed ok");
	}

	@Test
	@DisplayName("Find size elements in the array")
	public void testSize() {
		
		arr.autoFill();
		int actual = arr.size();
		
		int[] expectedArray = new int[]{-4, 0, 32, 63, 25, 11, 7, 4, 2, 8, 6, 3, 1};
		int expected = expectedArray.length;

		assertEquals(expected, actual, "Return size of the array should work");
		System.out.println("Test - Arrays : size() - passed ok");
	}

	@Test
	@DisplayName("Sort all elements in the array")
	public void testSort() {
		
		arr.autoFill();
		arr.sort();
		String actual = arr.toString();
		
		int[] expectedArray = new int[]{-4, 0, 1, 2, 3, 4, 6, 7, 8, 11, 25, 32, 63};
		arr.set(expectedArray);
		String expected = arr.toString();

		assertEquals(expected, actual, "Sort array should work");
		System.out.println("Test - Arrays : sort() - passed ok");
	}

	@Test
	public void testSet_IS_NULL() {

		int[] expectedArr = null;

		assertThrows(IllegalArgumentException.class, () -> {
			arr.set(expectedArr);
			fail("Probe to input null array");
		});
		System.out.println("Test - Arrays : add  NULL array - passed ok");
	}
}
