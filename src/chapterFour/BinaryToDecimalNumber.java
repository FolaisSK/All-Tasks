package chapterFour;

import java.util.Scanner;
public class BinaryToDecimalNumber{

	public static void main(String... args){

		Scanner input = new Scanner(System.in);

		int multiple = 1;
		int sum = 0;
	
		System.out.print("Enter Binary Number: ");
		int number = input.nextInt();

		while(number != 0){

			int digit = number % 10;
			number = number / 10;
			
			sum += digit * multiple;
			multiple *= 2;
			
		}

		System.out.println("Decimal Value: " + sum);

	}



}