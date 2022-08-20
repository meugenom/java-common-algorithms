package leetcode.MinStack;

public class MinStack {

    ListNode minStack = new ListNode();

    /** initialize your data structure here. */
    public MinStack() {

        minStack =  null;
    }
    
    public void push(int val) {

        ListNode a = new ListNode();
        a.val = val;
        a.next = minStack;
        minStack = a;
    }
    
    public void pop() {

        this.minStack = this.minStack.next;
    }
    
    
    public int top() {

        int top = this.minStack.val;
        return top;  
    }

    public int getMin() {

        ListNode a = new ListNode();
        a = this.minStack;
        int min = a.val;

        while(a != null){
            min = (min > a.val)? a.val : min;                        
            a = a.next;
        }
        return min;  
    }

    public static void main(String[] args) {

        MinStack mstack = new MinStack();
        mstack.push(-2);
        mstack.push(0);
        mstack.push(-3);
        System.out.println(mstack.minStack.toString());     
        System.out.println("min = "+mstack.getMin());           
        //mstack.pop();
        System.out.println(mstack.minStack.toString());
        System.out.println("top = " + mstack.top());
        System.out.println(mstack.getMin());

    }

}

class ListNode {

    int val;
    ListNode next;

    ListNode() {
    }

    ListNode (int val) { 
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