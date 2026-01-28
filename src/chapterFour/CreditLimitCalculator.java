package chapterFour;

import java.util.Scanner;
public class CreditLimitCalculator{

	public static void main(String... args){

		Scanner input = new Scanner(System.in);

		System.out.print("Account Number: ");
		int accountNumber = input.nextInt();

		System.out.print("Balance at the beginning of the month: ");
		int balance = input.nextInt();

		System.out.print("Total of all items charged by the customer this month: ");
		int charges = input.nextInt();

		System.out.print("Total of all credits applied to the customer’s account this month: ");
		int credits = input.nextInt();		

		System.out.print("Allowed Credit Limit: ");
		int creditLimit = input.nextInt();

		int newBalance = balance + charges - credits;

		System.out.println(newBalance);

		if(newBalance > creditLimit){System.out.println("CREDIT LIMIT EXCEEDED");}

	}


}