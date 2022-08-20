package dataStructures.stack;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class StackTest {

	@Test
	@DisplayName("find minimal value in the stack")
	public void testGetMin() {

		Stack s = new Stack();
		s.push(-2);
		s.push(0);
		s.push(-3);
		int actual = s.getMin();
		int expected = -3;

		assertEquals(expected, actual, "getMin() should work");

		System.out.println("Test - Stack : getMin() - passed ok");
	}

	@Test
	@DisplayName("find last added value in the stack")
	public void testPeak() {

		Stack s = new Stack();
		s.push(-1);
		s.push(0);
		s.push(2);
		s.push(5);
		s.push(4);
		int actual = s.peak();
		int expected = 4;

		assertEquals(expected, actual, "peak() should work");

		System.out.println("Test - Stack : peak() - passed ok");
	}

	@Test
	public void testPop() {

		Stack s = new Stack();
		s.push(-1);
		s.push(0);
		s.push(2);
		s.push(5);
		s.push(4);
		s.pop();
		s.push(5);
		String actual = s.stack.toString();
		String expected = "null<-(-1)<-(0)<-(2)<-(5)<-(5)";

		assertEquals(expected, actual, "pop() should work");

		System.out.println("Test - Stack : pop(data) - passed ok");
	}

	@Test
	@DisplayName("test addition to the stack")
	public void testPush() {

		Stack s = new Stack();
		s.push(-1);
		s.push(0);
		s.push(2);
		s.push(5);
		s.push(4);
		String actual = s.stack.toString();
		String expected = "null<-(-1)<-(0)<-(2)<-(5)<-(4)";

		assertEquals(expected, actual, "addition with push() should work");

		System.out.println("Test - Stack : push(data) - passed ok");

	}
}
