package spaghetti;

import java.util.Scanner;

public class GratuityTotal {

public static void main (String[]args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter Subtotal: ");
double subTotal = input.nextDouble();

System.out.print("Enter Gratuity Rate: ");
double gratuityRate = input.nextDouble();

double gratuity = gratuityRate / 100 * subTotal;
double total = subTotal + gratuity;

System.out.println("The gratuity is $" + gratuity + " and total is " + total);

}

}

