package peacefulResolution;

import java.util.Scanner;

public class TemperatureReader {

public static void main (String[]args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter today's Temperature: ");
double temp = input.nextDouble();

if (temp < 15) {

System.out.println("Cold");

} else if (temp > 15 && temp < 30) {

System.out.println("Warm");

}

else {

System.out.println("Hot");

}

}

}


