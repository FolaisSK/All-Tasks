package chapterFour;

import java.util.Scanner;
public class SumToTarget{

	public static void main(String... args){

		Scanner input = new Scanner(System.in);

		System.out.print("Target Number: ");
		int target = input.nextInt();
		int sum = 0;

		while(target > sum){

			System.out.print("Enter a number: ");
			int number = input.nextInt();

			sum += number;
			
		}

		System.out.println("Done!");

	}


}