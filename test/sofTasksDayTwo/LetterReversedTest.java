package sofTasksDayTwo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class LetterReversedTest{


	@Test
	public void testForAInDayo(){

		String expected = LetterReversed.getReversed("dayo", 'a');
		String actual = "daoy";

		assertEquals(expected, actual);

	}


	@Test
	public void testForVowelsWithI(){

		String expected = LetterReversed.getReversed("Vowels", 'a');
		String actual = "Vowels";

		assertEquals(expected, actual);

	}


	@Test
	public void testForFolajimiWithL(){

		String expected = LetterReversed.getReversed("folajeimi", 'j');
		String actual = "folajimie";

		assertEquals(expected, actual);

	}


	@Test
	public void testWithSpaces(){

		String expected = LetterReversed.getReversed("bri dget", 'r');
		String actual = "brtegd i";

		assertEquals(expected, actual);

	}


	@Test
	public void testWithSpecialCharacters(){

		String expected = LetterReversed.getReversed("ray-mon$d#", 'm');
		String actual = "ray-m#d$no";

		assertEquals(expected, actual);

	}




}