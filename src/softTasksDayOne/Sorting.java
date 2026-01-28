package softTasksDayOne;

import java.util.Arrays;
public class Sorting{


	public static void main(String... args){

		int[] arr = {0,0-6,-7,9,1,0,0};

		System.out.println(Arrays.toString(sortNumbers(arr)));

	}



	public static int[] getSortedNumbers(int[] numbers){

		int index;

		for(int count = 0; count < numbers.length; count++){

			for(index = 0; index < numbers.length; index++){

				if(numbers[index] > numbers[count]){

					//numbers[count] = numbers[index];
					numbers[index] = numbers[count];		

				}

			}

			numbers[count] = numbers[index];

		}

		return numbers;

	}



	public static int[] sortNumbers(int[] numbers){

		int sum;

		for(int count = 0; count < numbers.length - 1; count++){

			for(int index = 0; index < numbers.length - count - 1; index++){

				if(numbers[index] > numbers[index + 1]){

					numbers[index] = numbers[index] + numbers[index + 1];
					numbers[index + 1] = numbers[index] - numbers[index + 1];
					numbers[index] = numbers[index] - numbers[index + 1];
				}

			}
	
		}

		return numbers;

	}




	public static int[] getSquareOf(int[] numbers){

		int[] squares = new int[numbers.length];

		for(int count = 0; count < numbers.length; count++){

			squares[count] = numbers[count] * numbers[count];

		}

		return squares;

	}







}