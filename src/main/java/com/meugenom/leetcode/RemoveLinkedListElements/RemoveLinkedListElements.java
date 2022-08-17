package com.meugenom.leetcode.RemoveLinkedListElements;

/**
 * Given the head of a linked list and an integer val,
 * remove all the nodes of the linked list that has Node.val == val,
 * and return the new head.
 * 
 * Input: head = [1,2,6,3,4,5,6], val = 6
 * Output: [1,2,3,4,5]
 * 
 * Input: head = [], val = 1
 * Output: []
 * 
 * Input: head = [7,7,7,7], val = 7
 * Output: []
 */

class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}

	@Override
	public String toString() {
		return "(" + this.val + ")=>" + this.next;
	}
}

public class RemoveLinkedListElements {

	public static ListNode removeElements(ListNode head, int val) {

		// it needs if we need to remove the first element of our linked list by tests
		ListNode dummy = new ListNode();
		dummy.next = head;
		ListNode curr = head;
		ListNode prev = dummy;

		while (curr != null) {

			if (curr.val == val) {

				prev.next = curr.next;

			} else {
				prev = curr;
			}
			
			//iteration
			curr = curr.next;
		}

		return dummy.next;
	}

	public static void main(String[] args) {
		ListNode a1 = new ListNode(1);
		ListNode a2 = new ListNode(2);
		ListNode a3 = new ListNode(6);
		ListNode a4 = new ListNode(3);
		ListNode a5 = new ListNode(4);
		ListNode a6 = new ListNode(5);
		ListNode a7 = new ListNode(6);

		a1.next = a2;
		a2.next = a3;
		a3.next = a4;
		a4.next = a5;
		a5.next = a6;
		a6.next = a7;

		int val = 6;
		System.out.println(removeElements(a1, val));
	}

}
