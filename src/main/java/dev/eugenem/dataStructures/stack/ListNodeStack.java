package dev.eugenem.dataStructures.stack;

public class ListNodeStack {
    
    ListNode stack = new ListNode();

    /**
     * Initialize structure
     */
    public ListNodeStack() {

        stack =  null;
    }

    /**
     *  push new value to the stack
     * @param val
     */
    public void push(int val) {

        ListNode a = new ListNode();
        a.val = val;
        a.next = stack;
        stack = a;
    }
    
    /**
     * pop - remove last value on the stacks peak
     */
    public void pop() {

        this.stack = this.stack.next;
    }
    
    /**
     * 
     * @return peak
     */
    public int peak() {

        int peak = this.stack.val;
        return peak;  
    }

    /**
     * @return min value in the stack
     */
    public int getMin() {

        ListNode a = new ListNode();
        a = this.stack;
        int min = a.val;

        while(a != null) {
            min = (min > a.val)? a.val : min;                        
            a = a.next;
        }
        return min;  
    }

    public static void main(String[] args) {

        ListNodeStack s = new ListNodeStack();
        s.push(-2);
        s.push(0);
        s.push(-3);
        System.out.println(s.stack.toString());
        System.out.println("min = "+ s.getMin());
        s.pop();
        System.out.println(s.stack.toString());
        System.out.println("peak = " + s.peak());

    }
}
