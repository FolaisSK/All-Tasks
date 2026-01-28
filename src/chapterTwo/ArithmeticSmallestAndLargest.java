package chapterTwo;

import java.util.Scanner;

public class ArithmeticSmallestAndLargest{
public static void main (String[]args){
Scanner input = new Scanner(System.in);

System.out.print("Enter first Integer: ");
int numberOne = input.nextInt();

System.out.print("Enter second Integer: ");
int numberTwo = input.nextInt();

System.out.print("Enter third Integer: ");
int numberThree = input.nextInt();

int sum = numberOne + numberTwo + numberThree;
int average = sum / 3;
int product = numberOne * numberTwo * numberThree;

System.out.println("The sum is " + sum);
System.out.println("The average is " + average);
System.out.println("The product is " + product);


if (numberOne > numberTwo && numberOne > numberThree) {

System.out.println("The largest number is " + numberOne);

} else if (numberTwo > numberThree && numberTwo > numberOne) {

System.out.println("The largest number is " + numberTwo);

} else if (numberThree > numberOne && numberThree > numberOne){

System.out.println("The largest number is " + numberThree);

} else {

System.out.println("The numbers are all equal");

}


if (numberOne < numberTwo && numberOne < numberThree) {

System.out.println("The smallest number is " + numberOne);

} else if (numberTwo < numberThree && numberTwo < numberOne) {

System.out.println("The smallest number is " + numberTwo);

} else if (numberThree < numberOne && numberOne < numberThree){

System.out.println("The smallest number is " + numberThree);

} else {

System.out.println("The numbers are all equal");

}





}

}