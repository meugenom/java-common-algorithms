package com.meugenom.leetcode.MergeTwoSortedLists;

public class MergeTwoSortedLists {

    private ListNode root;

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if (l1 == null && l2 == null) {
			return null;
		} else if (l1 == null && l2 != null){
			return l2;
		} else if (l1 != null && l2 == null){
			return l1;
		}

        root = l2;
                
        while(l1!=null){

            ListNode r = new ListNode();
            r.val = l1.val;
            r.next = root;
            root = r;

            l1 = l1.next;
        }

        return  this.sort();
    }

    public ListNode sort() {

        ListNode current = root;
        ListNode a = new ListNode();
        int tmp;

        while (current.next != null) {

            a = current;

            while (a.next != null) {

                a = a.next;

                if (current.val > a.val) {

                    tmp = current.val;
                    current.val = a.val;
                    a.val = tmp;
                }
            }

            current = current.next;
        }

        return root;
    }


    public static void main(String[] args) {

        ListNode a1 = new ListNode(); 
        ListNode a2 = new ListNode(); 
        ListNode a3 = new ListNode();        
        
        a1.val = 1;
        a2.val = 2;
        a3.val = 3;    
        a1.next  = a2;
        a2.next  = a3;
        a3.next  = null;
        

        ListNode b1 = new ListNode();
        ListNode b2 = new ListNode();
        ListNode b3 = new ListNode();

        b1.val = 1;
        b2.val = 3;
        b3.val = 4;

        
        b1.next  = b2;
        b2.next  = b3;
        b3.next  = null;

        MergeTwoSortedLists s = new MergeTwoSortedLists();
        s.mergeTwoLists(a1, b1);
    }
}


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
