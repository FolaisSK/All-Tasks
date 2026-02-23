package classTasks;

import java.util.ArrayList;

public class HCF {
    public int getSmallestNumber(int[] numbers){
        int smallest = numbers[0];
        for(int number : numbers){
            if(number < smallest) smallest = number;
        }
        return smallest;
    }

    public ArrayList<Integer> getFactors(int[] numbers){
        ArrayList<Integer> factors = new ArrayList<>();
        int smallestNumber = getSmallestNumber(numbers);
        int counter = 0;

        for(int i = 2; i < smallestNumber; i++){
            for(int index = 0; index < numbers.length; index++){
                if(numbers[index] % i == 0) counter++;
            }

            if(counter == numbers.length) factors.add(i);
            counter = 0;
        }

        return factors;
    }
}
