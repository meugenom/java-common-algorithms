package dataStructures.stack;

import dataStructures.singlyLinkedList.SinglyLinkedListNode;

public class Stack {
    
	public SinglyLinkedListNode stack = new SinglyLinkedListNode();

    /**
     * Initialize structure
     */
    public Stack() {

        stack =  null;
    }

    /**
     *  push new value to the stack
	 * 
     * @param val
	 * @complexity time O(1)
	 * @complexity space O(1)
     */
    public void push(int data) {

        SinglyLinkedListNode a = new SinglyLinkedListNode();
        a.data = data;
        a.next = stack;
        stack = a;
    }
    
    /**
     * pop - remove last value on the stacks peak
	 * 
	 * @complexity time O(1)
	 * @complexity space O(1)
     */
    public void pop() {

        this.stack = this.stack.next;
    }
    
    /**
	 * peek - return last value on the stacks peak
	 * 
     * @return peek
	 * @complexity time O(1)
	 * @complexity space O(1)
     */
    public int peek() {

        int peek = this.stack.data;
        return peek;  
    }

    /**
	 * getMin - return min value in the stack
	 * 
     * @return min value in the stack
	 * @complexity time O(n)
	 * @complexity space O(1)
     */
    public int getMin() {

        SinglyLinkedListNode a = new SinglyLinkedListNode();
        a = this.stack;
        int min = a.data;

        while(a != null) {
            min = (min > a.data)? a.data : min;                        
            a = a.next;
        }
        return min;  
    }
}
