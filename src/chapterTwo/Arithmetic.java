package chapterTwo;

import java.util.Scanner;

public class Arithmetic{
public static void main (String[]args){
Scanner input = new Scanner(System.in);

System.out.print("Enter first Integer: ");
int numberOne = input.nextInt();

System.out.print("Enter second Integer: ");
int numberTwo = input.nextInt();

int squareOne = numberOne * numberOne;
int squareTwo = numberTwo * numberTwo;

int sumSquares = squareOne + squareTwo;
int diffSquares = squareOne - squareTwo;

System.out.println("The square of the first number is " + squareOne);
System.out.println("The square of the second number is " + squareTwo);
System.out.println("The sum of the squares is " + sumSquares);
System.out.println("The difference of the squares is " + diffSquares);

}

}