package dev.eugenem.dataStructures.matrix;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MatrixTest {

	@Test
	@DisplayName("rotate matrix")
	public void testRotate() {

		Matrix a = new Matrix();
		int[][] arrayA = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		a.set(arrayA);
		a.rotate();
		String expected = a.toString();

		Matrix b = new Matrix();
		int[][] arrayB = new int[][] { { 7, 4, 1 }, { 8, 5, 2 }, { 9, 6, 3 } };
		b.set(arrayB);
		String actual = b.toString();

		assertEquals(expected, actual, "Rotation matrix should work");
		System.out.println("Test - Matrix : rotate() - passed ok");
	}

	@Test
	@DisplayName("transpose matrix")
	public void testTranspose() {

		Matrix a = new Matrix();
		int[][] arrayA = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		a.set(arrayA);
		a.transpose();
		String expected = a.toString();

		Matrix b = new Matrix();
		int[][] arrayB = new int[][] { { 1, 4, 7 }, { 2, 5, 8 }, { 3, 6, 9 } };
		b.set(arrayB);
		String actual = b.toString();

		assertEquals(expected, actual, "Transpose matrix should work");
		System.out.println("Test - Matrix : transpose() - passed ok");
	}

	@Test
	@DisplayName("reflect matrix")
	public void testReflect() {

		Matrix a = new Matrix();
		int[][] arrayA = new int[][] { { 1, 4, 7 }, { 2, 5, 8 }, { 3, 6, 9 } };
		a.set(arrayA);
		a.reflect();
		String expected = a.toString();

		Matrix b = new Matrix();
		int[][] arrayB = new int[][] { { 7, 4, 1 }, { 8, 5, 2 }, { 9, 6, 3 } };
		b.set(arrayB);
		String actual = b.toString();

		assertEquals(expected, actual, "Reflect matrix should work");
		System.out.println("Test - Matrix : reflect() - passed ok");
	}
}
