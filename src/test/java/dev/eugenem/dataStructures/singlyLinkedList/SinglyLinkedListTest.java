package dev.eugenem.dataStructures.singlyLinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


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

	@Test
	public void testAppend(){

		SinglyLinkedList actualList = new SinglyLinkedList();
		int[] arr = new int []{1,2,3,4,5,6,7};
		actualList.autoFill(arr);
		actualList.append(8);

		SinglyLinkedList expectedList = new SinglyLinkedList();
		expectedList.autoFill(new int []{1,2,3,4,5,6,7,8});

		assertEquals(expectedList.head.toString(), actualList.head.toString(),
		"Append new element to the end of the list should work");


		System.out.println("Test - Singly linked list : append(new element) to the end of the list - passed ok");
	}

	@Test
	public void testPreppend(){

		SinglyLinkedList actualList = new SinglyLinkedList();
		int[] arr = new int []{1,2,3,4,5,6,7};
		actualList.autoFill(arr);
		actualList.preppend(0);

		SinglyLinkedList expectedList = new SinglyLinkedList();
		expectedList.autoFill(new int []{0,1,2,3,4,5,6,7});

		assertEquals(expectedList.head.toString(), actualList.head.toString(),
		"Preppend new element to the head should work");

		System.out.println("Test - Singly linked list : preppend(new element) to the start of the list - passed ok");
	}

	@Test
	public void testDeletePos(){

		SinglyLinkedList actualList = new SinglyLinkedList();
		int[] arr = new int []{1,2,3,4,5,6,7};
		actualList.autoFill(arr);
		actualList.deletePos(5);

		SinglyLinkedList expectedList = new SinglyLinkedList();
		expectedList.autoFill(new int []{1,2,3,4,5,7});

		assertEquals(expectedList.head.toString(), actualList.head.toString(),
		"Delete some position should work");
		
		System.out.println("Test - Singly linked list : delete(position) from the list - passed ok");
	}

	@Test
	public void testDeleteFirst(){

		SinglyLinkedList actualList = new SinglyLinkedList();
		int[] arr = new int []{1,2,3,4,5,6,7};
		actualList.autoFill(arr);
		actualList.deleteFirst();

		SinglyLinkedList expectedList = new SinglyLinkedList();
		expectedList.autoFill(new int []{2,3,4,5,6,7});

		assertEquals(expectedList.head.toString(), actualList.head.toString(),
		"DeleteFirst() delete first position should work");
		
		System.out.println("Test - Singly linked list : deleteFirst() remove first position from the list - passed ok");
	}

	@Test
	public void testDeleteLast(){

		SinglyLinkedList actualList = new SinglyLinkedList();
		int[] arr = new int []{1,2,3,4,5,6,7};
		actualList.autoFill(arr);
		actualList.deleteLast();

		SinglyLinkedList expectedList = new SinglyLinkedList();
		expectedList.autoFill(new int []{1,2,3,4,5,6});

		assertEquals(expectedList.head.toString(), actualList.head.toString(),
		"DeleteLast() delete last position should work");
		
		System.out.println("Test - Singly linked list : deleteLast() remove last position from the list - passed ok");
	}

	@Test
	public void testFind(){

		SinglyLinkedList actualList = new SinglyLinkedList();
		int[] arr = new int []{1,2,3,4,5,6,7};
		actualList.autoFill(arr);
		int actual = actualList.find(5);
		int expected = 4;
		
		assertEquals(expected, actual,
		"Find(position) should work");

		System.out.println("Test - Singly linked list : find(position) int the list - passed ok");
	}

}
