package chapterFour;

import java.util.Scanner;
public class TaxCalculator{

	public static void main(String... args){

		Scanner input = new Scanner(System.in);
		float taxRate = 0.0f;

		for(int count = 1; count <= 3; count++){

			System.out.print("Citizen Name: ");
			String name = input.nextLine();

			System.out.print("Annual Earnings: ");
			int earning = input.nextInt();
			input.nextLine();
		
			if(earning < 0){

				System.out.println("Invalid entry");
				break;

			}else if(earning <= 30000){

				taxRate = 0.15f * earning;

			}else{

				taxRate = 0.20f * earning;

			}

			System.out.println("Citizen's Total Tax: " + taxRate);
		}
	
	}


}