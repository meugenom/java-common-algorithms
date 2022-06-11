package com.meugenom.leetcode.SortList;
 
/** 26 / 28 test cases passed
 *  Status: Time Limit Exceeded
 */

public class SortList {

    public ListNode sortList(ListNode head) {

        if(head == null)
           return head;

        ListNode a = head;
        ListNode cash = new ListNode();
        cash = null;

        ListNode res = new ListNode();
        res = null;
        ListNode tmp;
        
        int max = a.val;
        int index = 0;
        int count = 0; //for doubles in the list

        while(a != null){

            if(max < a.val){

                tmp = new ListNode();
                tmp.val = max;
                tmp.next = cash;
                cash = tmp;

                max = a.val;
                count = 0;
            }

            if(max > a.val){

                tmp = new ListNode();
                tmp.val = a.val;
                tmp.next = cash;
                cash = tmp;

                count = 0;
            }

            if(count > 0 && a.val == max ) {
                // if in res list value < then we have => save it in the cach list
                if(res != null){
                    if(res.val <= max) {
                        tmp = new ListNode();
                        tmp.val = max;
                        tmp.next = res;
                        res = tmp;
                    } else {
                        tmp = new ListNode();
                        tmp.val = a.val;
                        tmp.next = cash;
                        cash = tmp;
                    }
                } else {
                    tmp = new ListNode();
                    tmp.val = max;
                    tmp.next = res;
                    res = tmp;
                }
                count = 0;
            }

            a = a.next;
            index++;
            count ++;

            if(a == null && cash!=null){

                //add max value to res
                tmp = new ListNode();
                tmp.val = max;
                tmp.next = res;
                res = tmp;

                //a equals c with other numbers
                max = cash.val;
                cash = cash.next;
                a = cash;
                cash = null;
                index = 0;
                count = 0;
            }
        }

        tmp = new ListNode();
        tmp.val = max;
        tmp.next = res;
        res = tmp;
        tmp = null;              

        return res;
    }


    public static void main(String[] args){

        ListNode a1 = new ListNode();
        ListNode a2 = new ListNode();
        ListNode a3 = new ListNode();
        ListNode a4 = new ListNode(); 
        ListNode a5 = new ListNode(); 
        ListNode a6 = new ListNode();         
        ListNode a7 = new ListNode();    
        ListNode a8 = new ListNode();    
        ListNode a9 = new ListNode();    
        ListNode a10 = new ListNode();    
        ListNode a11 = new ListNode();         
        



        a1.val = -1;
        a2.val = 9;
        a3.val = 2;
        a4.val = 2;
        a5.val = 0;
        a6.val = 4;
        a7.val = 5;
        a8.val = 4;
        a9.val = 3;
        a10.val = 2;
        a11.val = 0;

        a1.next  = a2;
        a2.next  = a3;
        a3.next  = a4;
        a4.next  = a5;
        a5.next = a6;
        a6.next = a7;
        a7.next = a8;
        a8.next = a9;
        a9.next = a10;
        a10.next = a11;
        a11.next = null;
        

        SortList s1 = new SortList();                
        System.out.println(s1.sortList(a1).toString());
    }

}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    @Override
    public String toString() {
        return next + "<-(" + val + ")";
    }
 
}

