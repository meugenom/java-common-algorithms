package dataStructures.queue;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;



public class QueueTest {
	
	@Test
	@DisplayName("Check if Queue is empty")
	public void testIsEmpty() {
		Queue q = new Queue(5);
		boolean actual = q.isEmpty();
		boolean expected = true;

		assertEquals(expected, actual, "isEmpty() should work");

		System.out.println("Test - Queue : isEmpty() - passed ok");
	}

	@Test
	@DisplayName("Test peek() method")
	public void testPeek() {
		Queue q = new Queue(5);
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
		int actual = q.peek();
		int expected = 1;

		assertEquals(expected, actual, "peek() should work");

		System.out.println("Test - Queue : peek() - passed ok");
	}

	@Test
	@DisplayName("Test enqueue() method")
	public void testEnqueue() {
		Queue q = new Queue(5);
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
		int actual = q.peek();
		int expected = 1;

		assertEquals(expected, actual, "enqueue() should work");

		System.out.println("Test - Queue : enqueue() - passed ok");
	}

	@Test
	@DisplayName("Test dequeue() method")
	public void testDequeue() {
		Queue q = new Queue(5);
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
		q.dequeue();
		int actual = q.peek();
		int expected = 2;

		assertEquals(expected, actual, "dequeue() should work");

		System.out.println("Test - Queue : dequeue() - passed ok");
	}

}
