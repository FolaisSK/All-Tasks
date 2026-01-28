package spaghetti;

import java.util.Scanner;
public class AverageAcceleration {
public static void main (String[]args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter starting velocity in m/s: ");
double v0 = input.nextDouble();
System.out.print("Enter ending velocity in m/s: ");
double v1 = input.nextDouble();
System.out.print("Enter the time span in seconds: ");
int t = input.nextInt();

double a = (v1 - v0) / t;

System.out.println("The average acceleration is " + a);

}

}

