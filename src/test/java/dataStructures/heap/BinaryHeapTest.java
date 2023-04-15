package dataStructures.heap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;


public class BinaryHeapTest {
	
	@Test
	@DisplayName("Insert a value in the end of the heap")
	public void insert() {
		BinaryHeap heap = new BinaryHeap(10);
		heap.insert(99);
		heap.insert(41);
		heap.insert(22);
		heap.insert(17);
		heap.insert(17);
		int actual = heap.getSize();		

		assertEquals(5, actual, "insert() should work");

		System.out.println("Test - Queue : insert() - passed ok");
	}

	@Test
	@DisplayName("Delete a value from the heap")
	public void delete() {
		BinaryHeap heap = new BinaryHeap(10);
		heap.insert(99);
		heap.insert(41);
		heap.insert(17);
		heap.insert(17);
		heap.delete(0);

		int actual = heap.getSize();		

		assertEquals(3, actual, "delete() should work");

		System.out.println("Test - Queue : delete() - passed ok");
	}

	@Test
	@DisplayName("Sort the heap with order by ascending")
	public void sort() {
		
		BinaryHeap heap = new BinaryHeap(10);
		heap.insert(98);
		heap.insert(23);
		heap.insert(42);
		heap.insert(10);
		heap.insert(17);
		heap.sort();
		String actual = heap.printHeap();

		String expected = "10 17 23 42 98 ";

		assertEquals(expected, actual, "sort() should work");

		System.out.println("Test - Queue : sort() - passed ok");
	}

}
