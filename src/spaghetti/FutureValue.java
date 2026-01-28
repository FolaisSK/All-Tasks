package spaghetti;

import java.util.Scanner;

public class FutureValue {

public static void main (String[]args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter the investment amount: ");
double investmentAmount = input.nextDouble();

System.out.print("Enter annual interest rate: ");
double annualInterestRate = input.nextDouble();

System.out.print("Enter number of years: ");
int numberOfYears = input.nextInt();

double monthlyInterestRate = annualInterestRate / 1200;

double futureInvestmentValue = investmentAmount * Math.pow(1 + monthlyInterestRate, numberOfYears * 12);

System.out.println("The future investment value is $" + futureInvestmentValue);


}

}


