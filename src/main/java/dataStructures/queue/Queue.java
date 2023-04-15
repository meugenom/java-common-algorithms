package dataStructures.queue;

public class Queue {

	private int[] queue;

	// constructor
	public Queue(int size) {
		queue = new int[size];
	}

	/*
	 * is Queue empty
	 * 
	 * @complexity time O(1)
	 * @complexity space O(1)
	 */
	public boolean isEmpty() {
		return queue[0] == 0;
	}

	/*
	 * add item in the back of Queue
	 * 
	 * @param item
	 * 
	 * @complexity time O(n)
	 * @complexity space O(1)
	 */
	public void enqueue(int item) {
		if (queue[queue.length - 1] != 0) {
			System.out.println("Queue is full");
		} else {
			for (int i = 0; i < queue.length; i++) {
				if (queue[i] == 0) {
					queue[i] = item;
					break;
				}
			}
		}
	}

	/*
	 * remove item from the front of Queue
	 * 
	 * @complexity time O(n)
	 * @complexity space O(1)
	 */
	public void dequeue() {
		if (isEmpty()) {
			System.out.println("Queue is empty");
		} else {
			//remove first item from queue
			for (int i = 0; i < queue.length - 1; i++) {
				queue[i] = queue[i + 1];
			}			
		}
	}

	/*
	 * peek the front of Queue
	 * 
	 * @complexity time O(1)
	 * @complexity space O(1)
	 */
	public int peek() {
		if (isEmpty()) {
			System.out.println("Queue is empty");
			return 0;
		} else {
			return queue[0];
		}
	}

	/*
	 * get size of Queue
	 * 
	 * @complexity time O(n)
	 * @complexity space O(1)
	 */
	public int size() {
		int size = 0;
		for (int i = 0; i < queue.length; i++) {
			if (queue[i] != 0) {
				size++;
			}
		}
		return size;
	}

	/*
	 * print Queue
	 * 
	 * @complexity time O(n)
	 * @complexity space O(1)
	 */
	public void print() {
		for (int i = 0; i < queue.length; i++) {
			System.out.print(queue[i] + " ");
		}
		System.out.println();
	}

}
