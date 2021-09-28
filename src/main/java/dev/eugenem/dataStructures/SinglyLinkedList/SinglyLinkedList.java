package dev.eugenem.dataStructures.singlyLinkedList;

import dev.eugenem.dataStructures.stack.ListNode;

public class SinglyLinkedList {
    
    /**
     * reverse current singly linked list
     * @param head
     * @return reversed linked list
     */
    public ListNode reverse(ListNode head) {

        ListNode a = new ListNode();
        ListNode res = new ListNode();
        res = null;
        a = head;

        while (a != null) {
            head = a;
            while (head != null) {

                if (head.val == a.val && this.length(head) == this.length(a)) {

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

    /**
     * @param head
     * @return length of the linked list
     */

    public int length(ListNode head) {
        int i = 0;
        while (head != null) {
            i++;
            head = head.next;
        }
        return i;
    }

}
