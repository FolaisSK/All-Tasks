package spaghetti;

import java.util.Scanner;

public class NewtonEquationOfMotion {

public static void main (String[]args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter the initial velocity u in meters/second: ");
double u = input.nextDouble();

System.out.print("Enter acceleration a in meters/second2: ");
double a = input.nextDouble();

System.out.print("Enter the time span t in seconds: ");
int t = input.nextInt();

double s = u * t + 0.5 * a * (t * t);


System.out.println("The distance covered is: " + s);



}

} 
