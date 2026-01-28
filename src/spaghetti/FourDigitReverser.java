package spaghetti;

import java.util.Scanner;

public class FourDigitReverser {

public static void main (String[]args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter a four digit number: ");
int number = input.nextInt();

int digitOne = number / 1000;
int digitTwo = (number / 100) % 10;
int digitThree = (number / 10) % 10;
int digitFour = number % 10;

System.out.println("Reversed number is " + digitFour + digitThree + digitTwo + digitOne);

}

}



