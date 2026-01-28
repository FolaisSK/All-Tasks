package sofTasksDayTwo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class BinaryToDecimalTest{


	@Test
	public void testThatBinaryValueReturnsTen(){

		int expected = BinaryToDecimal.getDecimalOf(101);
		int actual = 5;

		assertEquals(expected, actual);

	}


	@Test
	public void testThatBinaryValueReturnsSeven(){

		int expected = BinaryToDecimal.getDecimalOf(111);
		int actual = 7;

		assertEquals(expected, actual);


	}


	@Test
	public void testThatNegativBinaryValueReturns(){

		int expected = BinaryToDecimal.getDecimalOf(-111);
		int actual = 0;

		assertEquals(expected, actual);

	}


	@Test
	public void testForZero(){

		int expected = BinaryToDecimal.getDecimalOf(0);
		int actual = 0;

		assertEquals(expected, actual);

	}


	@Test
	public void testForInvalidBinaryNumber(){

		int expected = BinaryToDecimal.getDecimalOf(255);
		int actual = 0;

		assertEquals(expected, actual);

	}


	@Test
	public void testForTwoFiftyFive(){

		int expected = BinaryToDecimal.getDecimalOf(11111111);
		int actual = 255;

		assertEquals(expected, actual);

	}



}