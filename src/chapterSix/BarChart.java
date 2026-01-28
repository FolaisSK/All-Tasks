package chapterSix;

import java.util.Scanner;
public class BarChart{

	public static void main(String... args){

		Scanner input = new Scanner(System.in);

		System.out.println("--- Enter only numbers between 1 and 30 ---");
		System.out.print("Enter first number: ");
		int firstNumber = input.nextInt();

		System.out.print("Enter second number: ");
		int secondNumber = input.nextInt();

		System.out.print("Enter third number: ");
		int thirdNumber = input.nextInt();

		System.out.print("Enter fourth number: ");
		int fourthNumber = input.nextInt();

		System.out.print("Enter fifth number: ");
		int fifthNumber = input.nextInt();


		for(int count = 1; count <= firstNumber; count++){

			System.out.print("*");
		}

		System.out.println();

		for(int count = 1; count <= secondNumber; count++){

			System.out.print("*");
		}

		System.out.println();

		for(int count = 1; count <= thirdNumber; count++){

			System.out.print("*");
		}

		System.out.println();

		for(int count = 1; count <= fourthNumber; count++){

			System.out.print("*");
		}

		System.out.println();

		for(int count = 1; count <= fifthNumber; count++){

			System.out.print("*");
		}

		System.out.println();

	}


}