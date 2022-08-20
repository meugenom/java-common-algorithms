package leetcode.PalindromeLinkedList;

import java.util.ArrayDeque;
import java.util.Deque;


public class PalindromeLinkedList {

	public static boolean isPalindrome(ListNode head) {
		
		return helper(head);
    }

	public static boolean helper(ListNode head){

		Deque<Integer> dq = new ArrayDeque<>(); 
		
		//fill deque
		while(head != null){
			
			if(head!=null){
				dq.add(head.val);
			}	
			head = head.next;
		}

		int i = 0;
		int j = dq.size();
		while(i != j && i != j - 1){
			
			if(dq.getFirst() != dq.getLast()){
				return false;
			}else{
				dq.removeFirst();
				dq.removeLast();
			}

			i++;
			j--;
		}

		return true;
	}



    public static void main(String[] args) {
        ListNode a1 = new ListNode();
        ListNode a2 = new ListNode();
        ListNode a3 = new ListNode();
        ListNode a4 = new ListNode();
        ListNode a5 = new ListNode();
		ListNode a6 = new ListNode();

        a1.val = 1;
        a2.val = 2;
        a3.val = 5;
        a4.val = 5;
        a5.val = 2;
		a6.val = 1;

        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = a5;
        a5.next = a6;
		a6.next = null;

        
        System.out.println(isPalindrome(a1));
    }
}


//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    @Override
    public String toString() {
        return "[next=" + next + ", val=" + val + "]";
    }
    
 }
 