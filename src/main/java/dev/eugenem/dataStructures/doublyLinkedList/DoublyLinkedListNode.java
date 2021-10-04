package dev.eugenem.dataStructures.doublyLinkedList;

public class DoublyLinkedListNode {

	public int data;
	public DoublyLinkedListNode next;
	public DoublyLinkedListNode previous;

	public DoublyLinkedListNode() {
	}

	public DoublyLinkedListNode(int data) {
		this.data = data;
	}

	public DoublyLinkedListNode(int data, DoublyLinkedListNode next, DoublyLinkedListNode previous) {
		this.data = data;
		this.next = next;
		this.previous = previous;
	}

	@Override
	public String toString() {
		return "("+previous+"<-[" + data + "]->"+next+")";
	}
}
