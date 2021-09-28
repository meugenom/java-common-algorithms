package dev.eugenem.leetcode.PalindromeLinkedList;

//easy 
// 69 / 85 test cases passed.
// code is not optimal for big data

public class PalindromeLinkedList {

    public ListNode resultat;

    public boolean isPalindrome(ListNode head) {
        this.resultat = new ListNode();
        this.helper(head);
        
        if(resultat == null || this.length(resultat) == 1) {
            return true;
        }
     return false;
    }

    public void helper(ListNode head) {

        ListNode a = new ListNode();
        ListNode res = new ListNode();
        res = null;
        a = head;
        int start = a.val;
        int end;
        int index = 0;

        while (a != null) {
            
            if(a.next==null){

                end = a.val;

                if(start == end && res != null && this.length(res) > 1) {

                    this.helper(res);

                }else if(start != end) {

                    this.resultat = head;

                }else if(res == null) {

                    this.resultat = res;

                }
            }

            if(index != 0 && a != null && a.next != null) {
                ListNode r = new ListNode();
                r.val = a.val;
                r.next = res;
                res = r;
            }

            a = a.next;
            index++;
        }
    }

    public int length(ListNode head){
        int i = 0;
        ListNode a = head;
        a = head;
        while(a!=null){
            a = a.next;
            i++;
        }
        return i;
    }


    public static void main(String[] args) {
        ListNode a1 = new ListNode();
        ListNode a2 = new ListNode();
        ListNode a3 = new ListNode();
        ListNode a4 = new ListNode();
        ListNode a5 = new ListNode();

        a1.val = 1;
        a2.val = 2;
        a3.val = 1;
        a4.val = 2;
        a5.val = 1;

        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = a5;
        a5.next = null;

        PalindromeLinkedList p = new PalindromeLinkedList();
        System.out.println(p.isPalindrome(a1));
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
 