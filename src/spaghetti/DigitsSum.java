package spaghetti;

import java.util.Scanner;

public class DigitsSum {

public static void main (String[]args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter a number between 0 and 1000: ");
int number = input.nextInt();

if (number > 99 && number < 1000) {

int digitOne = number / 100;
int digitTwo = (number / 10) % 10;
int digitThree = number % 10;

int sum = digitOne + digitTwo + digitThree;

System.out.println("The sum of the digits is " + sum);

} else if (number > 9 && number < 100) {

int digitOne = number / 10;
int digitTwo = number % 10;

int sum = digitOne + digitTwo;

System.out.println("The sum of the digits is " + sum);

} else {

System.out.println("The sum of the digits is " + number);

}

}

}

