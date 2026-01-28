package chapterTwo;

import java.util.Scanner;

public class Multiples {

public static void main (String[]args) { 

Scanner input = new Scanner(System.in);

System.out.print("Enter first number: ");
int numberOne = input.nextInt();

System.out.print("Enter second number: ");
int numberTwo = input.nextInt();


int firstTripled = numberOne * numberOne * numberOne;
int secondDoubled = numberTwo * numberTwo;


if (firstTripled % secondDoubled == 0) {

System.out.println("The first number tripled is a multiple of the second number doubled");

} else {

System.out.println("The first number tripled is not a multiple the second number doubled");  

}

}
}