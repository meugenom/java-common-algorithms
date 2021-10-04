package dev.eugenem.dataStructures.tree.binarySearchTree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BinarySearchTreeTest {
	
	@Test
	@DisplayName("insert value into  BST")
	public void testInsertation() {		

		BinarySearchTree tree = new BinarySearchTree();

		tree.insertation(7);
		tree.insertation(20);
		tree.insertation(5);
		tree.insertation(15);
		tree.insertation(10);
		tree.insertation(4);
		tree.insertation(33);
		tree.insertation(2);
		tree.insertation(25);
		tree.insertation(6);

		tree.print(tree.root);

		String actual = tree.out;
		String expected = "[7->(5)][5->(4)][4->(2)][5->(6)][7->(20)][20->(15)][15->(10)][20->(33)][33->(25)]";

		assertEquals(expected, actual, "insertation of new value into BST should work");
		System.out.println("Test - Binary Search Tree : insertation(data) - passed ok");
	}
}
