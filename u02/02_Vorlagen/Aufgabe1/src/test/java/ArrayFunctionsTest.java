import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArrayFunctionsTest {

	@Test
	void testRevertExample() {
		int[] initial = {1, 2, 3};
		int[] expected = {3, 2, 1};

		int[] actual = ArrayFunctions.revert(initial);

		assertArrayEquals(expected, actual);
	}

	@Test
	void testRevertDoesNotChangeArgument() {
		int[] initial = {1, 2, 3};

		ArrayFunctions.revert(initial);

		assertArrayEquals(new int[] {1, 2, 3}, initial);
	}

	@Test
	void testRevertEmpty() {
		int[] empty = {};

		int[] actual = ArrayFunctions.revert(empty);

		assertArrayEquals(empty, actual);
	}

	@Test
	void testAscendinglySortedArray_IsTrue_ForSortedArray() {
		int[] input = {-1, 0, 7};

		boolean result = ArrayFunctions.isAscendinglySorted(input);

		assertTrue(result);
	}

	@Test
	void testAscendinglySortedArray_IsFalse_ForUnsortedArray() {
		int[] input = {-1, 7, 2};

		boolean result = ArrayFunctions.isAscendinglySorted(input);

		assertFalse(result);
	}

	@Test
	void testAscendinglySortedArray_IsTrue_ForEmptyArray() {
		int[] empty = {};

		boolean result = ArrayFunctions.isAscendinglySorted(empty);

		assertTrue(result);
	}

	@Test
	void testDescendinglySortedArray_IsTrue_ForSortedArray() {
		int[] input = {7, 0, -1};

		boolean result = ArrayFunctions.isDescendinglySorted(input);

		assertTrue(result);
	}

	@Test
	void testDescendinglySortedArray_IsFalse_ForUnsortedArray() {
		int[] input = {-1, 7, 2};

		boolean result = ArrayFunctions.isDescendinglySorted(input);

		assertFalse(result);
	}

	@Test
	void testDescendinglySortedArray_IsTrue_ForEmptyArray() {
		int[] empty = {};

		boolean result = ArrayFunctions.isDescendinglySorted(empty);

		assertTrue(result);
	}
}
