package chapterFour;

import java.util.Scanner;
public class Palindromes{

	public static void main(String... args){

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a 5 digit number");
		int number = input.nextInt();

		if(number < 10000 || number > 99999){

			System.out.println("Invalid input");

		}else{

			int digitOne = number / 10000;
			int digitTwo = (number / 1000) % 10;
			int digitThree = (number / 100) % 10;
			int digitFour = (number / 10) % 10;
			int digitFive = number % 10;

			if(digitOne == digitFive && digitTwo == digitFour){

				System.out.println(true);

			}else{

				System.out.println(false);

			}

		}

	}



}