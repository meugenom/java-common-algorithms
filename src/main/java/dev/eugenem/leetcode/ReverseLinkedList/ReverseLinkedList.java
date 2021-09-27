package dev.eugenem.leetcode.ReverseLinkedList;

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

public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {

        ListNode a = new ListNode();
        ListNode res = new ListNode();
        res = null;
        a = head;

        while (a != null) {
            head = a;
            while (head != null) {

                if (head.val == a.val && this.length(head) == this.length(a)) {
                    //System.out.println(head.toString());
                    //System.out.println(a.toString());
                    ListNode r = new ListNode();
                    r.val = head.val;
                    r.next = res;
                    res = r;
                }

                head = head.next;
            }
            a = a.next;
        }

        return res;
    }

    public int length(ListNode head) {
        int i = 0;
        while (head != null) {
            i++;
            head = head.next;
        }
        return i;
    }

    public static void main(String[] args) {

        ListNode a1 = new ListNode();
        ListNode a2 = new ListNode();
        ListNode a3 = new ListNode();
        ListNode a4 = new ListNode();

        a1.val = 1;
        a2.val = 1;
        a3.val = 2;
        a4.val = 1;

        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = null;

        ReverseLinkedList s = new ReverseLinkedList();
        System.out.println(s.reverseList(a1).toString());
    }
}