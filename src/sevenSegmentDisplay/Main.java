package sevenSegmentDisplay;

public class Main {

    static void main() {
        SevenSegmentDisplay segment = new SevenSegmentDisplay();
        LEDScreen led = new LEDScreen();

        segment.setNumber("10001111");
        segment.turnLCDOn(led,segment.getTurnedOnSegments());
    }
}
