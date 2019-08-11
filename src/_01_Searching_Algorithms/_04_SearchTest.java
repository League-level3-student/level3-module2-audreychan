package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		String[] words = {"a", "b", "c", "d", "e"};
		assertEquals(2, _00_LinearSearch.linearSearch(words, "c"));
		assertEquals(0, _00_LinearSearch.linearSearch(words, "a"));
		assertEquals(-1, _00_LinearSearch.linearSearch(words, "f"));
	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		assertEquals(10, _01_BinarySearch.binarySearch(array, 4, 17, 11));
		assertEquals(14, _01_BinarySearch.binarySearch(array, 13, 19, 15));
		assertEquals(-1, _01_BinarySearch.binarySearch(array, 11, 14, 5));
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		assertEquals(9, _02_InterpolationSearch.interpolationSearch(array, 10));
		assertEquals(4, _02_InterpolationSearch.interpolationSearch(array, 5));
		assertEquals(-1, _02_InterpolationSearch.interpolationSearch(array, 21));
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		assertEquals(9, _03_ExponentialSearch.exponentialSearch(array, 10));
		assertEquals(6, _03_ExponentialSearch.exponentialSearch(array, 7));
		assertEquals(-1, _03_ExponentialSearch.exponentialSearch(array, 21));
	}
}
