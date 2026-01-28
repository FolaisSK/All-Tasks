package sofTasksDayTwo;

public class LargestSum{


	public static void main(String... args){

		int[][] numbers = {{2,3,4}, {5,6,5}, {4,9,2,10}};

		System.out.println(getLargestSum(numbers));

	}


	public static int[] getSumsOf(int[][] numbers){

		int total = 0;
		int[] sums = new int[numbers.length];
		
		for(int count = 0; count < numbers.length; count++){

			for(int index = 0; index < numbers[count].length; index++){

				total += numbers[count][index];

			}

			sums[count] = total;
			total = 0;

		}

		return sums;

	}


	public static int getLargestSum(int[][] numbers){

		int[] totals = getSumsOf(numbers);
		int largest = totals[0];

		for(int count = 0; count < totals.length; count++){

			if(totals[count] > largest){

				largest = totals[count];

			}

		}

		return largest;

	}



}