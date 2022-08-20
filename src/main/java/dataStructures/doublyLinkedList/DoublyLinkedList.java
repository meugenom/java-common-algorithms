package dataStructures.doublyLinkedList;

import java.util.NoSuchElementException;

public class DoublyLinkedList {

	public DoublyLinkedListNode head;
	public DoublyLinkedListNode tail;
	public int length;

	public DoublyLinkedList() {
		this.head = null;
		this.tail = null;
		this.length = 0;
	}

	/**
	 * added new value to the end of the list
	 * @param data -value
	 */
	public void append(int data) {

		DoublyLinkedListNode newNode = new DoublyLinkedListNode(data);
		newNode.next = null;

		if (isEmpty()) {

			tail = newNode;
			head = tail;

		} else {

			tail.next = newNode;
			newNode.previous = tail;
			tail = newNode;
		}

		length++;
	}

	/**
	 * add new value to the start of the list
	 * @param data
	 */
	public void preppend(int data) {

		DoublyLinkedListNode newNode = new DoublyLinkedListNode(data);
		newNode.next = null;

		if (isEmpty()) {

			head = newNode;
			tail = head;

		} else {

			head.previous = newNode;
			newNode.next = head;
			head = newNode;
		}

		length++;
	}

	/**
	 * @return printed list from head to tail
	 */
	public String printHead() {

		DoublyLinkedListNode current = head;

		String out = "";

		if (head == null) {
			System.out.println("List is empty");
			return out;
		}

		while (current != null) {

			String prevoius = (current.previous != null) ? String.valueOf(current.previous.data) : "null";
			String next = (current.next != null) ? String.valueOf(current.next.data) : "null";

			out = out + "[" + prevoius + "<-(" + current.data + ")->" + next + "]";

			current = current.next;

			if (current != null) {
				out = out + " <-> ";
			}
		}
		return out;
	}

	/**
	 * @return printed list from tail to head
	 */
	public String printTail() {

		DoublyLinkedListNode current = tail;

		String out = "";

		if (tail == null) {
			System.out.println("List is empty");
			return out;
		}

		while (current != null) {

			String prevoius = (current.previous != null) ? String.valueOf(current.previous.data) : "null";
			String next = (current.next != null) ? String.valueOf(current.next.data) : "null";

			out = out + "[" + next + "<-(" + current.data + ")->" + prevoius + "]";

			current = current.previous;

			if (current != null) {
				out = out + " <-> ";
			}
		}
		return out;
	}

	/**
	 * @return boolean value if rhe list is empty
	 */
	public boolean isEmpty() {
		return length == 0;
	}

	/**
	 * @return length of the list
	 */
	public int length() {
		return length;
	}

	/**
	 *  remove first element in the list
	 * @throws Exception then list is empty
	 */
	public void deleteFirst() throws Exception {

		if (this.isEmpty()) {
			throw new NoSuchElementException();
		}

		if (tail == head) {
			tail = null;
		} else {
			head.next.previous = null;
		}

		head = head.next;
		head.previous = null;
		length--;

	}

	/**
	 * remove last element in the list
	 * @throws Exception then the list is empty
	 */
	public void deleteLast() throws Exception {

		if (isEmpty()) {
			throw new NoSuchElementException();
		}

		if (head == tail) {
			head = null;
		} else {
			tail.next = null;
		}

		tail = tail.previous;
		tail.next = null;
		length--;

	}

}
