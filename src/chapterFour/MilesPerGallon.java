package chapterFour;

import java.util.Scanner;
public class MilesPerGallon{

	public static void main(String[]args){

		Scanner input = new Scanner(System.in);
		int stop = 1;

		while(stop != 0){

			System.out.print("Enter miles driven: ");
			int miles = input.nextInt(); 

			System.out.print("Enter gallons used: ");
			int gallons = input.nextInt();

			double milesPerGallon = miles / gallons;
			System.out.println(milesPerGallon);

			System.out.print("Enter (0) to stop operation: ");
			stop = input.nextInt();
		
		}

	}
}