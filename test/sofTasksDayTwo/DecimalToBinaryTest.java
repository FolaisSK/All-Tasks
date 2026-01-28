package sofTasksDayTwo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class DecimalToBinaryTest{


	@Test
	public void testThatDecimalValueOfFiveReturnBinary(){

		int expected = DecimalToBinary.getBinaryOf(5);
		int actual = 101;

		assertEquals(expected, actual);

	}


	@Test
	public void testThatDecimalValueOfTenReturnsBinary(){

		int expected = DecimalToBinary.getBinaryOf(10);
		int actual = 1010;

		assertEquals(expected, actual);

	}


	@Test 
	public void testThatDecimalValueOfNineHundredReturnsBinary(){

		int expected = DecimalToBinary.getBinaryOf(900);
		int actual = 1110000100;

		assertEquals(expected, actual);

	}


	@Test
	public void testThatNegativeValueReturnsBinary(){

		int expected = DecimalToBinary.getBinaryOf(-10);
		int actual = 1010;

		assertEquals(expected, actual);

	}


	@Test
	public void testZeroValueReturnsZero(){

		int expected = DecimalToBinary.getBinaryOf(0);
		int actual = 0;

		assertEquals(expected, actual);

	} 




}