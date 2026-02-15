package classTasks;

public class HighestCommonFactor {

    public  int getHighestCommonFactor(int[] numbers){
        int hcf = 0;
        int smallestNumber = getSmallestNumber(numbers);

        for(int count = smallestNumber; count > 0; count--){
            int numberCount = 0;

            for (int number : numbers) {
                if (number % count == 0) {
                    hcf = count;
                    numberCount++;
                }
            }
            if(numberCount == numbers.length) break;
        }
        return hcf;
    }

    public static int getSmallestNumber(int[] numbers){
        int smallest = numbers[0];
        for (int number : numbers) {
            if (number < smallest) smallest = number;
        }
        return smallest;
    }

    public static int getLargestNumber(int[] numbers){
        int largest = numbers[0];
        for (int number : numbers) {
            if (number > largest) largest = number;
        }
        return largest;
    }

    public int getLowestCommonMultiple(int[] numbers) {
        int largestNumber = getLargestNumber(numbers);
        int lcm = 1;
        int elementCounter = 0;

        if (getHighestCommonFactor(numbers) == 1) {
            for (int number : numbers) {
                lcm *= number;
            }
            return lcm;
        }

        while (elementCounter != numbers.length) {
            elementCounter = 0;
            for (int number : numbers) {
                if (largestNumber % number == 0) {
                    lcm = largestNumber;
                    elementCounter++;
                }
            }
            if (elementCounter != numbers.length) largestNumber += largestNumber;
        }

        return lcm;
    }

}
