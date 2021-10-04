package dev.eugenem.dataStructures.tree.binarySearchTree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BinarySearchTreeTest {
	
	@Test
	@DisplayName("insert value into  BST")
	public void testInsertation() {		

		BinarySearchTree tree = new BinarySearchTree();

		tree.insert(7);
		tree.insert(20);
		tree.insert(5);
		tree.insert(15);
		tree.insert(10);
		tree.insert(4);
		tree.insert(33);
		tree.insert(2);
		tree.insert(25);
		tree.insert(6);

		tree.print(tree.root);

		String actual = tree.out;
		String expected = "[7->(5)][5->(4)][4->(2)][5->(6)][7->(20)][20->(15)][15->(10)][20->(33)][33->(25)]";

		assertEquals(expected, actual, "insertation of new value into BST should work");

		tree.root = null;
		tree.out = "";

		tree.insert(1);
		tree.insert(2);
		tree.insert(3);
		tree.insert(4);
		tree.insert(5);
		tree.insert(6);

		tree.print(tree.root);

		actual = tree.out;
		expected = "[1->(2)][2->(3)][3->(4)][4->(5)][5->(6)]";
		
		assertEquals(expected, actual, "insertation of new value into BST should work");

		System.out.println("Test - Binary Search Tree : insertation(data) - passed ok");
	}
}
