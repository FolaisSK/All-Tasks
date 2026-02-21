package sevenSegmentDisplay;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SegmentTest {
    SevenSegmentDisplay segment;
    LEDScreen led;

    @BeforeEach
    public void initialState(){
        segment = new SevenSegmentDisplay();
        led = new LEDScreen();
    }


    @Test
    public void testThatWhenBitIsNotADigitReturnsFalse(){
        segment.setNumber("ab12c");
        assertFalse(segment.isDigit());
    }


    @Test
    public void testThatInvalidBinaryNumberThrowsException(){
        segment.setNumber("12345678");
        assertThrows(IllegalArgumentException.class,() ->segment.isBinaryDigit());
    }

    @Test
    public void testForValidBinaryNumber(){
        segment.setNumber("11111111");
        assertTrue(segment.isBinaryDigit());
        segment.setNumber("1111");
        assertFalse(segment.isBinaryDigit());
    }

    @Test
    public void testThatEachSegmentNumberedOneTurnedOn(){
        segment.setNumber("11100010");
        assertTrue(segment.isBinaryDigit());
        assertEquals("ABCG", segment.getTurnedOnSegments());

    }

    @Test
    public void testForBCGSegmentsTurnedOn(){
        segment.setNumber("01010100");
        assertTrue(segment.isBinaryDigit());
        assertEquals("BDF", segment.getTurnedOnSegments());
    }

    @Test
    public void testThatAllSegmentsCanBeTurnedOn(){
        segment.setNumber("11111111");
        assertTrue(segment.isBinaryDigit());
        assertEquals("ABCDEFGPOWER", segment.getTurnedOnSegments());
    }

    @Test
    public void testThatAllSegmentsCanBeTurnedOff(){
        segment.setNumber("00000000");
        assertTrue(segment.isBinaryDigit());
        assertEquals("", segment.getTurnedOnSegments());
    }

    @Test
    public void testThatWhenSegmentAIsOnArrayIsFilled(){
        segment.setNumber("10000000");
        assertTrue(segment.isBinaryDigit());
        assertEquals("A", segment.getTurnedOnSegments());
        //led.setOnSegments("A");
        //led.setOnSegments("B");
        //led.setOnSegments("G");
        //led.setOnSegments("C");
        //led.setOnSegments("D");
        //led.setOnSegments("E");
        led.setOnSegments("ABCDG");
        led.displayScreen();
        led.display();
    }

    @Test
    public void testThatScreenIsOnFromLastDigit(){
        segment.setNumber("11001101");
        assertTrue(segment.isBinaryDigit());
        assertTrue(segment.isSwitchedOn());
    }

    @Test
    public void testThatScreenIsOffFromLastDigit(){
        segment.setNumber("11001100");
        assertTrue(segment.isBinaryDigit());
        assertFalse(segment.isSwitchedOn());
    }

    @Test
    public void functionalityTestWhenPoweredOn(){
        segment.setNumber("10001111");
        segment.turnLCDOn(led,segment.getTurnedOnSegments());
    }

    @Test
    public void functionalityTestWhenOff(){
        segment.setNumber("10111000");
        segment.turnLCDOn(led,segment.getTurnedOnSegments());
    }

}
