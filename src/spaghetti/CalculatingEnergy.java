package spaghetti;

import java.util.Scanner;

public class CalculatingEnergy {

public static void main (String[]args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter amount of water in kilograms: ");
double weightOfWater = input.nextDouble();

System.out.print("Enter the initial temperature: ");
double initialTemp = input.nextDouble();

System.out.print("Enter the final temperature: ");
double finalTemp = input.nextDouble();

double energy = weightOfWater * (finalTemp - initialTemp) * 4184;

System.out.println("The energy needed is " + energy + " joules.");

}

}

