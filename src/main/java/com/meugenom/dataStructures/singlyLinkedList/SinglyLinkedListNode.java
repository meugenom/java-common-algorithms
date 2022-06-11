package com.meugenom.dataStructures.singlyLinkedList;

public class SinglyLinkedListNode {

    public int data;
    public SinglyLinkedListNode next;

    public SinglyLinkedListNode() {
    }

    public SinglyLinkedListNode (int data) { 
        this.data = data;
    }

    public SinglyLinkedListNode(int val, SinglyLinkedListNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return  next + "<-(" + data + ")";
    }
}
