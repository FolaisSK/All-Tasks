package softTasksDayOne;

import java.util.Arrays;

public class LargestAndSmallest{

	public static void main(String... args){

		int[][] numbers = {{5,6}, {7,1}, {3,2}};

		System.out.println(Arrays.deepToString(getLargestAndSmallestPosition(numbers)));

	}
		


	public static int[] getLargestPosition(int[][] numbers){

		int[] largestPosition = new int[2];
		int largest = numbers[0][0];

		for(int count = 0; count < numbers.length; count++){

			for(int index = 0; index < numbers[0].length; index++){

				if(numbers[count][index] > largest){

					largest = numbers[count][index];

					largestPosition[0] = count;
					largestPosition[1] = index;

				}

			}

		}

		return largestPosition;

	}


	public static int[] getSmallestPosition(int[][] numbers){

		int[] smallestPosition = new int[2];
		int smallest = numbers[0][0];

		for(int count = 0; count < numbers.length; count++){

			for(int index = 0; index < numbers[0].length; index++){

				if(numbers[count][index] < smallest){

					smallest = numbers[count][index];

					smallestPosition[0] = count;
					smallestPosition[1] = index;

				}

			}

		}

		return smallestPosition;

	}


	public static int[][] getLargestAndSmallestPosition(int[][] numbers){

		int[][] positions = new int[2][2];

		positions[0] = getLargestPosition(numbers);
		positions[1] = getSmallestPosition(numbers);

		return positions;

	}



}