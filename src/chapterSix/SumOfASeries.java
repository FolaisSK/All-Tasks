package chapterSix;

import java.util.Scanner;
public class SumOfASeries{

	public static void main(String... args){

		Scanner input = new Scanner(System.in);

		System.out.print("Enter number of terms: ");
		int noOfTerms = input.nextInt();

		long sum = 0;
		
		for(int count = 1; count <= noOfTerms; count++){

			sum += count;

		}

		System.out.println(sum);
	}



}