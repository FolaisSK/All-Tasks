package softTasksDayOne;

import java.util.Arrays;
public class Task{

	public static void main(String... args){

		int[] arr = {0, -6,-7,9,1,0,0};
		int[] numbers = {3,6,9,4,6,-7};

		System.out.println(Arrays.toString(getAscendingSquareOf(arr)));

	}



	public static int[] getAscendingSquareOf(int[] numbers){

		int[] squares = new int[numbers.length];

		
		int swap = 0;

		for(int count = 0; count < numbers.length; count++){

			for(int index = 0; index < numbers.length; index++){

				if(numbers[index] > numbers[count]){

					swap = numbers[count];
					numbers[count] = numbers[index];
					numbers[index] = swap;

				}

			}

		}

		for(int count = 0; count < numbers.length; count++){

			squares[count] = numbers[count] * numbers[count];

		}

		return squares;

	}


}