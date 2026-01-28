package chapterTwo;

import java.util.Scanner;

public class ComparingIntegers {

public static void main (String[]args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter Integer: ");
int integer = input.nextInt();

int square = integer * integer;

if (integer == 100 && square == 100) {

System.out.printf("%d and %d == 100", integer, square);

}


if (integer > 100 && square > 100) {

System.out.printf("%d and %d > 100", integer, square);

}


if (integer < 100 && square < 100) {

System.out.printf("%d and %d < 100", integer, square);

}


if (integer != 100 && square != 100) {

System.out.printf("%d and %d != 100", integer, square);

}

}

}