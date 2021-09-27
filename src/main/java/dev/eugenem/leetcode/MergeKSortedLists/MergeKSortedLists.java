package dev.eugenem.leetcode.MergeKSortedLists;


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
        return "ListNode [next=" + next + ", val=" + val + "]";
    }

}


public class MergeKSortedLists {

    public ListNode root;

    public ListNode mergeKLists(ListNode[] lists) { 

        ListNode a = new ListNode();
        boolean countNotNull = false;
        ListNode nullPoint = new ListNode();
        nullPoint = null;

        if(lists.length == 0)
            return nullPoint;

        if(lists.length == 1 && lists[0] == null) {
            return nullPoint;
        }

            for (int i = 0; i < lists.length; i++) {

                if(lists[i] != null) {
                    a = lists[i];
                    this.root = new ListNode(a.val, this.root);
                    while (a.next != null) {
                        a = a.next;
                        this.root = new ListNode(a.val, this.root);
                    }

                    countNotNull = true;

                }
             }

        if(countNotNull == true){
            this.sort();
        }else{
            return nullPoint;
        }

        return this.root;

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

        return this.root;

    }

    public int length() {

        ListNode a = this.root;

        if (this.root == null) {
            return 0;
        }

        int length = 1;

        while (a.next != null) {

            length++;
            a = a.next;
        }

        return length;
    }

    public void set(int i, int val) {

        ListNode a = this.root;

        int j = 0;
        if (j == i) {
            a.val = val;
        }

        while (a.next != null) {

            if (i == j) {
                a.val = val;
            }
            a = a.next;
            j++;

        }

    }

    public Integer get(int i) {

        ListNode a = this.root;

        int j = 0;
        if (j == i) {
            return a.val;
        }

        while (a.next != null) {

            if (i == j) {
                return a.val;
            }
            a = a.next;
            j++;

        }

        return a.val;
    }


    @Override
    public String toString() {
        String data = "[";
        ListNode curNode = root;

        int counter = 0;

        while (curNode != null) {
            if (counter == 0) {
                data += String.format("%s ", curNode.val);
            } else {
                data += String.format(", %s ", curNode.val);
            }

            curNode = curNode.next;
            counter++;
        }
        data += "]";
        return data;
    }


    public static void main(String[] args) {
        /**
         * Input: lists = [[1,4,5],[1,3,4],[2,6]] Output: [1,1,2,3,4,4,5,6]
         */

        ListNode l1 = new ListNode();
        ListNode l2 = new ListNode();
        ListNode l3 = new ListNode();
        l1.val = 1;
        l2.val = 4;
        l3.val = 5;
        l1.next = l2;
        l2.next = l3;
        l3.next = null;

        ListNode l4 = new ListNode();
        ListNode l5 = new ListNode();
        ListNode l6 = new ListNode();
        l4.val = 1;
        l5.val = 3;
        l6.val = 4;
        l4.next = l5;
        l5.next = l6;
        l6.next = null;

        ListNode l7 = new ListNode();
        ListNode l8 = new ListNode();
        l7.val = 2;
        l8.val = 6;
        l7.next = l8;
        l8.next = null;

        ListNode[] lists = new ListNode[3];
        lists[0] = l1;
        lists[1] = l4;
        lists[2] = l7;

        MergeKSortedLists s = new MergeKSortedLists();
        
        System.out.println(s.mergeKLists(lists).toString());

        ListNode a1 = new ListNode();
        ListNode a2 = new ListNode();
        a1 = null;
        a2.val = 1;        

        ListNode[] lists1 = new ListNode[2];
        lists1[0] = a1;
        lists1[1] = a2;

        System.out.println(s.mergeKLists(lists1));


    }
}