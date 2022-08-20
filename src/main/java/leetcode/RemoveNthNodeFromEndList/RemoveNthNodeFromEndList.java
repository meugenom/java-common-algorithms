package leetcode.RemoveNthNodeFromEndList;

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

public class RemoveNthNodeFromEndList {

	public ListNode removeNthFromEnd(ListNode head, int n) {

		// private case
		if (length(head) - n == 0) {
			return head.next;
		}

		deletePos(length(head) - n, head);
		return head;
	}

	public static void deletePos(int position, ListNode head) {
		// private case
		if (head == null)
			return;

		ListNode temp = head;

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

		ListNode next = temp.next.next;
		// unlink the deleted node from the list
		temp.next = next;
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

		RemoveNthNodeFromEndList r = new RemoveNthNodeFromEndList();
		// System.out.println(r.removeNthFromEnd(a1, 2).toString());

		System.out.println(r.length(a1));
		System.out.println(r.removeNthFromEnd(a1, 2).toString());

	}

}
