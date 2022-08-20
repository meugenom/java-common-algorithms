package leetcode.MiddleOfTheLinkedList;

/**
 * Definition for singly-linked list.
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
		return "[next=" + next + ", val=" + val + "]";
	}
}

class MiddleOfTheLinkedList {

	public static ListNode middleNode(ListNode head) {

		int length = length(head);
		// System.out.println("lenght : " + length);

		ListNode curr = head;
		int count = 0;

		while (curr != null) {

			if (count == length / 2) {
				System.out.println(curr.toString());
				return curr;
			}

			count++;
			curr = curr.next;
		}

		return head;
	}

	public static int length(ListNode head) {

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

	public static void main(String[] args) {

		ListNode a1 = new ListNode();
		ListNode a2 = new ListNode();
		ListNode a3 = new ListNode();
		ListNode a4 = new ListNode();
		ListNode a5 = new ListNode();

		a1.val = 1;
		a2.val = 2;
		a3.val = 3;
		a4.val = 4;
		a5.val = 5;

		a1.next = a2;
		a2.next = a3;
		a3.next = a4;
		a4.next = a5;
		a5.next = null;

		MiddleOfTheLinkedList s = new MiddleOfTheLinkedList();
		System.out.println(s.middleNode(a1).toString());
	}
}