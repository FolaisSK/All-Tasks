package chapterFour;

import java.util.Scanner;
public class LargestNumber{

	public static void main(String... args){

		Scanner input = new Scanner(System.in);
		int largest = 0;

		for(int count = 1; count <= 10; count++){
		
			System.out.print("Enter a number: ");
			int number = input.nextInt();

			if(number >= largest){

				largest = number;

			}

		}

		System.out.println(largest);

	}



}