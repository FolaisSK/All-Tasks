package spaghetti;

import java.util.Scanner;
public class CalculatingBMI {
public static void main (String[]args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter weight in pounds: ");
double weightPounds = input.nextDouble();
System.out.print("Enter height in inches: ");
double heightInches = input.nextDouble();

double weightKilograms = weightPounds * 0.45359237;
double heightMeters = heightInches * 0.0254;

double bodyMassIndex = weightKilograms / (heightMeters * heightMeters);

System.out.println("BMI is " + bodyMassIndex);

}

}

