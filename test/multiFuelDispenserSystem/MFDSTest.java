package multiFuelDispenserSystem;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MFDSTest{


	@Test
	public void testForLitresOfPetrolOnAmount(){

		int amount = 1300;
		int actual = 2;
		int expected = MultiFuelDispenserSystem.getPetrolPerAmount(amount);

		assertEquals(expected, actual);

	}


	@Test
	public void testForPetrolAmountFromLitres(){

		int litres = 5;
		int actual = 3250;
		int expected = MultiFuelDispenserSystem.getPetrolPerLitre(litres);

		assertEquals(expected, actual);

	}


	@Test
	public void testForLitresOfDieselOnAmount(){

		int amount = 7200;
		int actual = 10;
		int expected = MultiFuelDispenserSystem.getDieselPerAmount(amount);

		assertEquals(expected, actual);

	}


	@Test
	public void testForDieselAmountFromLitres(){

		int litres = 4;
		int actual = 2880;
		int expected = MultiFuelDispenserSystem.getDieselPerLitre(litres);

		assertEquals(expected, actual);

	}


	@Test
	public void testForLitresOfKeroseneOnAmount(){

		int amount = 2200;
		int actual = 4;
		int expected = MultiFuelDispenserSystem.getKerosenePerAmount(amount);

		assertEquals(expected, actual);

	}


	@Test
	public void testForKeroseneAmountFromLitres(){

		int litres = 6;
		int actual = 3300;
		int expected = MultiFuelDispenserSystem.getKerosenePerLitre(litres);

		assertEquals(expected, actual);

	}


	@Test
	public void testForLitresOfGasOnAmount(){

		int amount = 9600;
		int actual = 20;
		int expected = MultiFuelDispenserSystem.getGasPerAmount(amount);

		assertEquals(expected, actual);

	}


	@Test
	public void testForGasAmountFromLitres(){

		int litres = 13;
		int actual = 6240;
		int expected = MultiFuelDispenserSystem.getGasPerLitre(litres);

		assertEquals(expected, actual);

	}


	@Test
	public void testForGasOnInvalidAmount(){

		int actual = 0;
		int expected = MultiFuelDispenserSystem.getGasPerAmount(200);
		
		assertEquals(expected, actual);

	}


}