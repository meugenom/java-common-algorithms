package dataStructures.doublyLinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class DoublyLinkedListTest {
	@Test
	@DisplayName("add value to the end of the list")
	public void testAppend() {
		DoublyLinkedList actualList = new DoublyLinkedList();

		actualList.append(4);
		actualList.append(0);
		actualList.append(9);

		String actual = actualList.printHead();
		String expected = "[null<-(4)->0] <-> [4<-(0)->9] <-> [0<-(9)->null]";

		assertEquals(expected , actual, "append(data) should work");
		System.out.println("Test - Doubly Linked List : append(data) - passed ok");

	}

	@Test
	@DisplayName("add value to the start of the list")
	public void testPreppend() {
		DoublyLinkedList actualList = new DoublyLinkedList();

		actualList.preppend(1);
		actualList.preppend(3);
		actualList.preppend(7);

		String actual = actualList.printHead();
		String expected = "[null<-(7)->3] <-> [7<-(3)->1] <-> [3<-(1)->null]";

		assertEquals(expected , actual, "preppend(data) should work");
		System.out.println("Test - Doubly Linked List : preppend(data) - passed ok");

	}

	@Test
	@DisplayName("remove element from the head of the list")
	public void testDeleteFirst() throws Exception {
		DoublyLinkedList actualList = new DoublyLinkedList();

		actualList.preppend(1);
		actualList.preppend(3);
		actualList.preppend(7);
		actualList.deleteFirst();

		String actual = actualList.printHead();
		String expected = "[null<-(3)->1] <-> [3<-(1)->null]";

		assertEquals(expected , actual, "deleteFirst() should work");
		System.out.println("Test - Doubly Linked List : deleteFirst() - passed ok");

	}

	@Test
	@DisplayName("remove element from the end of the list")
	public void testDeleteLast() throws Exception {
		DoublyLinkedList actualList = new DoublyLinkedList();

		actualList.preppend(1);
		actualList.preppend(3);
		actualList.preppend(7);
		actualList.deleteLast();

		String actual = actualList.printHead();
		String expected = "[null<-(7)->3] <-> [7<-(3)->null]";

		assertEquals(expected , actual, "deleteLast() should work");
		System.out.println("Test - Doubly Linked List : deleteLast() - passed ok");

	}


	@Test
	void testIsEmpty() {

	}

	@Test
	void testLength() {

	}
}
