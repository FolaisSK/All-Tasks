package chapterFour;

import java.util.Scanner;
public class LargestAndSecondLargest{

	public static void main(String... args){

		Scanner input = new Scanner(System.in);
		int largest = 0;
		int secondLargest =0;

		for(int count = 1; count <= 4; count++){
		
			System.out.print("Enter a number: ");
			int number = input.nextInt();

			if(number >= largest){

				secondLargest = largest;
				largest = number;

			}
	
			if(number > secondLargest && number != largest){

				secondLargest = number;

			}

		}

		System.out.println("Largest: " + largest);
		System.out.println("Second Largest: " + secondLargest);


	}



}