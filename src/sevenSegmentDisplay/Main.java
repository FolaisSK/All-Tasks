package sevenSegmentDisplay;

public class Main {

    static void main() {
        SevenSegmentDisplay segment = new SevenSegmentDisplay();
        LEDScreen led = new LEDScreen();

        segment.setNumber("11011011");
        segment.turnLCDOn(led,segment.getTurnedOnSegments());
    }
}
