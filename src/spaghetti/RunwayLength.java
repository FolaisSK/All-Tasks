package spaghetti;

import java.util.Scanner;
public class RunwayLength {
public static void main (String[]args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter velocity in m/s: ");
double velocity  = input.nextDouble();
System.out.print("Enter acceleration in m/s2: ");
double acceleration  = input.nextDouble();

double length = (velocity * velocity) / (2 * acceleration);

System.out.println("The minimum runway length for this airplane is " + length);

}

}

