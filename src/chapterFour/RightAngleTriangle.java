package chapterFour;

import java.util.Scanner;
public class RightAngleTriangle{

	public static void main(String... args){

		Scanner input = new Scanner(System.in);

		System.out.print("Enter length of triangle: ");
		int length = input.nextInt();
		int index;

		for(int count = 1; count <= length; count++){
	
			for(index = 1; index <= count; index++){

				System.out.print("*");
			
			}

			System.out.println();
			index = 1;

		}

	}


}