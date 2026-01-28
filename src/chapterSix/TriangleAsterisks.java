package chapterSix;

import java.util.Scanner;
public class TriangleAsterisks{

	public static void main(String... args){

		Scanner input = new Scanner(System.in);


		System.out.print("Enter length of triangle: ");
		int length = input.nextInt();

		for(int count = 1; count <= length; count++){

			for(int index = 1; index <= count; index++){

				System.out.print("*");

			}

			System.out.println();
		}

		System.out.println();







		for(int count = length; count > 0; count--){

			for(int index = count; index > 0; index--){

				System.out.print("*");

			}

			System.out.println();

		}

			System.out.println();








		for(int count = length; count > 0; count--){

			for(int space = 1; space <= length - 1; space++){

				System.out.print(" ");
			}

			for(int index = count; index > 0; index--){

				System.out.print("*");

			}

			System.out.println();

		}

	}



}