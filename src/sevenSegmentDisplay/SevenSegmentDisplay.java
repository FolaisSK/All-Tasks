package sevenSegmentDisplay;


public class SevenSegmentDisplay {
    private String number;
    private String segments ;
    private char[] binaryDigits;

    public SevenSegmentDisplay(){
        this.segments = "";
    }

    public void setNumber(String number) {
        this.number = number;
        splitDigits();
    }

    public boolean isDigit() {
        if(number.matches("\\d")) return true;
        return false;
    }

    public boolean isBinaryDigit() {
        validateBinaryDigits();
        if(number.length() == 8)return true;
        return false;
    }

    public String getTurnedOnSegments() {
        Segment[] allSegments = getAllSegments();
        for(char i = 0; i < binaryDigits.length; i++){
            if(isOn(binaryDigits[i])) this.segments += allSegments[i];
        }
        return segments;
    }

    public boolean isSwitchedOn() {
        if(number.endsWith("1")) return true;
        return false;
    }

    public void turnLCDOn(LEDScreen screen, String segments){
        if(isSwitchedOn()){
            screen.setOnSegments(segments);
            screen.display();
        }else screen.blankScreen();
    }

    private void splitDigits(){
        this.binaryDigits = number.toCharArray();
    }

    private void validateBinaryDigits(){
        for(char digit : binaryDigits){
            if(digit != '1' && digit != '0') throw new IllegalArgumentException("Not a Binary Digit");
        }
    }

    private boolean isOn(char digit){
        if(digit == '1') return true;
        return false;
    }

    private Segment[] getAllSegments(){
        return Segment.values();
    }
}
