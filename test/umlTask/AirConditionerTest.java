package umlTask;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionerTest{


	public static AirConditioner ac;

	@BeforeEach
	public void initialState(){
		ac = new AirConditioner("LG");
	}

	@Test
	public void testToGetProductName(){
		assertEquals("LG", ac.getProductName());
	}

	@Test
	public void nameIsLG_SetNewProductName(){
		assertEquals("LG", ac.getProductName());

		ac.setProductName("SAMSUNG");
		assertEquals("SAMSUNG", ac.getProductName());
	}


	@Test
	public void testToTurnOnACWhenOff(){
        assertFalse(ac.isOn());
		ac.setOn(true);
        assertTrue(ac.isOn());
	}


	@Test
	public void testToSetTemperature(){
		assertFalse(ac.isOn());
		ac.setOn(true);
		assertTrue(ac.isOn());

		assertEquals(16, ac.getTemperature());
		ac.setTemperature(20);
		assertEquals(20, ac.getTemperature());
	}


	@Test
	public void testToIncreaseTemperature(){
		assertFalse(ac.isOn());
		ac.setOn(true);
		assertTrue(ac.isOn());

		assertEquals(16, ac.getTemperature());

		for(int count = 0; count < 4; count++){
			ac.increaseTemperature();
		}

		assertEquals(20, ac.getTemperature());
	}


	@Test
	public void testToDecreaseTemperatureAfterIncreasingTemperature(){
		assertFalse(ac.isOn());
		ac.setOn(true);
		assertTrue(ac.isOn());

		assertEquals(16, ac.getTemperature());

		for(int count = 0; count < 4; count++){
			ac.increaseTemperature();
		}

		assertEquals(20, ac.getTemperature());
		ac.decreaseTemperature();

		assertEquals(19, ac.getTemperature());
	}

	@Test
	public void testWhenTurnedOn_ReduceTemperature_TemperatueIs16(){
		assertFalse(ac.isOn());
		ac.setOn(true);
		assertTrue(ac.isOn());

		assertEquals(16, ac.getTemperature());

		ac.decreaseTemperature();
		assertEquals(16, ac.getTemperature());
	}

	@Test
	public void testWhenTurnedOn_SetMinus16_TemperatureIs16(){
		assertFalse(ac.isOn());
		ac.setOn(true);
		assertTrue(ac.isOn());

		ac.setTemperature(-16);
		assertEquals(16, ac.getTemperature());
	}

	@Test
	public void testWhenACIsOff_IncreaseTemperature_TemperatureIs16(){
		assertFalse(ac.isOn());
		assertEquals(16, ac.getTemperature());

		ac.increaseTemperature();
		assertEquals(16, ac.getTemperature());
	}

	@Test
	public void testWhenACIsOff_DecreaseTemperature_TemperatureIs16(){
		assertFalse(ac.isOn());
		assertEquals(16, ac.getTemperature());

		ac.decreaseTemperature();
		assertEquals(16, ac.getTemperature());
	}

	@Test
	public void testWhenACIsOn_IncreaseTemperatureBy20_TemperatureIs32(){
		assertFalse(ac.isOn());
		ac.setOn(true);
		assertTrue(ac.isOn());

		for(int count = 0; count < 20; count++){
			ac.increaseTemperature();
		}
		assertEquals(32, ac.getTemperature());
	}

	@Test
	public void testWhenACIsOn_SetTemperatureTo36_TemperatureDoesNotChange(){
		assertFalse(ac.isOn());
		ac.setOn(true);
		assertTrue(ac.isOn());

		assertEquals(16, ac.getTemperature());
		ac.setTemperature(36);
		assertEquals(16, ac.getTemperature());
	}


}