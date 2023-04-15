package dataStructures.heap;

public class BinaryHeap {
	
	// The heap binary tree
	private int[] heap;
	
	// The size of the heap
	private int size;

	// Constructor
	public BinaryHeap(int capacity) {
		heap = new int[capacity];
	}

	// Get the size of the heap
	public int getSize() {
		return size;
	}

	// Set the size of the heap
	public void setSize(int size) {
		this.size = size;
	}

	/**
	 * Insert a value in the end of the heap
	 * @param value
	 * 
	 * @complexity time O(log n)
	 * @complexity space O(1)
	*/
	public void insert(int value) {
		if (isFull()) {
			throw new IndexOutOfBoundsException("Heap is full");
		}
		heap[size] = value;
		fixHeapAbove(size);
		size++;
	}

	/**
	 * Delete a value from the heap by index
	 * 
	 * @param index
	 * @return the deleted value
	 * 
	 * @complexity time O(log n)
	 * @complexity space O(1)
	 */
	public int delete(int index) {
		if (isEmpty()) {
			throw new IndexOutOfBoundsException("Heap is empty");
		}
		int parent = getParent(index);
		int deletedValue = heap[index];
		heap[index] = heap[size - 1];
		if (index == 0 || heap[index] < heap[parent]) {
			fixHeapBelow(index, size - 1);
		} else {
			fixHeapAbove(index);
		}
		size--;
		return deletedValue;
	}

	/**
	 * Sort the heap with order by ascending
	 * 
	 * @complexity time O(n log n)
	 * @complexity space O(1)
	 */
	public void sort() {
		int lastHeapIndex = size - 1;
		for (int i = 0; i < lastHeapIndex; i++) {
			int temp = heap[0];
			heap[0] = heap[lastHeapIndex - i];
			heap[lastHeapIndex - i] = temp;
			fixHeapBelow(0, lastHeapIndex - i - 1);
		}
	}

	/**
	 * Fix Heap Above
	 * @param index
	 * 
	 * @complexity time O(log n)
	 * @complexity space O(1)
	 */
	private void fixHeapAbove(int index) {
		int newValue = heap[index];
		while (index > 0 && newValue > heap[getParent(index)]) {
			heap[index] = heap[getParent(index)];
			index = getParent(index);
		}
		heap[index] = newValue;
	}

	/**
	 * Fix Heap Below
	 * @param index
	 * @param lastHeapIndex
	 * 
	 * @complexity time O(log n)
	 * @complexity space O(1)
	 */
	private void fixHeapBelow(int index, int lastHeapIndex) {
		int childToSwap;
		while (index <= lastHeapIndex) {
			int leftChild = getChild(index, true);
			int rightChild = getChild(index, false);
			if (leftChild <= lastHeapIndex) {
				if (rightChild > lastHeapIndex) {
					childToSwap = leftChild;
				} else {
					childToSwap = (heap[leftChild] > heap[rightChild] ? leftChild : rightChild);
				}
				if (heap[index] < heap[childToSwap]) {
					int temp = heap[index];
					heap[index] = heap[childToSwap];
					heap[childToSwap] = temp;
				} else {
					break;
				}
				index = childToSwap;
			} else {
				break;
			}
		}
	}

	// Get the parent of a node
	private int getParent(int index) {
		return (index - 1) / 2;
	}

	// Get the child of a node
	private int getChild(int index, boolean left) {
		return 2 * index + (left ? 1 : 2);
	}

	// Check if the heap is empty
	public boolean isEmpty() {
		return size == 0;
	}

	// Check if the heap is full
	public boolean isFull() {
		return size == heap.length;
	}

	// Print the heap
	public String printHeap() {
		String out = "";
		for (int i = 0; i < size; i++) {
			System.out.print(out += heap[i] + " ");
		}
		return out;
	}	
	
}
