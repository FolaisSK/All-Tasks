package chapterFour;

import java.util.Scanner;
public class SalesCommissionCalculator{

	public static void main(String... args){

		Scanner input = new Scanner(System.in);

		int stop = 1;
		float grossSales = 0;
		float commission = 0;

		while(stop != 0){

			System.out.print("Item Number: ");
			int item = input.nextInt();

			System.out.print("Value: ");
			float value = input.nextFloat();

			grossSales += value; 

			System.out.print("Enter (0) to stop operation: ");
			stop = input.nextInt();

		}

		commission = 200f + 0.09f * grossSales;

		System.out.println("Salesperson's earnings = " + commission);

	}	


}