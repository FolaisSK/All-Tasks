package chapterSix;

import java.util.Scanner;
public class Extremes{

	public static void main(String... args){

		Scanner input = new Scanner(System.in);

		System.out.print("Frequency: ");
		int frequency = input.nextInt();

		int number;
		int minimum = 100;
		int maximum = 0;

		for(int count = 1; count <= frequency; count++){

			System.out.print("Enter a number: ");
			number = input.nextInt();

			if(number > maximum){

				maximum = number;

			}

			if(number < minimum){

				minimum = number;

			}

		} 

		int sum = minimum + maximum;

		System.out.println("Min: " + minimum);
		System.out.println("Max: " + maximum);
		System.out.println("Sum: " + sum);

	}


}