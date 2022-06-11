package com.meugenom.dataStructures.tree.binarySearchTreeIterative;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.meugenom.dataStructures.tree.binarySearchTree.BinarySearchTreeIterative;


public class BinarySearchTreeIterativeTest {

	@Test
	@DisplayName("print BST preOrder - NLR Iterative")
	public void testPreOrderPrintIterative() throws Exception {

		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));

		BinarySearchTreeIterative tree = new BinarySearchTreeIterative();
		tree.insert(5);
		tree.insert(2);
		tree.insert(8);
		tree.insert(1);
		tree.insert(4);
		tree.insert(9);
		tree.insert(7);

		tree.preOrderPrintIterative();

		String expectedOutput = "5 2 1 4 8 7 9 ";

		assertEquals(expectedOutput, outContent.toString(), "preOrderPrintIterative should work");
		System.out.println("Test - Binary Search Tree Iterative: preOrderPrintIterative() - passed ok");
	}

	@Test
	@DisplayName("print BST inOrder - LNR Iterative")
	public void testInOrderPrintIterative() throws Exception {

		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));

		BinarySearchTreeIterative tree = new BinarySearchTreeIterative();
		tree.insert(5);
		tree.insert(2);
		tree.insert(8);
		tree.insert(1);
		tree.insert(4);
		tree.insert(9);
		tree.insert(7);

		tree.inOrderPrintIterative();

		String expectedOutput = "1 2 4 5 7 8 9 ";

		assertEquals(expectedOutput, outContent.toString(), "inOrderPrintIterative() should work");
		System.out.println("Test - Binary Search Tree Iterative: inOrderPrintIterative() - passed ok");
	}

	@Test
	@DisplayName("print BST postOrder - LRN Iterative")
	public void testPostOrderPrintIterative() throws Exception {

		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));

		BinarySearchTreeIterative tree = new BinarySearchTreeIterative();
		tree.insert(5);
		tree.insert(2);
		tree.insert(8);
		tree.insert(1);
		tree.insert(4);
		tree.insert(9);
		tree.insert(7);

		tree.postOrderPrintIterative();

		String expectedOutput = "1 4 2 7 9 8 5 ";

		assertEquals(expectedOutput, outContent.toString(), "postOrderPrintIterative() should work");
		System.out.println("Test - Binary Search Tree Iterative: postOrderPrintIterative() - passed ok");
	}

}
