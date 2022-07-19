package com.meugenom.dataStructures.singlyLinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.meugenom.dataStructures.singlyLinkedList.SinglyLinkedList;


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
	@DisplayName("testing autofill input for null")
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
	@DisplayName("append new value to the end of the list")
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
	@DisplayName("preppend new value to the start of the list")
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
	@DisplayName("delete current position")
	public void testDeletePos(){

		SinglyLinkedList actualList = new SinglyLinkedList();
		int[] arr = new int []{1,2,3,4,5,6,7};
		actualList.autoFill(arr);
		actualList.deletePos(5);

		SinglyLinkedList expectedList = new SinglyLinkedList();
		expectedList.autoFill(new int []{1, 3, 4, 5, 6, 7});

		assertEquals(expectedList.head.toString(), actualList.head.toString(),
		"Delete some position should work");
		
		System.out.println("Test - Singly linked list : delete(position) from the list - passed ok");
	}

	@Test
	@DisplayName("delete first position")
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
	@DisplayName("delete last position")
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
	@DisplayName("find element value by target")
	public void testFind(){

		SinglyLinkedList actualList = new SinglyLinkedList();
		int[] arr = new int []{1,2,3,4,5,6,7};
		actualList.autoFill(arr);
		int actual = actualList.find(5);
		int expected = 4;
		
		assertEquals(expected, actual,
		"Find(element) should work");

		System.out.println("Test - Singly linked list : find(element) element position from the list - passed ok");
	}

	@Test
	@DisplayName("get mid from linked list")
	public void testGetMid(){
		
		
		SinglyLinkedList expectedList = new SinglyLinkedList();
		int[] expectedArr = new int []{9,8,3};
		expectedList.autoFill(expectedArr);
		

		SinglyLinkedList actualList = new SinglyLinkedList();
		int[] actualArr = new int []{9,8,3,6,5};
		actualList.autoFill(actualArr);
		SinglyLinkedListNode head = actualList.head;
		SinglyLinkedListNode actualNode = actualList.getMid(head);

		assertEquals( expectedList.head.toString(), actualNode.toString(),
		"Get middle of Linked List should work");          

		System.out.println("Test - Singly linked list : getMid() - passed ok");         
	}

	@Test
	@DisplayName("merge linked lists")
	public void testMerge(){
		
		SinglyLinkedList expectedList = new SinglyLinkedList();
		int[] expectedArr = new int []{4,5,6,1,2,3};
		expectedList.autoFill(expectedArr);
		
		SinglyLinkedList l1 = new SinglyLinkedList();
		int[] l1Arr = new int []{1,2,3};
		l1.autoFill(l1Arr);
		SinglyLinkedListNode list1 = l1.head;

		SinglyLinkedList l2 = new SinglyLinkedList();
		int[] l2Arr = new int []{4,5,6};
		l2.autoFill(l2Arr);
		SinglyLinkedListNode list2 = l2.head;

		SinglyLinkedList actualList = new SinglyLinkedList();
		SinglyLinkedListNode actualNode = actualList.merge(list1, list2);

		assertEquals( expectedList.head.toString(), actualNode.toString(),
		"Merge Linked Lists should work");

		System.out.println("Test - Singly linked list : merge() - passed ok");         
	}
}
