package sofTasksDayTwo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class LargestSumTest{


	@Test
	public void testForTheSumOfTwoArrays(){

		int[][] numbers = {{2,3,4}, {5,6,5}};
		int[] expected = LargestSum.getSumsOf(numbers);
		int[] actual = {9, 16};

		assertArrayEquals(expected, actual);

	}


	@Test
	public void testForTheSumOfThreeArrays(){

		int[][] numbers = {{2,3,4}, {5,6,5}, {4,2,6,7}};
		int[] expected = LargestSum.getSumsOf(numbers);
		int[] actual = {9, 16, 19};

		assertArrayEquals(expected, actual);

	}


	@Test
	public void testForLargestSumOfTwoArrays(){

		int[][] numbers = {{2,3,4}, {5,6,5}};
		int expected = LargestSum.getLargestSum(numbers);
		int actual = 16;

		assertEquals(expected, actual);

	}


	@Test
	public void testForLargestSumOfThreeArrays(){

		int[][] numbers = {{2,3,4}, {5,6,5}, {4,2,6,7}};
		int expected = LargestSum.getLargestSum(numbers);
		int actual = 19;

		assertEquals(expected, actual);

	}


	@Test
	public void testForLargestSumOfNegativeNumbers(){

		int[][] numbers = {{-2,-3,-4}, {-5,-6,-5}, {-4,-2,-6,-7}};
		int expected = LargestSum.getLargestSum(numbers);
		int actual = -9;

		assertEquals(expected, actual);

	}








}