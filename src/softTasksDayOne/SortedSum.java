package softTasksDayOne;

import java.util.Arrays;
public class SortedSum{

	public static void main(String... args){

		int[][] numbers = {{5,6}, {7,1}, {3,2}};

		System.out.println(Arrays.toString(getSortedNumbers(numbers)));

	}


	public static int[] getSumOf(int[][] numbers){

		int[] sum = new int[numbers.length];
		int total = 0;

		for(int count = 0; count < numbers.length; count++){

			for(int index = 0; index < numbers[0].length; index++){

				total += numbers[count][index];

			}

			sum[count] = total;
			total = 0;

		}

		return sum;

	}


	public static int[] getSortedNumbers(int[][] numbers){

		int[] sum = getSumOf(numbers);

		int swap = 0;

		for(int count = 0; count < sum.length; count++){

			for(int index = 0; index < sum.length; index++){

				if(sum[index] > sum[count]){

					swap = sum[count];
					sum[count] = sum[index];
					sum[index] = swap;

				}

			}

		}

		return sum;

	}



}