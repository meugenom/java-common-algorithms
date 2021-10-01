package dev.eugenem.dataStructures.singlyLinkedList;

import dev.eugenem.dataStructures.stack.ListNode;

public class SinglyLinkedList {

	public ListNode head;

	/**
	 * reverse current singly linked list
	 * 
	 * @param head
	 * @return reversed linked list
	 */
	public void reverse() {

		ListNode curr = new ListNode();
		ListNode res = new ListNode();
		res = null;
		curr = head;

		while (curr != null) {

			head = curr;

			while (head != null) {

				if (head.val == curr.val && this.length(head) == this.length(curr)) {

					ListNode r = new ListNode();
					r.val = head.val;
					r.next = res;
					res = r;
				}

				head = head.next;
			}
			curr = curr.next;
		}

		head = res;
	}

	public void delete(int position){
		
		if(position == 1){
			head = head.next;
		} else {
			ListNode previous = head;
			int i = 1;
			while(i < position - 1){
				previous = previous.next;
				i++;
			}

			ListNode current = previous.next;
			previous.next = current.next;
		}
	}

	/**
	 * @param head
	 * @return length of the linked list
	 */
	public int length() {

		if (head == null) {
			return 0;
		}

		ListNode curr = head;
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
	public int length(ListNode curr) {

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
	 * @param arr
	 */
	public void autoFill(int[] arr) {
		if(arr == null)
			throw new IllegalArgumentException("Input Array isn't exist");

		for(int i = 0; i < arr.length; i++){
			ListNode node = new ListNode();
			node.val = arr[i];
			node.next = head;
			head = node;
		}
	}
}
