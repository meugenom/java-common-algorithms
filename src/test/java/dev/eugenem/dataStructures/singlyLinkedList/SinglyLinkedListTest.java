package dev.eugenem.dataStructures.SinglyLinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import dev.eugenem.dataStructures.singlyLinkedList.SinglyLinkedList;

public class SinglyLinkedListTest {

	@Test
	@DisplayName("autofill linked list with array")
	public void testAutoFill(){

		SinglyLinkedList actualList = new SinglyLinkedList();
		int[] arr = new int []{1,2,3,4,5,6,7};
		actualList.autoFill(arr);
		
		SinglyLinkedList expectedList = new SinglyLinkedList();
		int[] expectedArr = new int []{1,2,3,4,5,6,7};
		expectedList.autoFill(expectedArr);

		assertEquals( expectedList.head.toString(), actualList.head.toString(),
		"AutoFill should work"); 
		System.out.println("Test - Singly linked list : autoFill() - passed ok");         
	}

	@Test
	@DisplayName("reversed linked list")
	public void testReverse(){
		
		SinglyLinkedList expectedList = new SinglyLinkedList();
		int[] expectedArr = new int []{7,6,5,4,3,2,1};
		expectedList.autoFill(expectedArr);

		SinglyLinkedList actualList = new SinglyLinkedList();                
		int[] arr = new int []{1,2,3,4,5,6,7};
		actualList.autoFill(arr);
		actualList.reverse();

		assertEquals( expectedList.head.toString(), actualList.head.toString(),
		"Reverse should work");          

		System.out.println("Test - Singly linked list : reverse() - passed ok");         
	}

	@Test
	@DisplayName("length of the linked list")
	public void testLength(){
		
		SinglyLinkedList actualList = new SinglyLinkedList();
		int[] arr = new int []{1,2,3,4,5,6,7};
		actualList.autoFill(arr);

		int expected = actualList.length();

		assertEquals(expected, 7,
		"Length should work");

		System.out.println("Test - Singly linked list : length() - passed ok");
	}

	@Test
	public void testAutoFill_IS_NULL(){

		int[] expectedArr = null;
		SinglyLinkedList expectedList = new SinglyLinkedList();

		assertThrows(IllegalArgumentException.class, () -> {
			expectedList.autoFill(expectedArr);
			fail("Probe to create linked list from null array");
		});

		System.out.println("Test - Singly linked list : create linked list with NULL array - passed ok");
	}

}
