package spaghetti;

import java.util.Scanner;

public class SumOfEvenAndOdd {

public static void main (String[]args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter 7 integers: ");
int numOne = input.nextInt();
int numTwo = input.nextInt();
int numThree = input.nextInt();
int numFour = input.nextInt();
int numFive = input.nextInt();
int numSix = input.nextInt();
int numSeven = input.nextInt();

int even = 0;
int odd = 0;

if (numOne % 2 == 0) {

even = even + numOne;

} else {

odd = odd + numOne;

}

if (numTwo % 2 == 0) {

even = even + numTwo;

} else {

odd = odd + numTwo;

}

if (numThree % 2 == 0) {

even = even + numThree;

} else {

odd = odd + numThree;

}

if (numFour % 2 == 0) {

even = even + numFour;

} else {

odd = odd + numFour;

}

if (numFive % 2 == 0) {

even = even + numFive;

} else {

odd = odd + numFive;

}

if (numSix % 2 == 0) {

even = even + numSix;

} else {

odd = odd + numSix;

}

if (numSeven % 2 == 0) {

even = even + numSeven;

} else {

odd = odd + numSeven;

}

System.out.println("The sum of the even numbers are " + even);
System.out.println("The sum of the odd numbers are " + odd);

}

}

