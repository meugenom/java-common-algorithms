package dataStructures.tree.binarySearchTreeRecursive;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import dataStructures.tree.binarySearchTree.BinarySearchTreeRecursive;

public class BinarySearchTreeRecursiveTest {

	@Test
	@DisplayName("insert value into  Binary Search Tree Recursive")
	public void testInsert() {

		BinarySearchTreeRecursive tree = new BinarySearchTreeRecursive();

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

		assertEquals(expected, actual, "insert() recursive into BSTRecursive should work");

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

		assertEquals(expected, actual, "insert() recursive into BSTRecursive should work");

		System.out.println("Test - Binary Search Tree Recursive : insert(data) - passed ok");
	}

	@Test
	@DisplayName("print BST preOrder - NLR Recursive")
	public void testPreOrderPrintRecursive() throws Exception {

		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));

		BinarySearchTreeRecursive tree = new BinarySearchTreeRecursive();
		tree.insert(5);
		tree.insert(2);
		tree.insert(8);
		tree.insert(1);
		tree.insert(4);
		tree.insert(9);
		tree.insert(7);

		tree.preOrderPrintRecursive(tree.root);

		String expectedOutput = " 5 2 1 4 8 7 9";

		assertEquals(expectedOutput, outContent.toString(), "preOrderPrintRecursive should work");
		System.out.println("Test - Binary Search Tree Recursive: preOrderPrintRecursive() - passed ok");
	}

	@Test
	@DisplayName("print BST inOrder - LNR Recursive")
	public void testInOrderPrintRecursive() throws Exception {

		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));

		BinarySearchTreeRecursive tree = new BinarySearchTreeRecursive();
		tree.insert(5);
		tree.insert(2);
		tree.insert(8);
		tree.insert(1);
		tree.insert(4);
		tree.insert(9);
		tree.insert(7);

		tree.inOrderPrintRecursive(tree.root);

		String expectedOutput = " 1 2 4 5 7 8 9";

		assertEquals(expectedOutput, outContent.toString(), "inOrderPrintRecursive() should work");
		System.out.println("Test - Binary Search Tree Recursive: inOrderPrintRecursive() - passed ok");
	}

	@Test
	@DisplayName("print BST postOrder - LRN Recursive")
	public void testPostOrderPrintRecursive() throws Exception {

		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));

		BinarySearchTreeRecursive tree = new BinarySearchTreeRecursive();
		tree.insert(5);
		tree.insert(2);
		tree.insert(8);
		tree.insert(1);
		tree.insert(4);
		tree.insert(9);
		tree.insert(7);

		tree.postOrderPrintRecursive(tree.root);

		String expectedOutput = " 1 4 2 7 9 8 5";

		assertEquals(expectedOutput, outContent.toString(), "postOrderPrintRecursive() should work");
		System.out.println("Test - Binary Search Tree Recursive: postOrderPrintRecursive() - passed ok");
	}

	@Test
	@DisplayName("delete Node from BST")
	public void testDeleteNode() throws Exception {

		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));

		BinarySearchTreeRecursive tree = new BinarySearchTreeRecursive();
		tree.insert(5);
		tree.insert(2);
		tree.insert(8);
		tree.insert(1);
		tree.insert(4);
		tree.insert(9);
		tree.insert(7);

		tree.delete(tree.root, 5);

		tree.inOrderPrintRecursive(tree.root);

		String expectedOutput = " 1 2 4 7 8 9"; //was " 1, 2, 4, 5, 7, 8, 9"

		assertEquals(expectedOutput, outContent.toString(), "deleteNode() should work");
		System.out.println("Test - Binary Search Tree Recursive: deleteNode() - passed ok");
	}

}
