package chapterFour;

import java.util.Scanner;
public class Factorial{

	public static void main(String... args){

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int number = input.nextInt();
		int factorial = 1;

		for(int count = number; count > 0; count--){

			factorial *= count;

		}

		System.out.println(factorial);

	}



}