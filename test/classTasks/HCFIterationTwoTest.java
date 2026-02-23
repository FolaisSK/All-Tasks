package classTasks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class HCFIterationTwoTest {
    HCF hcf;

    @BeforeEach
    public void initialState(){hcf = new HCF();}

    @Test
    public void testOne(){
        int[] arr = {4,6,8};
        ArrayList<Integer> solution = hcf.getFactors(arr);
        //System.out.println(solution);

        Object[] array = solution.toArray();
        Object[] test = {2};
        assertArrayEquals(test, array);
    }

    @Test
    public void testTwo(){
        int[] arr = {18,12,6};
        ArrayList<Integer> solution = hcf.getFactors(arr);
        //System.out.println(solution);

        Object[] array = (hcf.getFactors(arr)).toArray();
        Object[] test = {2,3};
        assertArrayEquals(test, array);
    }

    @Test
    public void testThree(){
        int[] arr = {18,12,9};
        Object[] array = (hcf.getFactors(arr)).toArray();
        Object[] test = {3};
        assertArrayEquals(test, array);
    }
}
