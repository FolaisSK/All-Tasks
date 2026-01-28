package chapterTwo;

import java.util.Scanner;

public class DigitSeparator {

public static void main (String[]args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter a five digit number: ");
int number = input.nextInt();

int digitOne = number / 10000;
int digitTwo = (number / 1000) % 10;
int digitThree = (number / 100) % 10;
int digitFour = (number / 10) % 10;
int digitFive = number % 10;

System.out.printf("%d   %d   %d   %d   %d%n", digitOne, digitTwo, digitThree, digitFour, digitFive);

}

}