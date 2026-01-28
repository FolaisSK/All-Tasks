package peacefulResolution;

import java.util.Scanner;

public class RangeFinder {

public static void main (String[]args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter Number: ");
int number = input.nextInt();

if (number > 1 && number < 100) {

System.out.println("In range");

} else {

System.out.println("Out of Range");

}

}

}

