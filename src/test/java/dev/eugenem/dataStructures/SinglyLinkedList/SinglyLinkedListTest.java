package dev.eugenem.dataStructures.SinglyLinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class SinglyLinkedListTest {

	private SinglyLinkedList actualList;

	@BeforeEach                                         
    public void setUp() throws Exception {
		actualList = new SinglyLinkedList();                
		
		int[] arr = new int []{1,2,3,4,5,6,7};
		actualList.autoFill(arr);
	}

	@Test
	@DisplayName("autofill linked list with array")
	public void testAutoFill(){
		
		SinglyLinkedList expectedList = new SinglyLinkedList();
		int[] expectedArr = new int []{1,2,3,4,5,6,7};
		expectedList.autoFill(expectedArr);

		assertEquals( expectedList.head.toString(), actualList.head.toString(),
		"AutoFill should work");          
	}

	@Test
	@DisplayName("reversel linked list")
	public void testReverse(){
		
		SinglyLinkedList expectedList = new SinglyLinkedList();
		int[] expectedArr = new int []{7,6,5,4,3,2,1};
		expectedList.autoFill(expectedArr);

		actualList.reverse();

		assertEquals( expectedList.head.toString(), actualList.head.toString(),
		"Reverse should work");          
	}

	@Test
	@DisplayName("length of the linked list")
	public void testLength(){
		
		int expected = actualList.length();

		assertEquals(expected, 7,
		"Length should work");
	}

	@Test
	public void testAutoFill_IS_NULL(){

		int[] expectedArr = null;
		SinglyLinkedList expectedList = new SinglyLinkedList();

		assertThrows(IllegalArgumentException.class, () -> {
			expectedList.autoFill(expectedArr);
			fail("Probe to create linked list from null array");
		});
	}

}
