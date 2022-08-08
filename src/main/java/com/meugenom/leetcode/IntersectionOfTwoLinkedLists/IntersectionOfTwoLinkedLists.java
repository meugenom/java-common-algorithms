package com.meugenom.leetcode.IntersectionOfTwoLinkedLists;

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
		next = null;
	}
}

public class IntersectionOfTwoLinkedLists {
	
	// Detecting the starting point of the cycle//
	public ListNode findNode(ListNode head) {

		if (head == null && head.next == null)
			return head;

		ListNode slow = head;
		ListNode fast = head;

		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;

			if (fast == slow)
				break;
		}

		if (fast != slow)
			return null;

		slow = head;
		while (fast != slow) {

			fast = fast.next;
			slow = slow.next;
		}

		return slow;
	}

	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

		if (headA == null || headB == null)
			return null;

		ListNode h1 = headA;
		ListNode h2 = headB;

		while (h1.next != null) {
			h1 = h1.next;
		}

		h1.next = h2; // Creating a cycle

		ListNode ans = findNode(headA);
		h1.next = null;
		return ans;

	}
}
