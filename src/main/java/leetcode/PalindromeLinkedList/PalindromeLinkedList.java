package leetcode.PalindromeLinkedList;

/***
 * Given the head of a singly linked list, return true if it is a palindrome.
 * 
 * Example 1:
 * Input: head = [1,2,2,1]
 * Output: true
 * 
 * Example 2:
 * Input: head = [1,2]
 * Output: false
 * 
 * TC.: O();
 * S.C.: O().
 */

// import java.util.ArrayDeque;
// import java.util.Deque;

public class PalindromeLinkedList {

	public static boolean isPalindrome(ListNode head) {

		// base cases
		if (head == null || head.next == null)
			return true;

		ListNode left = head;
		ListNode right = null;

		// need to know even or odd numbers of nodes
		int count = 0;
		int evenOdd = 0;
		ListNode curr = head;
		while (curr != null) {
			count++;
			evenOdd = count % 2;
			curr = curr.next;
		}

		while (left != null) {
			
			//if (evenOdd == 1 && compareHelper(right, left.next)) {
				if (evenOdd == 1 && right==left.next) {
				return true;
			}
			//if (evenOdd == 0 && compareHelper(right, left)) {
			if (evenOdd == 0 && right==left) {
				return true;
			}

			// System.out.println(right);
			// System.out.println(left);

			ListNode tmp = new ListNode(left.val);
			tmp.next = right;
			right = tmp;

			left = left.next;

		}

		return false;
	}

	public static boolean compareHelper(ListNode n1, ListNode n2) {

		if (n1 == null || n2 == null)
			return false;

		while (n1 != null) {

			if (n2 == null)
				return false;

			if (n1.val != n2.val) {
				return false;
			}

			n1 = n1.next;
			n2 = n2.next;
		}

		if (n2 != null)
			return false;

		return true;
	}

	// classic solving with Deques
	/*
	 * public static boolean isPalindrome(ListNode head) {
	 * 
	 * return helper(head);
	 * }
	 * 
	 * public static boolean helper(ListNode head) {
	 * 
	 * Deque<Integer> dq = new ArrayDeque<>();
	 * 
	 * // fill deque
	 * while (head != null) {
	 * 
	 * if (head != null) {
	 * dq.add(head.val);
	 * }
	 * head = head.next;
	 * }
	 * 
	 * int i = 0;
	 * int j = dq.size();
	 * while (i != j && i != j - 1) {
	 * 
	 * if (dq.getFirst() != dq.getLast()) {
	 * return false;
	 * } else {
	 * dq.removeFirst();
	 * dq.removeLast();
	 * }
	 * 
	 * i++;
	 * j--;
	 * }
	 * 
	 * return true;
	 * }
	 */

	public static void main(String[] args) {
		ListNode a1 = new ListNode();
		ListNode a2 = new ListNode();
		ListNode a3 = new ListNode();
		ListNode a4 = new ListNode();
		ListNode a5 = new ListNode();
		ListNode a6 = new ListNode();

		a1.val = 1;
		a2.val = 0;
		a3.val = 1;
		a4.val = 1;
		// a5.val = 2;
		// a6.val = 1;

		a1.next = a2;
		a2.next = a3;
		a3.next = a4;
		a4.next = null;// a5;
		// a5.next = a6;
		// a6.next = null;

		System.out.println(isPalindrome(a1));
	}
}

// Definition for singly-linked list.
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
