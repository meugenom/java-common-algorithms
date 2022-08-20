package leetcode.SortList;


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


public class SortList {

	public static ListNode sortList(ListNode head) {
        //private case
		if (head == null || head.next == null) return head;
        
		ListNode mid = getMid(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);
        
		return merge(left, right);
    }

    public static ListNode merge(ListNode list1, ListNode list2) {

        ListNode toHead = new ListNode();
        ListNode tail = toHead;
        
		while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                
				tail.next = list1;
                list1 = list1.next;
                tail = tail.next;

            } else {
                
				tail.next = list2;
                list2 = list2.next;
                tail = tail.next;

            }
        }

        tail.next = (list1 != null) ? list1 : list2;

        return toHead.next;
    }

    
	public static ListNode getMid(ListNode head) {

        ListNode midPrevious = null;
        
		while (head != null && head.next != null) {
        
			midPrevious = (midPrevious == null) ? head : midPrevious.next;
            
			head = head.next.next;
        }
        
		ListNode mid = midPrevious.next;
        midPrevious.next = null;
        
		return mid;
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
        System.out.println("actual : " + (a1).toString());
        System.out.println("expected : " + sortList(a1).toString());
    }

}


