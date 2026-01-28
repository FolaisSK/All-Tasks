package chapterFour;

import java.util.Scanner;
public class Comparator{

	public static void main(String... args){

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int firstNumber = input.nextInt();

		System.out.print("Enter a number: ");
		int secondNumber = input.nextInt();

		if(firstNumber == secondNumber){

			System.out.println("0");

		}else if(firstNumber > secondNumber){

			System.out.println("1");

		}else{

			System.out.println("-1");

		}

	}


}