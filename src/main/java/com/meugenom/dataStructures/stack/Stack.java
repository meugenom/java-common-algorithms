package com.meugenom.dataStructures.stack;

import com.meugenom.dataStructures.singlyLinkedList.SinglyLinkedListNode;

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
     * @param val
     */
    public void push(int data) {

        SinglyLinkedListNode a = new SinglyLinkedListNode();
        a.data = data;
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

        int peak = this.stack.data;
        return peak;  
    }

    /**
     * @return min value in the stack
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
