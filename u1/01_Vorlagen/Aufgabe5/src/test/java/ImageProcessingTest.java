
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class ImageProcessingTest {

	private static final int[][] ORIGINAL = new int[][] {
		{1, 2, 3, 4},
		{5, 6, 7, 8},
		{9, 0, 1, 2}
	};
	
	@Test
	void testInvert() {
		int[][] expected = new int[][] {
			{-1, -2, -3, -4},
			{-5, -6, -7, -8},
			{-9, -0, -1, -2}
		};

		var actual = ImageProcessing.invert(ORIGINAL);

		assertArrayEquals(expected, actual, "NOT IMPLEMENTED");
	}

	@Test
	void testRotate() {
		int[][] expected = new int[][] {
			{9, 5, 1},
			{0, 6, 2},
			{1, 7, 3},
			{2, 8, 4}
		};

		var actual = ImageProcessing.rotate(ORIGINAL);

		assertArrayEquals(expected, actual, "NOT IMPLEMENTED");
	}

	@Test
	void testMirror() {
		int[][] expected = new int[][] {
			{4, 3, 2, 1},
			{8, 7, 6, 5},
			{2, 1, 0, 9}
		};

		var actual = ImageProcessing.mirror(ORIGINAL);

		assertArrayEquals(expected, actual, "NOT IMPLEMENTED");
	}

	@Test
	void testGray() {
		int[][] input = new int[][] {
			{0xffffff, 0x0f0f0f, 0x101010, 0x000000},
			{0x0000ff, 0x00ff00, 0xff0000, 0xf00807},
			{0x58ffaa, 0x3a2155, 0x091110, 0x113370}			
		};
		int[][] expected = new int[][] {
			{0xffffff, 0x0f0f0f, 0x101010, 0x000000},
			{0x555555, 0x555555, 0x555555, 0x555555},
			{0xababab, 0x3a3a3a, 0x0e0e0e, 0x3c3c3c}
		};

		var actual = ImageProcessing.gray(ORIGINAL);

		assertArrayEquals(expected, actual, "NOT IMPLEMENTED");
	}
}
