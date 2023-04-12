package generics;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GenericArrayTest {
	@Test
	@DisplayName("Test Generic for Integer")
	public void testInteger() {
		GenericArray<Integer> arr = new GenericArray<>(3);
		arr.set(0, 10);
		arr.set(1, 20);
		arr.set(2, 30);

		assertEquals(Integer.valueOf(10), arr.get(0));
		assertEquals(Integer.valueOf(20), arr.get(1));
		assertEquals(Integer.valueOf(30), arr.get(2));
		System.out.println("Test - GenericArray : Integer - passed ok");
	}

	@Test
	@DisplayName("Test Generic for String")
	public void testString() {
		GenericArray<String> arr = new GenericArray<>(4);
		arr.set(0, "Hello");
		arr.set(1, " ");
		arr.set(2, "World");
		arr.set(3, "!");

		String expected = "Hello World!";
		String actual = arr.get(0) + arr.get(1) + arr.get(2) + arr.get(3);
		assertEquals(expected, actual);
		System.out.println("Test - GenericArray : String - passed ok");
	}

	@Test
	@DisplayName("Test Get Size")
	public void testGetSize() {
		GenericArray<Integer> arr = new GenericArray<>(5);

		assertEquals(5, arr.getSize());
		System.out.println("Test - GenericArray : getSize() - passed ok");
	}

}
