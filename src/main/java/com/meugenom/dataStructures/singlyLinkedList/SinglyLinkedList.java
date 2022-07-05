package com.meugenom.dataStructures.singlyLinkedList;

public class SinglyLinkedList {

	public SinglyLinkedListNode head;

	/**
	 * attach new node to the end of the list
	 * 
	 * @param data
	 */
	public SinglyLinkedListNode append(int data) {

		SinglyLinkedListNode node = new SinglyLinkedListNode();

		if (head == null) {
			head = node;
			return head;
		}

		node.data = data;
		node.next = head;
		head = node;
		return head;

	}

	/**
	 * attach new node to the head and of the list
	 * 
	 * @param data
	 * @return head
	 */
	public SinglyLinkedListNode preppend(int data) {

		SinglyLinkedListNode node = new SinglyLinkedListNode();
		SinglyLinkedListNode current = head;
		if (head == null) {
			head = node;
			return head;
		}

		while (current.next != null) {
			current = current.next;
		}
		node.data = data;
		current.next = node;

		return head;
	}

	/**
	 * reverse current singly linked list
	 * 
	 * @param head
	 * @return reversed linked list
	 */
	public void reverse() {

		SinglyLinkedListNode curr = new SinglyLinkedListNode();
		SinglyLinkedListNode res = new SinglyLinkedListNode();
		res = null;
		curr = head;

		while (curr != null) {

			head = curr;

			while (head != null) {

				if (head.data == curr.data && this.length(head) == this.length(curr)) {

					SinglyLinkedListNode r = new SinglyLinkedListNode();
					r.data = head.data;
					r.next = res;
					res = r;
				}

				head = head.next;
			}
			curr = curr.next;
		}

		head = res;
	}

	/**
	 * delete some position from linked list start position in the list = 0;
	 * 
	 * @param position
	 */
	public void deletePos(int position) {

		// private case
		if (head == null)
			return;

		SinglyLinkedListNode temp = head;

		// private case
		if (position == 0) {
			head = temp.next;
			return;
		}

		// find previous node of the node to be deleted
		for (int i = 0; temp != null && i < position - 1; i++) {
			temp = temp.next;
		}

		// if position is more than number of nodes
		if (temp == null || temp.next == null)
			return;

		SinglyLinkedListNode next = temp.next.next;
		
		// unlink the deleted node from the list
		temp.next = next;
	}

	/**
	 * delete first position from the list
	 */
	public void deleteFirst() {

		SinglyLinkedListNode previous = head;
		int i = this.length();

		while (i > 2) {
			previous = previous.next;
			i--;
		}

		SinglyLinkedListNode current = previous.next;
		previous.next = current.next;
	}

	/**
	 * delete last position from the list
	 */
	public void deleteLast() {

		head = head.next;

	}

	/**
	 * 
	 * @param data
	 * @return position of value
	 */
	public int find(int data) {

		SinglyLinkedListNode curr = head;

		int count = this.length() - 1;

		while (curr != null) {

			if (curr.data == data) {
				return count;
			}

			curr = curr.next;
			count--;
		}

		return count;
	}

	/**
	 * @param head
	 * @return length of the linked list
	 */
	public int length() {

		if (head == null) {
			return 0;
		}

		SinglyLinkedListNode curr = head;
		int count = 0;

		while (curr != null) {
			count++;
			curr = curr.next;
		}
		return count;
	}

	/**
	 * @param current ListNode
	 * @return length of the linked list
	 */
	public int length(SinglyLinkedListNode curr) {

		if (head == null) {
			return 0;
		}

		int count = 0;

		while (curr != null) {
			count++;
			curr = curr.next;
		}
		return count;
	}

	/**
	 * autofill linkedList from the array
	 * 
	 * @param arr
	 */
	public void autoFill(int[] arr) {
		if (arr == null)
			throw new IllegalArgumentException("Input Array isn't exist");

		for (int i = 0; i < arr.length; i++) {
			SinglyLinkedListNode node = new SinglyLinkedListNode();
			node.data = arr[i];
			node.next = head;
			head = node;
		}
	}
}
