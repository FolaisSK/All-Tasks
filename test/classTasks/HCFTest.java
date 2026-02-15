package classTasks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HCFTest {
    HighestCommonFactor hcf;

    @BeforeEach
    public void initialState(){hcf = new HighestCommonFactor();}

    @Test
    public void testForHCFInThreeNumbers(){
        int[] numbers = {6,8,12};
        assertEquals(2, hcf.getHighestCommonFactor(numbers));
    }

    @Test
    public void testWhenHCFIsOne(){
        int[] numbers = {5,7,9};
        assertEquals(1, hcf.getHighestCommonFactor(numbers));
    }

    @Test
    public void testWhenHCFISEighteen(){
        int[] numbers = {18,36,54,72};
        assertEquals(18, hcf.getHighestCommonFactor(numbers));
    }

    @Test
    public void testWhenLCMIS54() {
        int[] numbers = {18, 36, 54};
        assertEquals(108, hcf.getLowestCommonMultiple(numbers));
    }

    @Test
    public void testWhenLCMIs24(){
        int[] numbers = {6,8,12};
        assertEquals(24, hcf.getLowestCommonMultiple(numbers));
    }

    @Test
    public void testWhenLCMIs315(){
        int[] numbers = {5,7,9};
        assertEquals(315, hcf.getLowestCommonMultiple(numbers));
    }
}
